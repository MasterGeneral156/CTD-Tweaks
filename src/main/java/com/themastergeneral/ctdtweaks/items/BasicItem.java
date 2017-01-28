package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class BasicItem extends CTDItem implements ItemModelProvider
{
	public BasicItem(String name) 
	{
		super(name);
	}

	protected String name;
}
