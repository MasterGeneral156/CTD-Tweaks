package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.blocks.ModBlockItems;

import net.minecraft.world.item.Item;

public class ModItems {

	public static CTDFuelItem coal_wither = new CTDFuelItem(new Item.Properties().tab(CTDTweaks.CreativeTab), 56000);
	
	public static GlintItem gold_ingot_enchanted = new GlintItem();
	
	public static BaseFoodItem steamed_carrot = new BaseFoodItem(6, 0.65F);
	
	public static BaseDurabilityItem combat_core = new BaseDurabilityItem(128);
	
	public static ModBlockItems block_coal_wither = new ModBlockItems(ModBlocks.block_coal_wither);
	public static ModBlockItems glowing_obsidian = new ModBlockItems(ModBlocks.glowing_obsidian);
}
