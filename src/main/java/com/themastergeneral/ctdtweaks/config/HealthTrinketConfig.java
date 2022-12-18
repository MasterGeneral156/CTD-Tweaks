package com.themastergeneral.ctdtweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HealthTrinketConfig 
{

	public static ForgeConfigSpec.IntValue MAX_STACK;
	public static ForgeConfigSpec.DoubleValue HP_TIER_ONE;
	public static ForgeConfigSpec.DoubleValue HP_TIER_TWO;
	public static ForgeConfigSpec.DoubleValue HP_TIER_THREE;
	
	public static void build(ForgeConfigSpec.Builder BUILDER)
	{
		BUILDER.comment("Settings for the Health Curios Items").push("Health Curios");
		MAX_STACK = BUILDER
	            .comment("Max stack size of the health curios items")
	            .defineInRange("healthCuriosStackSize", 4, 1, 16);
		HP_TIER_ONE = BUILDER.comment("How much HP does the Health Charm give (per item)").defineInRange("healthCharmHP", 5.0, 0.1, 100.0);
		HP_TIER_TWO = BUILDER.comment("How much HP does the Enchanted Health Charm give (per item)").defineInRange("enchantedHealthCharmHP", 10.0, 0.1, 100.0);
		HP_TIER_THREE = BUILDER.comment("How much HP does the Demonic Health Charm give (per item)").defineInRange("demonicHealthCharmHP", 20.0, 0.1, 100.0);
		BUILDER.pop();
	}
}
