package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModBaubleItems;
import com.themastergeneral.ctdtweaks.items.ModItems;


public class BaubleItemsCrafting 
{
	public static void addRecipes() 
	{
		if (Config.disableBaubles == false)
		{
			
			//Speed Ring
			//GameRegistry.addRecipe(new ItemStack(ModBaubleItems.speedring), " S ", "SBS", " S ", 'B', ModBaubleItems.basering, 'S', Items.SUGAR);
			
			//Haste Ring
			//GameRegistry.addRecipe(new ItemStack(ModBaubleItems.hastering), " H ", "HBH", " H ", 'B', ModBaubleItems.basering, 'H', ModItems.enchantedgoldingot);
		}
	}
}
