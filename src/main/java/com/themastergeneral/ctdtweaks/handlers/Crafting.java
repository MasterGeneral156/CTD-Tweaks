package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class Crafting {
	public static void addRecipes() {
		ItemStack item;
		// Wither Fuel
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fuelwitherblock), " W ",
				"WCW", " W ", 'C', Blocks.COAL_BLOCK, 'W', Items.NETHER_STAR);
		// Wither Fuel Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fuelwitherblock), "FFF",
				"FFF", "FFF", 'F', ModItems.fuelwither);
		// Shapeless crafting recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fuelwither, 9),
				new ItemStack(ModBlocks.fuelwitherblock));
		// Nether Star
		GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), "WWW", "SSS",
				"CS ", 'W', new ItemStack(Items.SKULL, 1, 1), 'S',
				Blocks.SOUL_SAND, 'C', new ItemStack(ModItems.corecombat, 1,
						OreDictionary.WILDCARD_VALUE));

		// Dragon Egg
		GameRegistry.addRecipe(new ItemStack(Blocks.DRAGON_EGG), " C ", "CTC",
				" C ", 'T', new ItemStack(ModItems.corecombat, 1,
						OreDictionary.WILDCARD_VALUE), 'C', Items.END_CRYSTAL);
		// Knockback Stick?
		item = new ItemStack(Items.STICK);
		item.addEnchantment(Enchantment.getEnchantmentByID(19), 10);
		GameRegistry.addRecipe(item, new Object[] { " P ", "PSP", " P ", 'S',
				Items.STICK, 'P', Blocks.PISTON });

		// Good-bye Boots
		GameRegistry.addRecipe(new ItemStack(ModItems.goodbyeboots), "LBL",
				"G G", 'L', Items.LEATHER, 'G', Items.GOLD_INGOT, 'B',
				Items.LEATHER_BOOTS);

		// Amulet
		GameRegistry.addRecipe(new ItemStack(ModItems.glowingamulet), "SSS",
				"S S", " G ", 'S', Items.STRING, 'G', ModItems.coreglowing);
		// Enchanted Gold Ingot
		GameRegistry.addRecipe(new ItemStack(ModItems.enchantedgoldingot, 8),
				"GGG", "GBG", "GGG", 'G', Items.GOLD_INGOT, 'B', new ItemStack(
						Items.ENCHANTED_BOOK, 1, OreDictionary.WILDCARD_VALUE));
		// Combat Core
		GameRegistry.addRecipe(new ItemStack(ModItems.corecombat), "RSR",
				"BNP", "RAR", 'R', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S',
				Items.DIAMOND_SWORD, 'B', Items.BOW, 'A', Items.ARROW, 'P',
				Items.SHIELD);

		// Glowing Core
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
				ModItems.coreglowing), "GEG", "ECE", "GEG", 'C', "glowstone",
				'G', "blockGlass", 'E', ModItems.enchantedgoldingot));
		// Night Vision Goggles
		GameRegistry.addRecipe(new ItemStack(ModItems.nightvision), " L ",
				"GLG", 'L', Items.LEATHER, 'G', ModItems.coreglowing);
		// Elytra
		GameRegistry.addRecipe(new ItemStack(Items.ELYTRA, 1, 432), "PSP",
				"LSL", "LSL", 'L', Items.LEATHER, 'S', Items.STICK, 'P',
				Blocks.PURPUR_BLOCK);
		// Basic Ring
		GameRegistry.addRecipe(new ItemStack(ModItems.basering), "NNN", "N N",
				"NNN", 'N', Items.GOLD_NUGGET);

		// Speed Ring
		GameRegistry.addRecipe(new ItemStack(ModItems.speedring), " S ", "SBS",
				" S ", 'B', ModItems.basering, 'S', Items.SUGAR);

		// Haste Ring
		GameRegistry
				.addRecipe(new ItemStack(ModItems.hastering), " H ", "HBH",
						" H ", 'B', ModItems.basering, 'H',
						ModItems.enchantedgoldingot);
		// Invis Ring
		GameRegistry.addRecipe(new ItemStack(ModItems.invisring), " S ", "SRS",
				" S ", 'R', ModItems.basering, 'S', ModItems.fuelwither);
		// Flight Ring
		GameRegistry.addRecipe(new ItemStack(ModItems.flightcore), "DFN",
				"FRF", "NFD", 'R', ModItems.basering, 'D', Items.DIAMOND, 'N',
				Items.NETHER_STAR, 'F', Items.FEATHER);
		// Glowing Obsidian
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
				ModBlocks.glowingobsidian), "G", "O", 'G', "dustGlowstone",
				'O', "obsidian"));
		// Thicc Soul Sand
		GameRegistry.addRecipe(new ItemStack(ModBlocks.thiccsoulsand), "SS",
				'S', Blocks.SOUL_SAND);
		// Concrete
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
				ModBlocks.concrete), "SG", "GS", 'G', "gravel", 'S', "sand"));
	}
}
