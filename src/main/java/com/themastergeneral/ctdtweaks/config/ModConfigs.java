/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.config.ModConfigs
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.ctdtweaks.config;

/*import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = "ctdtweaks", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModConfigs {

	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder().push(null);
	
	public static final ForgeConfigSpec SPEC = BUILDER.build();
	
	public static void registerConfig()
	{
		cobbleGen.build(BUILDER);
		witherFuel.build(BUILDER);
	}
	
	public static class cobbleGen
	{
		public static void build(ForgeConfigSpec.Builder BUILDER)
		{
			BUILDER.comment("Settings for Pocket Cobblestone Generator").push("Pocket Cobble Generator");
			COBBLEGEN_REQUIRE_BUCKETS = BUILDER
					.comment("Require Water and Lava bucket in inventory before generating Cobblestone?")
					.define("requireMaterials", true);
			
			COBBLEGEN_GEN_TICKS = BUILDER
		            .comment("Delay (in ticks) before Pocket Cobble Generator generators another Cobblestone.")
		            .defineInRange("cobbleGenRateTicks", 40, 1, 1024);
			
			COBBLEGEN_MAX_STACK = BUILDER
		            .comment("How much Cobblestone to store before the Pocket Cobble Gen stops creating more.")
		            .defineInRange("cobbleGenMaxStack", 64, 1, 1024);
			BUILDER.pop();
		}
	}
	
	public class witherFuel
	{
		
		public static void build(ForgeConfigSpec.Builder BUILDER)
		{
			BUILDER.comment("Config for Wither Fuel").push("Wither Fuel");
			WITHER_GEN_TICKS = BUILDER
		            .comment("Burn time (in ticks)")
		            .defineInRange("fuelTime", 560000, 1, Integer.MAX_VALUE);
		}
	}
	public static ForgeConfigSpec.ConfigValue<Integer> COBBLEGEN_GEN_TICKS;
	public static ForgeConfigSpec.ConfigValue<Boolean> COBBLEGEN_REQUIRE_BUCKETS;
	public static ForgeConfigSpec.ConfigValue<Integer> WITHER_GEN_TICKS;
	public static ForgeConfigSpec.ConfigValue<Integer> COBBLEGEN_MAX_STACK;
	
	
}*/
