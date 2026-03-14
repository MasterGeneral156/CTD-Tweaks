package com.themastergeneral.crdtweaks.registries;

import com.themastergeneral.crdtweaks.items.ItemConstants;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.themastergeneral.crdtweaks.CTDTweaks.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    /** Food Items */
    public static final Supplier<Item> steamed_carrot = ITEMS.register("steamed_carrot", () -> ItemConstants.steamed_carrot);
    public static final Supplier<Item> roasted_beetroot = ITEMS.register("roasted_beetroot", () -> ItemConstants.roasted_beetroot);

    /** Fuel Items */
    public static final Supplier<Item> nugget_charcoal = ITEMS.register("nugget_charcoal", () -> ItemConstants.nugget_charcoal);
    public static final Supplier<Item> nugget_coal = ITEMS.register("nugget_coal", () -> ItemConstants.nugget_coal);

    /** Curios Items */
    //Artifacts
    public static final Supplier<Item> pocket_cobble_generator = ITEMS.register("pocket_cobble_generator", () -> ItemConstants.pocket_cobble_generator);
}
