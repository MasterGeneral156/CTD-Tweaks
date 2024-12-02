/*
	Project:	CTD Tweaks 1.20
	File:		com.themastergeneral.ctdtweaks.items.ModItems
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
package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDConsumableItem;
import com.themastergeneral.ctdcore.item.CTDDurabilityItem;
import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.items.blocks.ModBlockItems;
import com.themastergeneral.ctdtweaks.items.curios.CobbleGenItem;
import com.themastergeneral.ctdtweaks.items.curios.CuriosHealthCharm;
import com.themastergeneral.ctdtweaks.items.curios.CuriosSunnBlock;
import com.themastergeneral.ctdtweaks.items.curios.CuriosWaterBreathing;
import com.themastergeneral.ctdtweaks.items.curios.FlameRetardantCurios;
import com.themastergeneral.ctdtweaks.items.curios.FlightCuriosItem;
import com.themastergeneral.ctdtweaks.items.curios.HasteCuriosItem;
import com.themastergeneral.ctdtweaks.items.curios.KnockBackCurios;
import com.themastergeneral.ctdtweaks.items.curios.SpeedCuriosItem;
import com.themastergeneral.ctdtweaks.items.curios.RepairCurios;

import net.minecraft.world.item.Item;

public class ModItems {

	public static CTDFuelItem coal_wither = new CTDFuelItem(new Item.Properties(), 560000 / 10);
	
	public static GlintItem gold_ingot_enchanted = new GlintItem();
	
	public static SpeedCuriosItem ring_of_swiftness = new SpeedCuriosItem();
	public static HasteCuriosItem ring_of_enlightened_miner = new HasteCuriosItem();
	public static FlightCuriosItem ring_of_the_angels = new FlightCuriosItem();
	
	public static FlameRetardantCurios amulet_of_extinguish = new FlameRetardantCurios();
	public static KnockBackCurios knockback_amulet = new KnockBackCurios(5D);
	public static CuriosWaterBreathing amulet_water_breathing = new CuriosWaterBreathing();
	public static KnockBackCurios yeet_amulet = new KnockBackCurios(45D);

	public static CTDFuelItem nugget_coal = new CTDFuelItem(200);
	public static CTDFuelItem nugget_charcoal = new CTDFuelItem(200);

	public static CuriosSunnBlock sunn_block_charm = new CuriosSunnBlock();
	public static CuriosHealthCharm basic_health_charm = new CuriosHealthCharm(3D);
	public static CuriosHealthCharm medium_health_charm = new CuriosHealthCharm(3D * 2.5);
	public static CuriosHealthCharm large_health_charm = new CuriosHealthCharm((3D * 2.5) * 2.5);
	
	
	public static TeleporterItem personal_teleporter = new TeleporterItem(71);
	
	public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
	public static RepairCurios repair_charm = new RepairCurios();
	
	public static CTDConsumableItem steamed_carrot = new CTDConsumableItem(6, 0.65F);
	public static CTDConsumableItem roasted_beetroot = new CTDConsumableItem(2, 0.32F);
	
	public static CTDDurabilityItem combat_core = new CTDDurabilityItem(new Item.Properties(), 128);
	
	public static OPSword op_sword = new OPSword(4, -2.4F);
	public static OPSword op_hammer = new OPSword(27, -3.5F);
	
	public static ModBlockItems block_coal_wither = new ModBlockItems(ModBlocks.block_coal_wither);
	public static ModBlockItems glowing_obsidian = new ModBlockItems(ModBlocks.glowing_obsidian);
	
}
