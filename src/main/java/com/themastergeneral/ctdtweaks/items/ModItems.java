package com.themastergeneral.ctdtweaks.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;
import com.themastergeneral.ctdtweaks.items.baubles.amulet.AmuletWaterBreathing;
import com.themastergeneral.ctdtweaks.items.baubles.rings.RingFlight;
import com.themastergeneral.ctdtweaks.items.baubles.rings.RingHaste;
import com.themastergeneral.ctdtweaks.items.baubles.rings.RingInvis;
import com.themastergeneral.ctdtweaks.items.baubles.rings.RingSpeed;

public class ModItems extends RegisterItem {
	public static BasicCore corecombat;

	public static BasicItem fuelwither;
	public static BasicItem coreglowing;
	public static BasicItem refinedwitherfuel;

	public static VoidSword destructo_sword;

	public static BasicGlow enchantedgoldingot;

	public static BasicFood steamedcarrot;

	public static SpecialArmor nightvision;
	public static SpecialArmor glowingamulet;
	public static SpecialArmor goodbyeboots;

	public static BasicRing basering;
	public static RingHaste hastering;
	public static RingSpeed speedring;
	public static RingFlight flightcore;
	public static RingInvis invisring;
	public static AmuletWaterBreathing amulet_water_breathing;

	public static ItemDrill drill;

	public static ArmorMaterial weak_armor = EnumHelper.addArmorMaterial(
			"weak_armor", "ctdtweaks:weak_armor", 100,
			new int[] { 0, 0, 0, 0 }, (int) 0F,
			SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);

	public static void init() {
		corecombat = register(new BasicCore("corecombat",
				Config.combatcoredurability));

		fuelwither = register(new BasicItem("fuelwither"));
		coreglowing = register(new BasicItem("coreglowing"));
		refinedwitherfuel = register(new BasicItem("refinedwitherfuel"));

		amulet_water_breathing = register(new AmuletWaterBreathing(
				"amulet_water_breathing"));

		flightcore = register(new RingFlight("flightcore"));

		enchantedgoldingot = register(new BasicGlow("enchantedgoldingot"));

		steamedcarrot = register(new BasicFood("steamedcarrot", 6, 0.65F, false));

		nightvision = register(new SpecialArmor("nightvision", weak_armor, 0,
				EntityEquipmentSlot.HEAD));
		glowingamulet = register(new SpecialArmor("glowingamulet", weak_armor,
				1, EntityEquipmentSlot.CHEST));
		goodbyeboots = register(new SpecialArmor("goodbyeboots", weak_armor, 3,
				EntityEquipmentSlot.FEET));

		basering = register(new BasicRing("basering"));
		hastering = register(new RingHaste("hastering"));
		speedring = register(new RingSpeed("speedring"));
		invisring = register(new RingInvis("invisring"));

		// destructo_sword = register(new VoidSword("destructo_sword",
		// CTDTweaks.MODID,
		// ToolMaterial.IRON)); // Soon... gotta bugfix first.

		// drill = register(new ItemDrill("drill")); //Not yet
		// :D
	}
}
