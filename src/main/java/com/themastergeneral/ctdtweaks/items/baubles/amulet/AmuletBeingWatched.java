package com.themastergeneral.ctdtweaks.items.baubles.amulet;

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdtweaks.items.baubles.BasicAmulet;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AmuletBeingWatched extends BasicAmulet {

	public AmuletBeingWatched(String name) {
		super(name);
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20,
				9, true, false));
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn,
			List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("You will be seen.");
	}
}
