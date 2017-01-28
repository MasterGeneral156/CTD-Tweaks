package com.themastergeneral.ctdtweaks.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.Main;

public class ModItems 
{
	public static BasicCore corecombat;
	public static BasicItem coreflight;
	
	public static BasicItem nuggettin;
	public static BasicItem fuelwither;
	public static BasicItem coreglowing;
	
	public static BasicGlow enchantedgoldingot;
	
	public static BasicFood steamedcarrot;
	
	public static SpecialArmor nightvision;
	public static SpecialArmor glowingamulet;
	public static SpecialArmor goodbyeboots;
	
	public static ArmorMaterial weak_armor = EnumHelper.addArmorMaterial("weak_armor", "ctdtweaks:weak_armor", 100, new int[] {0, 0, 0, 0}, (int) 0F, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);
	 public static void init() 
	 {
		 corecombat = register(new BasicCore("corecombat", Config.coreCombatDurability, Main.MODID));
		 coreflight = register(new BasicCore("coreflight", Config.coreFlightDurability, Main.MODID));
		 nuggettin = register(new BasicItem ("nuggettin", Main.MODID));
		 fuelwither = register(new BasicItem ("fuelwither", Main.MODID));
		 coreglowing = register(new BasicItem ("coreglowing", Main.MODID));
		 enchantedgoldingot = register(new BasicGlow ("enchantedgoldingot", Main.MODID));
		 steamedcarrot = register(new BasicFood ("steamedcarrot", 6, 1.2F, false, Main.MODID));
		 nightvision = register(new SpecialArmor("nightvision", weak_armor, 0, EntityEquipmentSlot.HEAD, Main.MODID));
		 glowingamulet = register(new SpecialArmor("glowingamulet", weak_armor, 1, EntityEquipmentSlot.CHEST, Main.MODID));
		 goodbyeboots = register(new SpecialArmor("goodbyeboots", weak_armor, 3, EntityEquipmentSlot.FEET, Main.MODID));
		  
	 }
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}
