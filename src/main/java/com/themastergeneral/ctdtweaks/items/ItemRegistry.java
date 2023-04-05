/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.items.ItemRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
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
	
	
	//Block Items
	public static final RegistryObject<Item> block_coal_wither = ITEMS.register("block_coal_wither", () -> ModItems.block_coal_wither);
	public static final RegistryObject<Item> glowing_obsidian = ITEMS.register("glowing_obsidian", () -> ModItems.glowing_obsidian);
}
