package com.themastergeneral.crdtweaks.items.curios.artifacts;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdcore.item.CTDItem;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nullable;
import java.util.List;

public class CobbleGenItem extends CTDItem implements ICurioItem
{

    public CobbleGenItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected)
    {
        doCobbleGen(stack, level, entity);
    }

    private void doCobbleGen(ItemStack stack, Level level, Entity entity)
    {
        if (!level.isClientSide)
        {
            if (entity instanceof Player player)
            {
                if (!player.isCreative())
                {
                    if (doChecks(player))
                        genCobble(player, stack);
                }
                else
                    genCobble(player, stack);
            }
        }
    }

    private boolean doChecks(Player player)
    {
        int lava = player.getInventory().countItem(Items.LAVA_BUCKET);
        int water = player.getInventory().countItem(Items.WATER_BUCKET);
        int cobble = player.getInventory().countItem(Blocks.COBBLESTONE.asItem());

        if (lava == 0)
            return false;
        else if (water == 0)
            return false;
        else return cobble < 64;
    }

    private void genCobble(Player player, ItemStack stack)
    {
        if (!player.getCooldowns().isOnCooldown(stack.getItem())) {
            player.addItem(new ItemStack(Blocks.COBBLESTONE));
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getCooldowns().addCooldown(stack.getItem(), 20);
        }
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack)
    {
        Entity wearer = slotContext.entity();
        doCobbleGen(stack, wearer.level(), wearer);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(
                ModUtils.displayTranslation("item.ctdtweaks.pocket_cobble_generator.desc")
        );
    }
}
