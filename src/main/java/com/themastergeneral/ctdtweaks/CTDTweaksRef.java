package com.themastergeneral.ctdtweaks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CTDTweaksRef {
    //Damage
    public static TagKey<Item> voidDamage = ItemTags.create(new ResourceLocation("ctdtweaks", "weapon_type/void_damage"));
    public static TagKey<Item> burnDamage = ItemTags.create(new ResourceLocation("ctdtweaks", "weapon_type/burn_damage"));
    public static TagKey<Item> confusionDamage = ItemTags.create(new ResourceLocation("ctdtweaks", "weapon_type/confusion_damage"));

    //Types
    public static TagKey<Item> heavyWeapon = ItemTags.create(new ResourceLocation("ctdtweaks", "weapon_type/heavy_weapon"));
}
