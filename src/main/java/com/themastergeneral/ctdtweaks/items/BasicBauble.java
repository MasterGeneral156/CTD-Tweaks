package com.themastergeneral.ctdtweaks.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import baubles.api.IBauble;

public abstract class BasicBauble extends BasicItem implements IBauble {

	public BasicBauble(String name, String modid) 
	{
		super(name, modid);
	}
	@Override
	public boolean canEquip(ItemStack stack, EntityLivingBase player) 
	{
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack stack, EntityLivingBase player) 
	{
		return true;
	}

}
