package com.themastergeneral.ctdtweaks;

import com.themastergeneral.ctdtweaks.items.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum TiersCTDTweaks implements Tier {
    // Define your custom tiers
    OP_TIER(5, 5185, 14.75F, 0F,
            25, Ingredient.of(ItemTags.create(
                    new ResourceLocation("ctdtweaks",
                            "core/combat"))));

    // Fields for tier properties
    private final int harvestLevel; // Mining level (e.g., stone, iron)
    private final int maxUses;      // Durability
    private final float efficiency; // Mining speed (block break speed)
    private final float attackDamageBonus; // Extra attack damage
    private final int enchantability; // Enchantability
    private final Ingredient repairMaterial; // Material used for repairing

    // Constructor to initialize the tier
    TiersCTDTweaks(int harvestLevel, int maxUses, float efficiency, float attackDamageBonus, int enchantability, Ingredient repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    // Override methods from the Tier interface
    @Override
    public int getUses() {
        return maxUses; // Durability
    }

    @Override
    public float getSpeed() {
        return efficiency; // Mining speed
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus; // Extra attack damage
    }

    @Override
    public int getLevel() {
        return harvestLevel; // Mining level (e.g., wood, iron)
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability; // Enchantability
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial; // Material used for repairing
    }
}
