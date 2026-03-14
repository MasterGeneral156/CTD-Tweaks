package com.themastergeneral.crdtweaks.items;

import com.themastergeneral.crdtweaks.items.curios.artifacts.CobbleGenItem;
import com.themastergeneral.ctdcore.item.CTDConsumableItem;
import com.themastergeneral.ctdcore.item.CTDFuelItem;

public class ItemConstants {

    /** Food Items */
    public static CTDConsumableItem steamed_carrot = new CTDConsumableItem(6, 0.65F);
    public static CTDConsumableItem roasted_beetroot = new CTDConsumableItem(2, 0.32F);

    /** Fuel Items */
    public static CTDFuelItem nugget_coal = new CTDFuelItem(200);
    public static CTDFuelItem nugget_charcoal = new CTDFuelItem(200);

    /** Curios Items */
    //Artifacts
    public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
}
