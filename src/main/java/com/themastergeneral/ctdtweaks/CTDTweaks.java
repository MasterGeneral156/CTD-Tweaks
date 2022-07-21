package com.themastergeneral.ctdtweaks;

import com.mojang.logging.LogUtils;
import com.themastergeneral.ctdtweaks.blocks.BlockRegistry;
import com.themastergeneral.ctdtweaks.config.ModConfigs;
import com.themastergeneral.ctdtweaks.items.ItemRegistry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;

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
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
    	
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModConfigs.registerConfig();
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("CTD Tweaks is now launching.");
    }
    
    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("ring").size(2).build());
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("necklace").size(1).build());
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("charm").size(1).build());
    }
}
