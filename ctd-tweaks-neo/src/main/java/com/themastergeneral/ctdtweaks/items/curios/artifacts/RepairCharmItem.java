package com.themastergeneral.ctdtweaks.items.curios.artifacts;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdcore.item.CTDItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class RepairCharmItem extends CTDItem implements ICurioItem {

    public RepairCharmItem()
    {
        super(new Properties().stacksTo(1));
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack)
    {
        LivingEntity wearer = slotContext.entity();
        if (wearer instanceof Player player)
            doRepairTick(stack, player);
    }

    private void doRepairTick(ItemStack stack, Player player)
    {
        if (!player.getCooldowns().isOnCooldown(this.asItem()))
        {
            int slotID = -1;
            for (int i = 0; i < player.getInventory().getContainerSize(); ++i) {
                ItemStack itemstack1 = player.getInventory().getItem(i);
                if (itemstack1.isDamaged() && itemstack1.isRepairable()) {
                    slotID = i;
                    break;
                }
            }
            if (slotID > -1) {
                ItemStack itemstack1 = player.getInventory().getItem(slotID);
                itemstack1.setDamageValue(itemstack1.getDamageValue() - 1);
                player.getCooldowns().addCooldown(this.asItem(), 20);
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected)
    {
        if (entity instanceof Player player)
            doRepairTick(stack, player);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(
                ModUtils.displayTranslation("item.ctdtweaks.repair_charm.desc")
        );
    }
}
