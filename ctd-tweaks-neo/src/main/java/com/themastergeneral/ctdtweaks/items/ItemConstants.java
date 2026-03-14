package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdtweaks.items.curios.artifacts.CobbleGenItem;
import com.themastergeneral.ctdcore.item.CTDConsumableItem;
import com.themastergeneral.ctdcore.item.CTDFuelItem;

public class ItemConstants {

    /** Food Items */
    public static CTDConsumableItem steamed_carrot = new CTDConsumableItem(6, 0.65F);
    public static CTDConsumableItem roasted_beetroot = new CTDConsumableItem(2, 0.32F);

    /** Fuel Items */
    public static CTDFuelItem nugget_coal = new CTDFuelItem(200);
    public static CTDFuelItem nugget_charcoal = new CTDFuelItem(200);

    /** Misc materials & ingredients */
    public static GlowingItem enchanted_gold_ingot = new GlowingItem();
    public static GlowingItem enchanted_gold_nugget = new GlowingItem();

    /** Curios Items */
    //Artifacts
    public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
}
