package com.themastergeneral.ctdtweaks.items.baubles.rings;

import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class RingSpeed extends BasicRing {
	public RingSpeed(String name) {
		super(name);
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20,
				Config.speedringmodifier - 1, true, false));
	}
}
