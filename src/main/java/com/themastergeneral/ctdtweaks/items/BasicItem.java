package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

public class BasicItem extends CTDItem {
	protected String name;
	protected String modid;

	public BasicItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(CTDTweaks.creativeTab);
	}
}
