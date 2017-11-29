package com.themastergeneral.ctdtweaks.proxy.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class CreativeTab extends CreativeTabs {

	public CreativeTab() {
		super(CTDTweaks.MODID);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.corecombat; // shown icon on creative tab
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}

}
