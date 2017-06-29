package com.themastergeneral.ctdtweaks.proxy;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.events.FlightEvent;
import com.themastergeneral.ctdtweaks.events.HasteEvent;
import com.themastergeneral.ctdtweaks.events.SpeedEvent;
import com.themastergeneral.ctdtweaks.handlers.Crafting;
import com.themastergeneral.ctdtweaks.handlers.Fuel;
import com.themastergeneral.ctdtweaks.handlers.OreDict;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class CommonProxy 
{
	public static Configuration config;
	public void preInit(FMLPreInitializationEvent e) 
    {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "CTD/CTDTweaks.cfg"));
		Config.readConfig();
    	ModBlocks.init();
    	ModItems.init();
    	OreDict.InitOre();
    	GameRegistry.registerFuelHandler(new Fuel());
    }
    public void init(FMLInitializationEvent e) 
    {
    	Crafting.addRecipes();
    	MinecraftForge.EVENT_BUS.register(new FlightEvent());
    	MinecraftForge.EVENT_BUS.register(new HasteEvent());
    	MinecraftForge.EVENT_BUS.register(new SpeedEvent());
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
