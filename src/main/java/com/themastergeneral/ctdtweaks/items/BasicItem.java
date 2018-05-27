package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;

public class BasicItem extends CTDItem {
	protected String name;
	protected String modid;

	public BasicItem(String name) {
		super(name, CTDTweaks.MODID);
		this.setCreativeTab(CTDTweaks.creativeTab);
	}
	
	@Override
	public int getItemBurnTime(ItemStack fuel) 
	{
		Item item = fuel.getItem();
		if (item == ModItems.fuelwither) 
			return Config.witherFuelBurn;
		else if(item == Item.getItemFromBlock(ModBlocks.fuelwitherblock))
			return Config.witherFuelBurn*10;
		else 
			return 0;
	}
}
