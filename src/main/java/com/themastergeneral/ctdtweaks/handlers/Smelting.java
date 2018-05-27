package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdcore.imc.IMCHelper;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smelting {
	public static void addSmelting() {
		GameRegistry.addSmelting(new ItemStack(ModBlocks.thiccsoulsand),
				new ItemStack(ModBlocks.gothicglass, 2), 0.4f);
		GameRegistry.addSmelting(Items.CARROT, new ItemStack(
				ModItems.steamedcarrot), 0.1f);
		IMCHelper.addEnderfugeSmelt(new ItemStack(ModBlocks.fuelwitherblock),
				new ItemStack(ModItems.refinedwitherfuel), 0.4F);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.fuelwitherblock),
				new ItemStack(ModItems.refinedwitherfuel), 0.4F);
	}
}
