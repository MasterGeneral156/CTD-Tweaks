package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.imc.Enderfuge;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class EnderfugeFuel {
	public static void init() {
		Enderfuge.addFuel(new ItemStack(ModBlocks.fuelwitherblock),
				Config.witherFuelBurn);
		Enderfuge.addFuel(new ItemStack(ModItems.fuelwither),
				Config.witherFuelBurn / 10);
	}
}
