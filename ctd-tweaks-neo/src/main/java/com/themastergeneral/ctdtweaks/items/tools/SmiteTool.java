package com.themastergeneral.ctdtweaks.items.tools;

import com.themastergeneral.ctdcore.helpers.CTDConstants;
import com.themastergeneral.ctdcore.item.CTDDurabilityItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Objects;

public class SmiteTool extends CTDDurabilityItem {
    public SmiteTool(int durability) {
        super(durability);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Level level = target.level();

        if (!level.isClientSide) {
            if (attacker instanceof Player player) {
                if (!player.getCooldowns().isOnCooldown(this)) {
                    EquipmentSlot slot = player.getUsedItemHand() == InteractionHand.MAIN_HAND
                            ? EquipmentSlot.MAINHAND
                            : EquipmentSlot.OFFHAND;

                    LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(level);
                    lightningBolt.setPos(target.getX(), target.getY(), target.getZ());

                    level.addFreshEntity(lightningBolt);
                    player.getCooldowns().addCooldown(this, 1200);
                    stack.hurtAndBreak(1, player, slot);
                }
            }
        }
        return true;
    }
}
