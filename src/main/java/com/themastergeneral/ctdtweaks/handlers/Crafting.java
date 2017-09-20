package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class Crafting {
	public static void addRecipes() {
		// Enchanted Gold Ingot
		// GameRegistry.addRecipe(new ItemStack(ModItems.enchantedgoldingot, 8),
		// "GGG", "GBG", "GGG", 'G', Items.GOLD_INGOT, 'B', new
		// ItemStack(Items.ENCHANTED_BOOK, 1, OreDictionary.WILDCARD_VALUE));

		// Glowing Core
		// GameRegistry.addRecipe(new ShapedOreRecipe(new
		// ItemStack(ModItems.coreglowing), "GEG", "ECE", "GEG", 'C',
		// "glowstone", 'G', "blockGlass", 'E', ModItems.enchantedgoldingot));
		// Smelting recipes
	}
}
