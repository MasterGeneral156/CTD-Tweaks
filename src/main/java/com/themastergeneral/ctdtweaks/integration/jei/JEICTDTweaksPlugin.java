package com.themastergeneral.ctdtweaks.integration.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.item.ItemStack;

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
			registry.addDescription(new ItemStack(ModItems.corecombat), "The combat core will make it easier to automate boss drops, such as nether stars and dragon eggs. Note that this item has " + Config.coreCombatDurability + " uses.");
			registry.addDescription(new ItemStack(ModItems.glowingamulet), "When you wear this amulet, it'd be pretty hard to not see you.");
			registry.addDescription(new ItemStack(ModItems.fuelwither), "A piece of coal infused with the powers of the Wither.");
			registry.addDescription(new ItemStack(ModItems.goodbyeboots), "Be outside when you put these on.");
		}
		else
		{
			
		}
	}
}
