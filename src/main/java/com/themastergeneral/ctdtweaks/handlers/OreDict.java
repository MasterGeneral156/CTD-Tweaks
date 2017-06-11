package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict 
{
	public static final void init() 
	{
		OreDict.nugget();
	}
	public static final void nugget() 
	{
		OreDictionary.registerOre("nuggetTin", ModItems.nuggettin);
	}
}
