package com.themastergeneral.ctdtweaks.items.baubles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdtweaks.items.BasicItem;

import baubles.api.BaubleType;
import baubles.api.IBauble;

public class BasicBauble extends BasicItem implements IBauble {

	public BasicBauble(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.TRINKET;
	}

}
