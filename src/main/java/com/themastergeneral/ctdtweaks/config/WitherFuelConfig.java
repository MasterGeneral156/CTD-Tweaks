package com.themastergeneral.ctdtweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class WitherFuelConfig
{
	public static ForgeConfigSpec.IntValue GEN_TICKS;
	
	public static void build(ForgeConfigSpec.Builder BUILDER)
	{
		BUILDER.comment("Config for Wither Fuel").push("Wither Fuel");
		GEN_TICKS = BUILDER
	            .comment("Burn time (in ticks)")
	            .defineInRange("fuelTime", 560000, 1, Integer.MAX_VALUE);
	}
}
