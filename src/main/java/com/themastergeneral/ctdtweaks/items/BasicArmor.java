package com.themastergeneral.ctdtweaks.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.CTDTweaks;

public class BasicArmor extends ItemArmor implements ItemModelProvider {
	public final EntityEquipmentSlot armorType;
	public final int damageReduceAmount;
	public final float toughness;
	public final int renderIndex;
	private String name;
	private String modid;

	public BasicArmor(String name, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.armorType = equipmentSlotIn;
		this.renderIndex = renderIndexIn;
		this.damageReduceAmount = materialIn
				.getDamageReductionAmount(equipmentSlotIn);
		this.setMaxDamage(materialIn.getDurability(equipmentSlotIn));
		this.toughness = materialIn.getToughness();
		this.maxStackSize = 1;
		this.setCreativeTab(CTDTweaks.creativeTab);
		this.name = name;
		this.modid = CTDTweaks.MODID;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}
}
