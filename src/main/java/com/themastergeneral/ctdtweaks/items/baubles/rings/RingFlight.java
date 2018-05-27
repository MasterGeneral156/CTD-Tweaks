package com.themastergeneral.ctdtweaks.items.baubles.rings;

import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class RingFlight extends BasicRing {
	public RingFlight(String name) {
		super(name);
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase entity) {
		EntityPlayer player = (EntityPlayer) entity;
		player.capabilities.allowFlying = true;
	}

	@Override
	public void onUnequipped(ItemStack stack, EntityLivingBase entity) {
		EntityPlayer player = (EntityPlayer) entity;
		player.capabilities.isFlying = player.capabilities.isCreativeMode ? true
				: false;
		player.capabilities.allowFlying = player.capabilities.isCreativeMode ? true
				: false;
	}
}
