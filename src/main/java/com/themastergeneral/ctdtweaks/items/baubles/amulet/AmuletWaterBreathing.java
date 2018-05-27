package com.themastergeneral.ctdtweaks.items.baubles.amulet;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.themastergeneral.ctdtweaks.items.baubles.BasicAmulet;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;

public class AmuletWaterBreathing extends BasicAmulet {

	public AmuletWaterBreathing(String name, String modid) {
		super(name, modid);
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20,
				9, true, false));
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn,
			List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(1, "Allows breathing underwater.");
	}
}