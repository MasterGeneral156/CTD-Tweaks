package com.themastergeneral.ctdtweaks.handlers;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smelting {
	public static void addSmelting()
	{
		GameRegistry.addSmelting(new ItemStack(Blocks.SOUL_SAND),new ItemStack(ModBlocks.gothicglass), 0.4f);
	}
}
 