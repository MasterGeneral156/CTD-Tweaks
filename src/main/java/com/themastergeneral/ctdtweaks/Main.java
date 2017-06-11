package com.themastergeneral.ctdtweaks;

import org.apache.logging.log4j.Level;
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

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = Main.DEPENDENCIES, updateJSON = Main.updateJSON)
public class Main 
{
	public static boolean baublesLoaded = false;
    public static final String MODID = "ctdtweaks";
    public static final String MODNAME = "CTD Tweaks";
    public static final String VERSION = "1.4.0";
    public static final String DEPENDENCIES = "after:Baubles;required-after:ctdcore@[1.0.2,]";
    public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Tweaks.json";
    
    public static final CreativeTab creativeTab = new CreativeTab();
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.themastergeneral.ctdtweaks.proxy.ClientProxy", serverSide="com.themastergeneral.ctdtweaks.proxy.ServerProxy")
    public static CommonProxy proxy;
    public static Logger logger;
     
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