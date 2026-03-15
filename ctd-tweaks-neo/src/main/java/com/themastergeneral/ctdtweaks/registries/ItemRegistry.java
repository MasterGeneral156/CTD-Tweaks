package com.themastergeneral.ctdtweaks.registries;

import com.themastergeneral.ctdtweaks.items.ItemConstants;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.themastergeneral.ctdtweaks.CTDTweaks.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    /** Food Items */
    public static final Supplier<Item> steamed_carrot = ITEMS.register("steamed_carrot", () -> ItemConstants.steamed_carrot);
    public static final Supplier<Item> roasted_beetroot = ITEMS.register("roasted_beetroot", () -> ItemConstants.roasted_beetroot);

    /** Fuel Items */
    public static final Supplier<Item> nugget_charcoal = ITEMS.register("nugget_charcoal", () -> ItemConstants.nugget_charcoal);
    public static final Supplier<Item> nugget_coal = ITEMS.register("nugget_coal", () -> ItemConstants.nugget_coal);
    public static final Supplier<Item> coal_wither = ITEMS.register("coal_wither", () -> ItemConstants.coal_wither);

    /** Misc materials & ingredients */
    public static final Supplier<Item> enchanted_gold_ingot = ITEMS.register("enchanted_gold_ingot", () -> ItemConstants.enchanted_gold_ingot);
    public static final Supplier<Item> enchanted_gold_nugget = ITEMS.register("enchanted_gold_nugget", () -> ItemConstants.enchanted_gold_nugget);
    public static final Supplier<Item> combat_core = ITEMS.register("combat_core", () -> ItemConstants.combat_core);

    /** Curios Items */
    //Artifacts
    public static final Supplier<Item> pocket_cobble_generator = ITEMS.register("pocket_cobble_generator", () -> ItemConstants.pocket_cobble_generator);
}
