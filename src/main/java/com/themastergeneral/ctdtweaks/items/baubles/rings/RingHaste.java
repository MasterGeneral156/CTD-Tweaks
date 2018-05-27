package com.themastergeneral.ctdtweaks.items.baubles.rings;

import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class RingHaste extends BasicRing {

	public RingHaste(String name) {
		super(name);
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.HASTE, 20,
				Config.hasteringmodifier - 1, true, false));
	}
}