package com.themastergeneral.ctdtweaks;

import net.minecraft.core.registries.Registries;
import com.themastergeneral.ctdtweaks.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TweakTab {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "ctdtweaks");
	
	public static final RegistryObject<CreativeModeTab> TWEAK_TAB = CREATIVE_MODE_TABS.register("tweak_tab", () -> CreativeModeTab.builder()
			.withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.combat_core.getDefaultInstance())
            .title(Component.translatable("ctdtweaks.itemgroup.name"))
            .build());
}
