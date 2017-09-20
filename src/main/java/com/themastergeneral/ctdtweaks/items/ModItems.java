package com.themastergeneral.ctdtweaks.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.baubles.BasicRing;
import com.themastergeneral.ctdtweaks.items.baubles.RingFlight;
import com.themastergeneral.ctdtweaks.items.baubles.RingHaste;
import com.themastergeneral.ctdtweaks.items.baubles.RingInvis;
import com.themastergeneral.ctdtweaks.items.baubles.RingSpeed;

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

	public static ItemDrill drill;

	public static ArmorMaterial weak_armor = EnumHelper.addArmorMaterial(
			"weak_armor", "ctdtweaks:weak_armor", 100,
			new int[] { 0, 0, 0, 0 }, (int) 0F,
			SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);

	public static void init() {
		corecombat = register(new BasicCore("corecombat", Main.MODID, 0));

		fuelwither = register(new BasicItem("fuelwither", Main.MODID));
		coreglowing = register(new BasicItem("coreglowing", Main.MODID));
		refinedwitherfuel = register(new BasicItem("refinedwitherfuel",
				Main.MODID));

		flightcore = register(new RingFlight("flightcore", Main.MODID));

		enchantedgoldingot = register(new BasicGlow("enchantedgoldingot",
				Main.MODID));

		steamedcarrot = register(new BasicFood("steamedcarrot", 6, 0.65F,
				false, Main.MODID));

		nightvision = register(new SpecialArmor("nightvision", weak_armor, 0,
				EntityEquipmentSlot.HEAD, Main.MODID));
		glowingamulet = register(new SpecialArmor("glowingamulet", weak_armor,
				1, EntityEquipmentSlot.CHEST, Main.MODID));
		goodbyeboots = register(new SpecialArmor("goodbyeboots", weak_armor, 3,
				EntityEquipmentSlot.FEET, Main.MODID));

		basering = register(new BasicRing("basering", Main.MODID));
		hastering = register(new RingHaste("hastering", Main.MODID));
		speedring = register(new RingSpeed("speedring", Main.MODID));
		invisring = register(new RingInvis("invisring", Main.MODID));

		// destructo_sword = register(new VoidSword("destructo_sword",
		// Main.MODID, ToolMaterial.IRON)); //Soon... gotta bugfix first.

		// drill = register(new ItemDrill("drill", Main.MODID)); //Not yet :D
	}
}
