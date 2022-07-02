package com.themastergeneral.ctdtweaks;

import com.mojang.logging.LogUtils;
import com.themastergeneral.ctdtweaks.blocks.BlockRegistry;
import com.themastergeneral.ctdtweaks.items.ItemRegistry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("ctdtweaks")
public class CTDTweaks
{
	public static CTDTweaks instance;
	
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab CreativeTab = new CTDTweaksTab();

    public CTDTweaks()
    {
    	instance = this;
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    	
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("CTD Tweaks is now launching.");
    }
}
