package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Item item = fuel.getItem();
		if (item == ModItems.fuelwither)
			return Config.witherFuelBurn;
		else if (item == Item.getItemFromBlock(ModBlocks.fuelwitherblock))
			return Config.witherFuelBurn*10;
		else
			return 0;
	}

}
