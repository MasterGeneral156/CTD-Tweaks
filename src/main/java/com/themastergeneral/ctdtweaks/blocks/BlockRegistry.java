package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "ctdtweaks");
	
	public static final RegistryObject<Block> block_coal_wither = BLOCKS.register("block_coal_wither", () -> ModBlocks.block_coal_wither);
	public static final RegistryObject<Block> glowing_obsidian = BLOCKS.register("glowing_obsidian", () -> ModBlocks.glowing_obsidian);
}
