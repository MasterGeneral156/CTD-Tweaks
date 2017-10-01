package com.themastergeneral.ctdtweaks.proxy.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class CreativeTab extends CreativeTabs {

	public CreativeTab() {
		super(Main.MODID);
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
