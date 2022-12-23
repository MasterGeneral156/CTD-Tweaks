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
	public static final RegistryObject<Item> amulet_of_extinguish = ITEMS.register("amulet_of_extinguish", () -> ModItems.amulet_of_extinguish);
	public static final RegistryObject<Item> pocket_cobble_generator = ITEMS.register("pocket_cobble_generator", () -> ModItems.pocket_cobble_generator);
	public static final RegistryObject<Item> personal_teleporter = ITEMS.register("personal_teleporter", () -> ModItems.personal_teleporter);
	public static final RegistryObject<Item> health_charm = ITEMS.register("health_charm", () -> ModItems.health_charm);
	public static final RegistryObject<Item> enchanted_health_charm = ITEMS.register("enchanted_health_charm", () -> ModItems.enchanted_health_charm);
	public static final RegistryObject<Item> demonic_health_charm = ITEMS.register("demonic_health_charm", () -> ModItems.demonic_health_charm);
	public static final RegistryObject<Item> sunn_block_charm = ITEMS.register("sunn_block_charm", () -> ModItems.sunn_block_charm);
	
	//Block Items
	public static final RegistryObject<Item> block_coal_wither = ITEMS.register("block_coal_wither", () -> ModItems.block_coal_wither);
	public static final RegistryObject<Item> glowing_obsidian = ITEMS.register("glowing_obsidian", () -> ModItems.glowing_obsidian);
}
