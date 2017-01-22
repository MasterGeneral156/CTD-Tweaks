package com.themastergeneral.ctdtweaks.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

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
		 corecombat = register(new BasicCore("corecombat", Config.coreCombatDurability));
		 coreflight = register(new BasicCore("coreflight", Config.coreFlightDurability));
		 nuggettin = register(new BasicItem ("nuggettin"));
		 fuelwither = register(new BasicItem ("fuelwither"));
		 coreglowing = register(new BasicItem ("coreglowing"));
		 enchantedgoldingot = register(new BasicGlow ("enchantedgoldingot"));
		 steamedcarrot = register(new BasicFood ("steamedcarrot", 6, 1.2F, false));
		 nightvision = register(new SpecialArmor("nightvision", weak_armor, 0, EntityEquipmentSlot.HEAD));
		 glowingamulet = register(new SpecialArmor("glowingamulet", weak_armor, 1, EntityEquipmentSlot.CHEST));
		 goodbyeboots = register(new SpecialArmor("goodbyeboots", weak_armor, 3, EntityEquipmentSlot.FEET));
		  
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
