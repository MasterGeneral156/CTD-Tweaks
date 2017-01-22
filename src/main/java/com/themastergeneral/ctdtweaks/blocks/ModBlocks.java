package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class ModBlocks 
{
	public static BasicBlock fuelwitherblock;
	 public static void init() 
	 {
		 fuelwitherblock = register(new BasicBlock(Material.GROUND, "fuelwitherblock", true));
	 }
	 
	 private static <T extends Block> T register (T block, ItemBlock itemBlock) 
	 {
		 GameRegistry.register(block);
		 if(itemBlock != null) 
		 {
			 GameRegistry.register(itemBlock);
		 }
		 if(block instanceof ItemModelProvider) 
		 {
			 ((ItemModelProvider)block).registerItemModel(itemBlock);
		 }
		 return block;
	 }
	 private static <T extends Block> T register(T block) 
	 {
		 ItemBlock itemBlock = new ItemBlock(block);
		 itemBlock.setRegistryName(block.getRegistryName());
		 return register(block, itemBlock);
	 }
}
