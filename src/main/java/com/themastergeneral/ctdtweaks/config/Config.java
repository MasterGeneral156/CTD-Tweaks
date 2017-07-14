package com.themastergeneral.ctdtweaks.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.CommonProxy;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";

    // This values below you can access elsewhere in your mod:
    public static String ModVersion = Main.VERSION+"-1.12";
    public static int coreCombatDurability = 64;
    public static int drillMiningLevel = 4;
    public static int witherFuelBurn = 56000;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
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
        coreCombatDurability = cfg.getInt("coreCombatDurability", CATEGORY_GENERAL, coreCombatDurability, 1, 4096, "Uses you can get out of the Combat Core before it breaks.");
        drillMiningLevel = cfg.getInt("Mining Drill Mining Level", CATEGORY_GENERAL, drillMiningLevel, 1, 4, "Drill's mining level.");
        witherFuelBurn = cfg.getInt("Wither Fuel Burn Time", CATEGORY_GENERAL, witherFuelBurn, 1, 2147483647, "How many ticks will Wither Fuel burn for? (Block is X10)");
    }
}
