package com.themastergeneral.ctdtweaks.items.baubles;

import net.minecraft.item.ItemStack;
import baubles.api.BaubleType;

public class BasicAmulet extends BasicBauble {

	public BasicAmulet(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

}
