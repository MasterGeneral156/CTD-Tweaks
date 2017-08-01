package com.themastergeneral.ctdtweaks.items.baubles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class RingHaste extends BasicRing {

	public RingHaste(String name, String modid) 
	{
		super(name, modid);
	}
	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) 
	{
		entity.addPotionEffect(new PotionEffect(MobEffects.HASTE, 20, 2, true, false));
	}
}