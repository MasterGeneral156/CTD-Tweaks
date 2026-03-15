package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.registries.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

public class GlowingItem extends CTDItem {
    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (stack.getItem() == ItemRegistry.enchanted_gold_ingot.get()) {
            tooltipComponents.add(
                    ModUtils.displayTranslation("item.ctdtweaks.enchanted_gold_ingot.desc")
            );
        }
    }
}
