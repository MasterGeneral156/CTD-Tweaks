/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.config.PocketCobbleConfig
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
