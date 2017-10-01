package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.Main;

public class BasicItem extends CTDItem implements ItemModelProvider {
	protected String name;
	protected String modid;

	public BasicItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(Main.creativeTab);
	}
}
