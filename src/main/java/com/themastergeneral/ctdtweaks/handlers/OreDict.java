package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	public static void InitOre() {
		OreDictionary.registerOre("tmgcombatcore", ModItems.corecombat);
		OreDictionary.registerOre("enchanted_book", Items.ENCHANTED_BOOK);
	}
}
