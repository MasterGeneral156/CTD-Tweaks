/*
	Project:	CTD Tweaks 1.20
	File:		com.themastergeneral.ctdtweaks.config.ModConfigs
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2024 MasterGeneral156
				
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

import com.google.common.base.Equivalence;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.checkerframework.checker.nullness.qual.Nullable;

@Mod.EventBusSubscriber
public class ModConfigs {

    public static ForgeConfigSpec.IntValue COBBLE_GEN_TICKS;
    public static ForgeConfigSpec.BooleanValue COBBLE_GEN_BUCKET;
    public static ForgeConfigSpec.IntValue COBBLE_GEN_MAX;

    public static ForgeConfigSpec.IntValue REPAIR_TICKS;

    public static ForgeConfigSpec.IntValue WATERBREATHING_COOLDOWN;
    public static ForgeConfigSpec.DoubleValue WATERBREATHING_REGEN;

    public static ForgeConfigSpec.IntValue EXTINGUISHING_COOLDOWN;

    public static ForgeConfigSpec.DoubleValue CURIOS_SPEED_INCREASE;
    public static ForgeConfigSpec.IntValue CURIOS_MINING_INCREASE;

    public static final ForgeConfigSpec.Builder GENERAL_SPEC = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON;

    static {
        GENERAL_SPEC.push("pocket_cobble_generator");
        COBBLE_GEN_TICKS =
                GENERAL_SPEC
                        .comment("Ticks between cobblestone being generated")
                        .defineInRange("pocket_cobble_ticks", 20, 1, Integer.MAX_VALUE);

        COBBLE_GEN_MAX =
                GENERAL_SPEC
                        .comment("Maximum amount of cobble to store in player inventory before stopping")
                        .defineInRange("pocket_cobble_max", 64, 8, 1024);

        COBBLE_GEN_BUCKET =
                GENERAL_SPEC
                        .comment("Set to false to disable the need to have a buckets of water and lava in inventory")
                        .define("pocket_cobble_bucket_required", true);
        GENERAL_SPEC.pop();

        GENERAL_SPEC.push("repair_charm");
        REPAIR_TICKS =
                GENERAL_SPEC
                        .comment("Ticks between repair attempts on damaged items when using the Repair Charm")
                        .defineInRange("repair_charm_ticks", 10, 1, Integer.MAX_VALUE);

        GENERAL_SPEC.pop();
        GENERAL_SPEC.push("amulet_water_breathing");
        WATERBREATHING_COOLDOWN =
                GENERAL_SPEC
                        .comment("Ticks between refilling the players O2 supply")
                        .defineInRange("amulet_water_breathing_cooldown", 100, 1, Integer.MAX_VALUE);

       WATERBREATHING_REGEN =
                GENERAL_SPEC
                        .comment("How low must player O2 supply drop before refill")
                        .defineInRange("amulet_water_breathing_regen", 0.25D, 0.01D, 1.0D);
        GENERAL_SPEC.pop();

        GENERAL_SPEC.push("amulet_of_extinguish");
        EXTINGUISHING_COOLDOWN =
                GENERAL_SPEC
                        .comment("Ticks between extinguishing the player when on fire")
                        .defineInRange("amulet_of_extinguish_cooldown", 20, 1, Integer.MAX_VALUE);

        GENERAL_SPEC.pop();

        GENERAL_SPEC.push("ring_of_switftness");
        CURIOS_SPEED_INCREASE =
                GENERAL_SPEC
                        .comment("Perecent speed increase when worn")
                        .defineInRange("ring_of_switftness_increase", 0.07D, 0.01D, 500D);

        GENERAL_SPEC.pop();

        GENERAL_SPEC.push("ring_of_enlightened_miner");
        CURIOS_MINING_INCREASE =
                GENERAL_SPEC
                        .comment("Mining Haste effect strength when worn")
                        .defineInRange("ring_of_enlightened_miner_increase", 2, 1, 32);

        GENERAL_SPEC.pop();
        COMMON = GENERAL_SPEC.build();
    }
}
