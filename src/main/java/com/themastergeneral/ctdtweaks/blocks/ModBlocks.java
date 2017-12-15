package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdtweaks.CTDTweaks;

public class ModBlocks extends RegisterBlock {
	public static WitherFuelBlock fuelwitherblock;
	public static GlowingBlock thiccsoulsand;
	public static HardLightBlock glowingobsidian;
	public static SoulSandGlass gothicglass;
	public static ConcreteBlock concrete;

	public static void init() {
		fuelwitherblock = register(new WitherFuelBlock(Material.ROCK,
				"fuelwitherblock", CTDTweaks.MODID));
		thiccsoulsand = register(new GlowingBlock(Material.SAND,
				"thiccsoulsand", CTDTweaks.MODID));
		glowingobsidian = register(new HardLightBlock(Material.REDSTONE_LIGHT,
				"glowingobsidian", CTDTweaks.MODID));
		gothicglass = register(new SoulSandGlass(Material.GLASS, false,
				"gothicglass", CTDTweaks.MODID));

		concrete = register(new ConcreteBlock(Material.GROUND, "concrete",
				CTDTweaks.MODID));
	}
}