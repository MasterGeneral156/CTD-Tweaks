package com.themastergeneral.ctdtweaks.items.rings;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

import com.themastergeneral.ctdtweaks.items.BasicRing;

public class RingSpeed extends BasicRing {

	public RingSpeed(String name) 
	{
		super(name);
	}
	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) 
	{
		entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2, true, false));
	}

}
