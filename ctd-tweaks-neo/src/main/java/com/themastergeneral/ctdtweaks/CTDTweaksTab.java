package com.themastergeneral.ctdtweaks;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdtweaks.items.ItemConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.themastergeneral.ctdtweaks.CTDTweaks.MODID;

public class CTDTweaksTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CTDTWEAKS_TAB = CREATIVE_MODE_TABS.register("ctdtweaks_tab", () -> CreativeModeTab.builder()
            .icon(() -> ItemConstants.enchanted_gold_ingot.getDefaultInstance())
            .title(ModUtils.displayTranslation("itemGroup.ctdtweaks"))
            .displayItems((parameters, ev) -> {
                ev.accept(ItemConstants.enchanted_gold_ingot);
                ev.accept(ItemConstants.enchanted_gold_nugget);

                ev.accept(ItemConstants.steamed_carrot);
                ev.accept(ItemConstants.roasted_beetroot);

                ev.accept(ItemConstants.coal_wither);
                ev.accept(ItemConstants.nugget_charcoal);
                ev.accept(ItemConstants.nugget_coal);

                ev.accept(ItemConstants.pocket_cobble_generator);
            }).build());
}
