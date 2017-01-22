package com.themastergeneral.ctdtweaks;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdtweaks.handlers.BaubleItemsCrafting;
import com.themastergeneral.ctdtweaks.items.ModBaubleItems;
import com.themastergeneral.ctdtweaks.proxy.CommonProxy;
import com.themastergeneral.ctdtweaks.proxy.client.CreativeTab;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = Main.DEPENDENCIES, acceptedMinecraftVersions = Main.acceptedMinecraftVersions, updateJSON = Main.updateJSON)
public class Main 
{
	public static boolean baublesLoaded = false;
    public static final String MODID = "ctdtweaks";
    public static final String MODNAME = "CTD Tweaks";
    public static final String VERSION = "1.3.0";
    public static final String DEPENDENCIES = "after:Baubles@[1.3.BETA8,];";
    public static final String updateJSON = "https://dl.dropboxusercontent.com/u/72961306/TMG%20Assets/Update%20JSONs/CTD-Tweaks.json";
    public static final String acceptedMinecraftVersions = "1.11.2";
    
    public static final CreativeTab creativeTab = new CreativeTab();
    
    @Instance
    public static Main instance = new Main();
    public static Logger logger;
    
    @SidedProxy(clientSide="com.themastergeneral.ctdtweaks.proxy.ClientProxy", serverSide="com.themastergeneral.ctdtweaks.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	baublesLoaded = Loader.isModLoaded("Baubles");
    	proxy.preInit(e);
    	if (Main.baublesLoaded)
    	{
    		ModBaubleItems.init();
    		BaubleItemsCrafting.addRecipes();
    	}
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}