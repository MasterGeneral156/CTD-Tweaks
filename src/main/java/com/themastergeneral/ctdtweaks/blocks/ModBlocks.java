package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdtweaks.Main;

public class ModBlocks extends RegisterBlock
{
	public static BasicBlock fuelwitherblock;
	public static HardLightBlock glowingobsidian;
	public static SoulSandGlass gothicglass;
	 public static void init() 
	 {
		 fuelwitherblock = register(new BasicBlock(Material.GROUND, "fuelwitherblock", Main.MODID));
		 glowingobsidian = register(new HardLightBlock(Material.REDSTONE_LIGHT, "glowingobsidian", Main.MODID));
		 gothicglass = register(new SoulSandGlass(Material.GLASS, false, "gothicglass", Main.MODID));
	 }
}
