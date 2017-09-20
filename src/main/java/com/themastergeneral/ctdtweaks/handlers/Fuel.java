package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class Fuel implements IFuelHandler {
	public int getBurnTime(ItemStack fuel) {
		Item var1 = fuel.getItem();
		if (var1 == Item.getItemFromBlock(ModBlocks.fuelwitherblock)) {
			return Config.witherFuelBurn * 10;
		} else if (var1 == ModItems.fuelwither) {
			return Config.witherFuelBurn;
		} else {
			return 0;
		}
	}
}
