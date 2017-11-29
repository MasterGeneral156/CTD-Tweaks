package com.themastergeneral.ctdtweaks.config;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.proxy.CommonProxy;

public class Config {
	private static final String CATEGORY_GENERAL = "General";

	// This values below you can access elsewhere in your mod:
	public static int hasteringmodifier = 3;
	public static int speedringmodifier = 3;
	public static int drillMiningLevel = 4;
	public static int witherFuelBurn = 56000;
	public static int combatcoredurability = 64;

	// Call this from CommonProxy.preInit(). It will create our config if it
	// doesn't
	// exist yet and read the values if it does exist.
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			CTDTweaks.logger.log(Level.ERROR, "Problem loading config file!",
					e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL,
				"General configuration for the CTD Tweaks mod.");
		drillMiningLevel = cfg.getInt("Mining Drill Mining Level",
				CATEGORY_GENERAL, drillMiningLevel, 1, 4,
				"Drill's mining level.");
		witherFuelBurn = cfg.getInt("Wither Fuel Burn Time", CATEGORY_GENERAL,
				witherFuelBurn, 1, 2147483647,
				"How many ticks will Wither Fuel burn for? (Block is X10)");
		hasteringmodifier = cfg.getInt("Haste Ring Modifier", CATEGORY_GENERAL,
				hasteringmodifier, 1, 255,
				"What level of Haste should the ring give?");
		speedringmodifier = cfg.getInt("Speed Ring Modifier", CATEGORY_GENERAL,
				speedringmodifier, 1, 255,
				"What level of Speed should the ring give?");
		combatcoredurability = cfg.getInt("Combat Core Maximum Users",
				CATEGORY_GENERAL, combatcoredurability, 1, 255,
				"How many uses before breaking");
	}
}
