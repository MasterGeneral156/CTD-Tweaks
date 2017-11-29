package com.themastergeneral.ctdtweaks.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class Smelt {
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(ModBlocks.thiccsoulsand),
				new ItemStack(ModBlocks.gothicglass, 2), 0.4f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.fuelwitherblock),
				new ItemStack(ModItems.refinedwitherfuel), 0.4f);
		GameRegistry.addSmelting(Items.CARROT, new ItemStack(
				ModItems.steamedcarrot), 0.1f);
	}
}
