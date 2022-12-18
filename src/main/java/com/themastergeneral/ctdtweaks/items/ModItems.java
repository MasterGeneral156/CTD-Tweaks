package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.HealthTrinketConfig;
import com.themastergeneral.ctdtweaks.config.WitherFuelConfig;
import com.themastergeneral.ctdtweaks.items.blocks.ModBlockItems;
import com.themastergeneral.ctdtweaks.items.curios.CobbleGenItem;
import com.themastergeneral.ctdtweaks.items.curios.FlameRetardantCurios;
import com.themastergeneral.ctdtweaks.items.curios.FlightCuriosItem;
import com.themastergeneral.ctdtweaks.items.curios.HasteCuriosItem;
import com.themastergeneral.ctdtweaks.items.curios.HealthCurios;
import com.themastergeneral.ctdtweaks.items.curios.SpeedCuriosItem;

import net.minecraft.world.item.Item;

public class ModItems {

	public static CTDFuelItem coal_wither = new CTDFuelItem(new Item.Properties().tab(CTDTweaks.CreativeTab), WitherFuelConfig.GEN_TICKS.get() / 10);
	
	public static GlintItem gold_ingot_enchanted = new GlintItem();
	
	public static SpeedCuriosItem ring_of_swiftness = new SpeedCuriosItem();
	public static HasteCuriosItem ring_of_enlightened_miner = new HasteCuriosItem();
	public static FlightCuriosItem ring_of_the_angels = new FlightCuriosItem();
	public static FlameRetardantCurios amulet_of_extinguish = new FlameRetardantCurios();
	public static HealthCurios health_charm = new HealthCurios(HealthTrinketConfig.HP_TIER_ONE.get());
	public static HealthCurios enchanted_health_charm = new HealthCurios(HealthTrinketConfig.HP_TIER_TWO.get());
	public static HealthCurios demonic_health_charm = new HealthCurios(HealthTrinketConfig.HP_TIER_THREE.get());
	
	public static TeleporterItem personal_teleporter = new TeleporterItem(71);
	
	public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
	
	public static BaseFoodItem steamed_carrot = new BaseFoodItem(6, 0.65F);
	
	public static BaseDurabilityItem combat_core = new BaseDurabilityItem(128);
	
	public static ModBlockItems block_coal_wither = new ModBlockItems(ModBlocks.block_coal_wither);
	public static ModBlockItems glowing_obsidian = new ModBlockItems(ModBlocks.glowing_obsidian);
	
}
