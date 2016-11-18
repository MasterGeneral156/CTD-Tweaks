package com.themastergeneral.ctdtweaks.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.blocks.ModBlocks;
import com.themastergeneral.ctdtweaks.handlers.Crafting;
import com.themastergeneral.ctdtweaks.handlers.Fuel;
import com.themastergeneral.ctdtweaks.handlers.OreDict;
import com.themastergeneral.ctdtweaks.items.ModItems;
import com.themastergeneral.ctdtweaks.proxy.client.BlockRenderRegister;

public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();
    	ModItems.init();
    	GameRegistry.registerFuelHandler(new Fuel());
    }
    public void init(FMLInitializationEvent e) 
    {
    	OreDict.init();
    	Crafting.addRecipes();
    	BlockRenderRegister.registerBlockRenderer();
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
    public void registerItemRenderer(Item item, int meta, String id) 
    {
    	 
    }
}
