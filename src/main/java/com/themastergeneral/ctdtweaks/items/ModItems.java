package com.themastergeneral.ctdtweaks.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.AmuletExtendReach;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;
import com.themastergeneral.ctdtweaks.items.baubles.RingFlight;
import com.themastergeneral.ctdtweaks.items.baubles.RingHaste;
import com.themastergeneral.ctdtweaks.items.baubles.RingInvis;
import com.themastergeneral.ctdtweaks.items.baubles.RingSpeed;
import com.themastergeneral.ctdtweaks.items.baubles.TrinketHealth;

public class ModItems extends RegisterItem {
	public static BasicCore corecombat;

	public static BasicItem nuggettin;
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
	
	public static AmuletExtendReach amuletreach;
	public static AmuletExtendReach creativeamuletreach;
	
	public static TrinketHealth trinketHealth;

	public static ItemDrill drill;

	public static ArmorMaterial weak_armor = EnumHelper.addArmorMaterial(
			"weak_armor", "ctdtweaks:weak_armor", 100,
			new int[] { 0, 0, 0, 0 }, (int) 0F,
			SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);

	public static void init() {
		corecombat = register(new BasicCore("corecombat", CTDTweaks.MODID,
				Config.combatcoredurability));

		fuelwither = register(new BasicItem("fuelwither", CTDTweaks.MODID));
		coreglowing = register(new BasicItem("coreglowing", CTDTweaks.MODID));
		refinedwitherfuel = register(new BasicItem("refinedwitherfuel",
				CTDTweaks.MODID));

		flightcore = register(new RingFlight("flightcore", CTDTweaks.MODID));

		enchantedgoldingot = register(new BasicGlow("enchantedgoldingot",
				CTDTweaks.MODID));

		steamedcarrot = register(new BasicFood("steamedcarrot", 6, 0.65F,
				false, CTDTweaks.MODID));

		nightvision = register(new SpecialArmor("nightvision", weak_armor, 0,
				EntityEquipmentSlot.HEAD, CTDTweaks.MODID));
		glowingamulet = register(new SpecialArmor("glowingamulet", weak_armor,
				1, EntityEquipmentSlot.CHEST, CTDTweaks.MODID));
		goodbyeboots = register(new SpecialArmor("goodbyeboots", weak_armor, 3,
				EntityEquipmentSlot.FEET, CTDTweaks.MODID));

		basering = register(new BasicRing("basering", CTDTweaks.MODID));
		hastering = register(new RingHaste("hastering", CTDTweaks.MODID));
		speedring = register(new RingSpeed("speedring", CTDTweaks.MODID));
		invisring = register(new RingInvis("invisring", CTDTweaks.MODID));
		
		amuletreach = register(new AmuletExtendReach("amuletreach", CTDTweaks.MODID, Config.reachAmuletRange));
		creativeamuletreach = register(new AmuletExtendReach("creativeamuletreach", CTDTweaks.MODID, Config.creativereachAmuletRange));
		
		trinketHealth = register(new TrinketHealth("trinketHealth", CTDTweaks.MODID));

		//destructo_sword = register(new VoidSword("destructo_sword", CTDTweaks.MODID,
		//		ToolMaterial.IRON)); // Soon... gotta bugfix first.

		// drill = register(new ItemDrill("drill", CTDTweaks.MODID)); //Not yet :D
	}
}
