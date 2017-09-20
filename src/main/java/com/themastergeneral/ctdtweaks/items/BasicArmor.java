package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BasicArmor extends ItemArmor implements ItemModelProvider {
	public final EntityEquipmentSlot armorType;
	public final int damageReduceAmount;
	public final float toughness;
	public final int renderIndex;
	private String name;
	private String modid;

	public BasicArmor(String name, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn, String modid) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.armorType = equipmentSlotIn;
		this.renderIndex = renderIndexIn;
		this.damageReduceAmount = materialIn
				.getDamageReductionAmount(equipmentSlotIn);
		this.setMaxDamage(materialIn.getDurability(equipmentSlotIn));
		this.toughness = materialIn.getToughness();
		this.maxStackSize = 1;
		this.setCreativeTab(com.themastergeneral.ctdtweaks.Main.creativeTab);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}
}
