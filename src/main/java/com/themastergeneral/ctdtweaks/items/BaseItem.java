package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.item.Item;

public class BaseItem extends CTDItem {

	public BaseItem() {
		super(new Item.Properties().tab(CTDTweaks.CreativeTab));
	}
}
