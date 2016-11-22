package com.themastergeneral.ctdtweaks.items;

import baubles.api.BaubleType;
import net.minecraft.item.ItemStack;

public class BasicRing extends BasicBauble {

	public BasicRing(String name) 
	{
		super(name);
	}
	@Override
	public BaubleType getBaubleType(ItemStack arg0) 
	{
		return BaubleType.RING;
	}

}
