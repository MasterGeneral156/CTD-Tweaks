package com.themastergeneral.ctdtweaks.items.baubles;

import net.minecraft.item.ItemStack;
import baubles.api.BaubleType;

public class BasicAmulet extends BasicBauble {

	public BasicAmulet(String name, String modid) {
		super(name, modid);
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

}
