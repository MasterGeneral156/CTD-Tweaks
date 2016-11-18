package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.items.ModBaubleItems;

public class BaubleItemsCrafting {
	public static void addRecipes() 
	{
		//Basic Ring
		GameRegistry.addRecipe(new ItemStack(ModBaubleItems.basering), "NNN", "N N", "NNN", 'N', Items.GOLD_NUGGET);
		
		//Speed Ring
		GameRegistry.addRecipe(new ItemStack(ModBaubleItems.speedring), " S ", "SBS", " S ", 'B', ModBaubleItems.basering, 'S', Items.SUGAR);
		
		//Haste Ring
		GameRegistry.addRecipe(new ItemStack(ModBaubleItems.hastering), " H ", "HBH", " H ", 'B', ModBaubleItems.basering, 'H', Items.END_CRYSTAL);
	}
}
