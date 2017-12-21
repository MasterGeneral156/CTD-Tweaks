package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.imc.enderfuge.IMEEnderfuge;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class EnderfugeFuel {
	public static void init()
	{
		IMEEnderfuge.addEnderfugeFuel(new ItemStack(ModItems.fuelwither), Config.witherFuelBurn/10);
		IMEEnderfuge.addEnderfugeFuel(new ItemStack(ModBlocks.fuelwitherblock), Config.witherFuelBurn);
	}
}
