package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDDurabilityItem;
import com.themastergeneral.ctdtweaks.items.curios.artifacts.CobbleGenItem;
import com.themastergeneral.ctdcore.item.CTDConsumableItem;
import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdtweaks.items.curios.artifacts.RepairCharmItem;
import net.minecraft.world.item.Item;

public class ItemConstants {

    /** Food Items */
    public static CTDConsumableItem steamed_carrot = new CTDConsumableItem(4, 0.7F);
    public static CTDConsumableItem roasted_beetroot = new CTDConsumableItem(3, 0.65F);

    /** Fuel Items */
    public static CTDFuelItem nugget_coal = new CTDFuelItem(200);
    public static CTDFuelItem nugget_charcoal = new CTDFuelItem(200);
    public static CTDFuelItem coal_wither = new CTDFuelItem(60000);

    /** Misc materials & ingredients */
    public static GlowingItem enchanted_gold_ingot = new GlowingItem();
    public static GlowingItem enchanted_gold_nugget = new GlowingItem();
    public static CTDDurabilityItem combat_core = new CTDDurabilityItem(new Item.Properties(), 128);

    /** Curios Items */
    //Artifacts
    public static CobbleGenItem pocket_cobble_generator = new CobbleGenItem();
    public static RepairCharmItem repair_charm = new RepairCharmItem();
}
