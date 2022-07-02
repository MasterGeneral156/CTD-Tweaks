package com.themastergeneral.ctdtweaks;

import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CTDTweaksTab extends CreativeModeTab {

	public CTDTweaksTab() {
		super("ctdtweaks");
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ModItems.coal_wither);
	}

}
