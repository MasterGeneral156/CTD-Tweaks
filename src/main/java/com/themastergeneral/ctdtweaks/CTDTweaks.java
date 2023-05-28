/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.CTDTweaks
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/

package com.themastergeneral.ctdtweaks;

import com.mojang.logging.LogUtils;
import com.themastergeneral.ctdtweaks.blocks.BlockRegistry;
import com.themastergeneral.ctdtweaks.items.ItemRegistry;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;

import org.slf4j.Logger;

@Mod("ctdtweaks")
public class CTDTweaks
{
	public static CTDTweaks instance;
	
    private static final Logger LOGGER = LogUtils.getLogger();
	public static CreativeModeTab CTDTweaksTab;

    public CTDTweaks()
    {
    	instance = this;
		//ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.SPEC, "ctd/ctd-tweaks.toml");
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(this::setup);
        modbus.addListener(this::enqueueIMC);
        modbus.addListener(this::registerTabs);
        modbus.addListener(this::fillTab);
    	
        MinecraftForge.EVENT_BUS.register(this);
        ItemRegistry.ITEMS.register(modbus);
        BlockRegistry.BLOCKS.register(modbus);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("CTD Tweaks is now launching.");
    }
    
    private void enqueueIMC(final InterModEnqueueEvent event) 
    {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("ring").size(2).build());
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("necklace").size(1).build());
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("charm").size(1).build());
    }
    
    private void registerTabs(CreativeModeTabEvent.Register event)
    {
		CTDTweaksTab = event.registerCreativeModeTab(
				new ResourceLocation("ctdtweaks", "ctdweaks_tab"), builder -> builder
                .icon(() -> new ItemStack(ModItems.coal_wither))
                .title(Component.translatable("itemGroup.ctdtweaks"))
                .build());
    }
	
	private void fillTab(CreativeModeTabEvent.BuildContents ev)
	{
		if (ev.getTab() == CTDTweaksTab)
		{
			ev.accept(ModItems.glowing_obsidian);
			ev.accept(ModItems.block_coal_wither);
			ev.accept(ModItems.amulet_of_extinguish);
			ev.accept(ModItems.coal_wither);
			ev.accept(ModItems.combat_core);
			ev.accept(ModItems.gold_ingot_enchanted);
			ev.accept(ModItems.personal_teleporter);
			ev.accept(ModItems.pocket_cobble_generator);
			ev.accept(ModItems.ring_of_enlightened_miner);
			ev.accept(ModItems.ring_of_swiftness);
			ev.accept(ModItems.ring_of_the_angels);
			ev.accept(ModItems.steamed_carrot);
		}
	}
}
