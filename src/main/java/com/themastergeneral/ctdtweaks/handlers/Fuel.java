package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class Fuel implements IFuelHandler {
	public int getBurnTime(ItemStack fuel) {
		Item var1 = fuel.getItem();
		if (var1 == Item.getItemFromBlock(ModBlocks.fuelwitherblock)) {
			return 100000;
		} else if (var1 == ModItems.fuelwither) {
			return 10000;
		} else {
			return 0;
		}
	}
}
