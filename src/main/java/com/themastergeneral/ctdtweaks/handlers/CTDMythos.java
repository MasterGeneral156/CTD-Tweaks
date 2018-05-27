package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.imc.IMCHelper;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class CTDMythos {
	public static void addPedestalRecipes() {
		IMCHelper.addPedestalCraft(new ItemStack(Items.GOLD_INGOT, 8),
				new ItemStack(ModItems.enchantedgoldingot, 8));
		IMCHelper.addPedestalCraft(new ItemStack(ModBlocks.fuelwitherblock),
				new ItemStack(ModItems.refinedwitherfuel));
		IMCHelper.addPedestalCraft(new ItemStack(ModItems.fuelwither, 9),
				new ItemStack(ModItems.refinedwitherfuel));
		IMCHelper.addPedestalCraft(new ItemStack(Blocks.SOUL_SAND),
				new ItemStack(ModBlocks.gothicglass));
		IMCHelper.addPedestalCraft(new ItemStack(ModBlocks.thiccsoulsand),
				new ItemStack(ModBlocks.gothicglass, 2));
	}
}
