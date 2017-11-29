package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.CTDTweaks;

public class BasicFood extends ItemFood implements ItemModelProvider {
	protected String name;
	protected String modid;

	public BasicFood(String name, int amount, float saturation,
			boolean isWolfFood, String modid) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CTDTweaks.creativeTab);
	}

	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}
}
