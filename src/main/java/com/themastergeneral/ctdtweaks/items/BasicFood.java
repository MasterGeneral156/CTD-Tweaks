package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood implements ItemModelProvider
{
	protected String name;
	protected String modid;
	public BasicFood(String name, int amount, float saturation, boolean isWolfFood, String modid) 
	{
		super(amount, saturation, isWolfFood);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(com.themastergeneral.ctdtweaks.Main.creativeTab);
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}
}
