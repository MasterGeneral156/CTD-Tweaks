package com.themastergeneral.ctdtweaks.proxy;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.config.Config;
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
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
