package com.themastergeneral.ctdtweaks.integration.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

@mezz.jei.api.JEIPlugin
public class JEICTDTweaksPlugin extends BlankModPlugin 
{
	@Override
	public void register(@Nonnull IModRegistry registry) 
	{
		if (Config.disableJei == false)
		{
			registry.addDescription(new ItemStack(ModItems.corecombat), "jei.corecombat.info");
			registry.addDescription(new ItemStack(ModItems.glowingamulet), "jei.amulet.info");
			registry.addDescription(new ItemStack(ModItems.fuelwither), "jei.fuelwither.info");
			registry.addDescription(new ItemStack(ModBlocks.fuelwitherblock), "jei.fuelwither.info");
			registry.addDescription(new ItemStack(ModItems.goodbyeboots), "jei.boots.info");
			registry.addDescription(new ItemStack(ModItems.nightvision), "jei.nightvision.info");
			registry.addDescription(new ItemStack(ModItems.coreglowing), "jei.coreglowing.info");
			registry.addDescription(new ItemStack(ModItems.enchantedgoldingot), "jei.enchantedgold.info");
		}
	}
}
