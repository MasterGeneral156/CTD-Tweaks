package com.themastergeneral.ctdtweaks.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "ctdtweaks");
	
	//Base Items
	public static final RegistryObject<Item> coal_wither = ITEMS.register("coal_wither", () -> ModItems.coal_wither);
	public static final RegistryObject<Item> gold_ingot_enchanted = ITEMS.register("gold_ingot_enchanted", () -> ModItems.gold_ingot_enchanted);
	public static final RegistryObject<Item> combat_core = ITEMS.register("combat_core", () -> ModItems.combat_core);
	public static final RegistryObject<Item> steamed_carrot = ITEMS.register("steamed_carrot", () -> ModItems.steamed_carrot);
	public static final RegistryObject<Item> ring_of_switftness = ITEMS.register("ring_of_swiftness", () -> ModItems.ring_of_swiftness);
	public static final RegistryObject<Item> ring_of_enlightened_miner = ITEMS.register("ring_of_enlightened_miner", () -> ModItems.ring_of_enlightened_miner);
	public static final RegistryObject<Item> ring_of_the_angels = ITEMS.register("ring_of_the_angels", () -> ModItems.ring_of_the_angels);
	
	//Block Items
	public static final RegistryObject<Item> block_coal_wither = ITEMS.register("block_coal_wither", () -> ModItems.block_coal_wither);
	public static final RegistryObject<Item> glowing_obsidian = ITEMS.register("glowing_obsidian", () -> ModItems.glowing_obsidian);
}
