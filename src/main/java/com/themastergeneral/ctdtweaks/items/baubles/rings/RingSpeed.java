package com.themastergeneral.ctdtweaks.items.baubles.rings;

import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class RingSpeed extends BasicRing {
	public RingSpeed(String name) {
		super(name);
	}

	@Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase entity)
    {
        double currentSpeed = entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
        entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(currentSpeed + 0.1D);
    }
	
	@Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase entity)
    {
		double currentSpeed = entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
        entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(currentSpeed - 0.1D);
    }
}
