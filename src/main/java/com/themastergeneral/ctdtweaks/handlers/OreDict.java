package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	public static void InitOre() {
		OreDictionary.registerOre("concrete", ModBlocks.concrete);
		OreDictionary.registerOre("obsidian", ModBlocks.glowingobsidian);
		OreDictionary.registerOre("glowstone", ModBlocks.glowingobsidian);
		OreDictionary.registerOre("blockGlassBlack", ModBlocks.gothicglass);
		OreDictionary.registerOre("blockGlass", ModBlocks.gothicglass);
		OreDictionary.registerOre("ingotEnchantedGold", ModItems.enchantedgoldingot);
		OreDictionary.registerOre("ingotWitherFuel", ModItems.fuelwither);
		OreDictionary.registerOre("cropCarrot", ModItems.steamedcarrot);
		OreDictionary.registerOre("soulsand", ModBlocks.thiccsoulsand);
		OreDictionary.registerOre("blockSoulSand", ModItems.steamedcarrot);
	}
}
