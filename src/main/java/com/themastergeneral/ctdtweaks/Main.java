package com.themastergeneral.ctdtweaks;

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

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = Main.DEPENDENCIES)
public class Main 
{
	public static boolean baublesLoaded = false;
    public static final String MODID = "ctdtweaks";
    public static final String MODNAME = "CTD Tweaks";
    public static final String VERSION = "1.2.0";
    public static final String DEPENDENCIES = "after:Baubles@[1.3.BETA8,];";
    
    public static final CreativeTab creativeTab = new CreativeTab();
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.themastergeneral.ctdtweaks.proxy.ClientProxy", serverSide="com.themastergeneral.ctdtweaks.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	baublesLoaded = Loader.isModLoaded("Baubles");
    	if (Main.baublesLoaded)
    	{
    		ModBaubleItems.init();
    		BaubleItemsCrafting.addRecipes();
    	}
    	System.out.println("CTD Tweaks is loading...");
    	proxy.preInit(e);
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
    	System.out.println("CTD Tweaks is loaded.");
    }
}