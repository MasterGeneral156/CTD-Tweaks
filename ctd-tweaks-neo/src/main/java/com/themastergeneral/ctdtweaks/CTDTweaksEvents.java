package com.themastergeneral.ctdtweaks;

import com.themastergeneral.ctdcore.helpers.EntityHelper;
import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdtweaks.registries.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;
import org.apache.http.util.EntityUtils;

public class CTDTweaksEvents {
    @SubscribeEvent
    public static void onUseItemOnBlock(UseItemOnBlockEvent event) {

        if (event.getUsePhase() != UseItemOnBlockEvent.UsePhase.BLOCK) return;

        UseOnContext context = event.getUseOnContext();

        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        BlockState state = level.getBlockState(pos);

        if (stack.is(Items.GOLD_INGOT) && state.is(Blocks.BOOKSHELF)) {
            if (!level.isClientSide) {
                assert player != null;
                if (!player.getCooldowns().isOnCooldown(stack.getItem())) {
                    if (player.experienceLevel < 1)
                        player.displayClientMessage(ModUtils.displayTranslation("ctdtweaks.enchantedgold.no_xp"), true);
                    else {
                        player.giveExperienceLevels(-1);
                        stack.shrink(1);
                        player.getInventory().add(new ItemStack(ItemRegistry.enchanted_gold_ingot.get()));
                        player.getCooldowns().addCooldown(stack.getItem(), 100);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {

        Player player = event.getEntity();
        if (EntityHelper.isMasterGeneral(player)) {
            player.sendSystemMessage(ModUtils.displayString("Greetings and welcome, master..."));
        }
    }
}
