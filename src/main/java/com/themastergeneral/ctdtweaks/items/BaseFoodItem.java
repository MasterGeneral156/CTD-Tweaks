package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BaseFoodItem extends CTDItem {

	public BaseFoodItem(int hungerFed, float saturation) {
		super(new Item.Properties().tab(CTDTweaks.CreativeTab)
				.food(new FoodProperties.Builder().nutrition(hungerFed).saturationMod(saturation).build()));
	}

}
