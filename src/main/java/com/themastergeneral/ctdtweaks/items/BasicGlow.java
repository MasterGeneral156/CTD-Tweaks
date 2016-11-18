package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasicGlow extends BasicItem 
{
	public BasicGlow(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) 
	{
	     par1ItemStack.setTagInfo("ench", new NBTTagList());
	     return true;
	}
}
