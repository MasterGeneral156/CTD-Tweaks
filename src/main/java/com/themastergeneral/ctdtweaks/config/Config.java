package com.themastergeneral.ctdtweaks.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.CommonProxy;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";

    public static boolean disableBaubles = false;
    public static boolean disableCarrot = false;
    public static boolean disableWitherFuel = false;
    public static boolean disableWitherFuelBlock = false;
    public static boolean disableBossDrops = false;
    public static boolean disableGagItems = false;
    public static boolean disableCores = false;
    public static boolean disableNightVision = false;
    public static boolean disableEnchantedGold = false;
    public static boolean disableElytra = false;
    public static boolean disableJei = false;
    public static String ModVersion = Main.VERSION+"-"+Main.acceptedMinecraftVersions;
    public static int coreCombatDurability = 64;
    public static int coreFlightDurability = 128;

    public static void readConfig() 
    {
        Configuration cfg = CommonProxy.config;
        try 
        {
            cfg.load();
            initGeneralConfig(cfg);
        } 
        catch (Exception e1) 
        {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        }
        finally 
        {
            if (cfg.hasChanged()) 
            {
                cfg.save();
            }
        }
    }
    private static void initGeneralConfig(Configuration cfg) 
    {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration for the CTD Tweaks mod.");
        ModVersion = cfg.getString("ModVersion", CATEGORY_GENERAL, ModVersion, "Internal. Don't need to mess with this.");
        disableBaubles = cfg.getBoolean("disableBauble", CATEGORY_GENERAL, disableBaubles, "Set to true to remove the Baubles items.");
        disableCarrot = cfg.getBoolean("disableCarrot", CATEGORY_GENERAL, disableCarrot, "Set to true to remove the Steamed Carrot.");
        disableCores = cfg.getBoolean("disableCores", CATEGORY_GENERAL, disableCores, "Set to true to remove the cores items. (Ex. Combat Core)");
        disableElytra = cfg.getBoolean("disableElytra", CATEGORY_GENERAL, disableElytra, "Set to true to remove the crafting recipe for the Elytra.");
        disableNightVision = cfg.getBoolean("disableNightVision ", CATEGORY_GENERAL, disableNightVision , "Set to true to remove the night vision goggles.");
        disableBossDrops = cfg.getBoolean("disableBossDrops", CATEGORY_GENERAL, disableBossDrops, "Set to true to remove the ability to craft boss drops. (Dragon Egg, Nether Star, etc.)");
        disableWitherFuel = cfg.getBoolean("disableWitherFuel", CATEGORY_GENERAL, disableWitherFuel, "Set to true to remove the Wither Fuel item.");
        disableGagItems = cfg.getBoolean("disableGagItems", CATEGORY_GENERAL, disableGagItems, "Set to true to remove gag items from the mod.");
        disableEnchantedGold = cfg.getBoolean("disableEnchantedGold", CATEGORY_GENERAL, disableEnchantedGold, "Set to true to remove Enchanted Gold.");
        disableWitherFuelBlock = cfg.getBoolean("disableWitherFuelBlock", CATEGORY_GENERAL, disableWitherFuelBlock, "Set to true to remove the Wither Fuel block.");
        disableJei = cfg.getBoolean("disableJei", CATEGORY_GENERAL, disableJei, "Set to true to remove Just Enough Items integration.");
        coreCombatDurability = cfg.getInt("coreCombatDurability", CATEGORY_GENERAL, coreCombatDurability, 1, 4096, "Uses you can get out of the Combat Core before it breaks.");
        coreFlightDurability = cfg.getInt("coreFlightDurability", CATEGORY_GENERAL, coreFlightDurability, 1, 4096, "Uses you can get out of the Flight Core before it breaks.");
    }
}