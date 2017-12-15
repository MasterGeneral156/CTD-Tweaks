package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	public static final void init() {
		OreDict.block();
		OreDict.ore();
		OreDict.ingot();
		OreDict.dust();
		OreDict.nugget();
	}

	public static final void ore() {

	}

	public static final void ingot() {

	}

	public static final void block() {
		OreDictionary.registerOre("concrete", ModBlocks.concrete);
	}

	public static final void dust() {

	}

	public static final void nugget() {
	}
}
