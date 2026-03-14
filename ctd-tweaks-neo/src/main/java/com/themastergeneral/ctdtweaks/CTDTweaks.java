package com.themastergeneral.ctdtweaks;

import com.themastergeneral.ctdtweaks.registries.ItemRegistry;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


@Mod(CTDTweaks.MODID)
public class CTDTweaks {
    public static final String MODID = "ctdtweaks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    public CTDTweaks(IEventBus modEventBus, ModContainer modContainer) {

        BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        //NeoForge.EVENT_BUS.register(this);
        CTDTweaksTab.CREATIVE_MODE_TABS.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        //modEventBus.addListener(this::onUseItemOnBlock);

        NeoForge.EVENT_BUS.register(CTDTweaksEvents.class);
    }
}
