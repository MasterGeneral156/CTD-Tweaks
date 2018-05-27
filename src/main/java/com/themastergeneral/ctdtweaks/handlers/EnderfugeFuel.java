package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.imc.IMCHelper;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class EnderfugeFuel {
	public static void init() {
		IMCHelper.addEnderfugeFuel(new ItemStack(ModBlocks.fuelwitherblock),
				(Config.witherFuelBurn / 4) * 10);
		IMCHelper.addEnderfugeFuel(new ItemStack(ModItems.fuelwither),
				Config.witherFuelBurn / 4);
	}
}
