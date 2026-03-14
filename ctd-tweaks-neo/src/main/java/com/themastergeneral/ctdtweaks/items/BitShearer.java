package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDDurabilityItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class BitShearer extends CTDDurabilityItem {
    public BitShearer(int durability) {
        super(new Properties().setNoRepair().stacksTo(1), durability);
    }

    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    }
}
