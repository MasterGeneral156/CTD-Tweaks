package com.themastergeneral.ctdtweaks.items.baubles;

import baubles.api.BaubleType;

import com.themastergeneral.ctdtweaks.items.BasicItem;

import net.minecraft.item.ItemStack;

public class BasicRing extends BasicBauble {

	public BasicRing(String name, String modid) {
		super(name, modid);
		this.maxStackSize = 1;
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.RING;
	}
}
