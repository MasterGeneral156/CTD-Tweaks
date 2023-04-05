/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.items.ModItems
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
package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.WitherFuelConfig;
import com.themastergeneral.ctdtweaks.items.blocks.ModBlockItems;

import net.minecraft.world.item.Item;

public class ModItems {

	public static CTDFuelItem coal_wither = new CTDFuelItem(new Item.Properties(), WitherFuelConfig.GEN_TICKS.get() / 10);
	
	public static GlintItem gold_ingot_enchanted = new GlintItem();
	
	public static SpeedCuriosItem ring_of_swiftness = new SpeedCuriosItem();
	public static HasteCuriosItem ring_of_enlightened_miner = new HasteCuriosItem();
	public static FlightCuriosItem ring_of_the_angels = new FlightCuriosItem();
	public static FlameRetardantCurios amulet_of_extinguish = new FlameRetardantCurios();
	
	public static TeleporterItem personal_teleporter = new TeleporterItem(71);
	
	public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
	
	public static BaseFoodItem steamed_carrot = new BaseFoodItem(6, 0.65F);
	
	public static BaseDurabilityItem combat_core = new BaseDurabilityItem(128);
	
	public static ModBlockItems block_coal_wither = new ModBlockItems(ModBlocks.block_coal_wither);
	public static ModBlockItems glowing_obsidian = new ModBlockItems(ModBlocks.glowing_obsidian);
	
}
