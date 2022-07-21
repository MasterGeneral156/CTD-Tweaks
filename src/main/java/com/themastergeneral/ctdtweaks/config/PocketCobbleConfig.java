package com.themastergeneral.ctdtweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PocketCobbleConfig
{
	public static ForgeConfigSpec.BooleanValue REQUIRE_BUCKETS;
	public static ForgeConfigSpec.IntValue GEN_TICKS;
	public static ForgeConfigSpec.IntValue MAX_STACK;
	
	public static void build(ForgeConfigSpec.Builder BUILDER)
	{
		BUILDER.comment("Settings for Pocket Cobblestone Generator").push("Pocket Cobble Generator");
		REQUIRE_BUCKETS = BUILDER
				.comment("Require Water and Lava bucket in inventory before generating Cobblestone?").define("requireMaterials", true);
		
		GEN_TICKS = BUILDER
	            .comment("Delay (in ticks) before Pocket Cobble Generator generators another Cobblestone.")
	            .defineInRange("cobbleGenRateTicks", 40, 1, 1024);
		
		MAX_STACK = BUILDER
	            .comment("How much Cobblestone to store before the Pocket Cobble Gen stops creating more.")
	            .defineInRange("cobbleGenMaxStack", 64, 1, 1024);
		BUILDER.pop();
	}
}
