package com.themastergeneral.ctdtweaks.proxy.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		reg(ModBlocks.fuelwitherblock);
	}

	public static void reg(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(Main.MODID + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));
	}
}
