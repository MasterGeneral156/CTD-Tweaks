package com.themastergeneral.ctdtweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigs {
	public static void registerConfig()
	{
		ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
		PocketCobbleConfig.build(BUILDER);
		WitherFuelConfig.build(BUILDER);
		HealthTrinketConfig.build(BUILDER);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BUILDER.build(), "ctd/ctd-tweaks.toml");
	}
	
	

}
