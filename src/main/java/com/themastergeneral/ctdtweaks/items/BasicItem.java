package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class BasicItem extends Item implements ItemModelProvider
{
	protected String name;
	public BasicItem(String name) 
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.creativeTab);
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}
