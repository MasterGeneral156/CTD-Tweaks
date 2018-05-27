package com.themastergeneral.ctdtweaks.handlers;

public class Processing {

	public static final void init() {
		CTDMythos.addPedestalRecipes();
		EnderfugeFuel.init();
		OreDict.InitOre();
		Smelting.addSmelting();
	}
}
