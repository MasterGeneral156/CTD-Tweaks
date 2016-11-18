package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BasicArmor extends ItemArmor implements ItemModelProvider
{
	public final EntityEquipmentSlot armorType;
	public final int damageReduceAmount;
    public final float toughness;
    public final int renderIndex;
	private String name;
    
	public BasicArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
        this.armorType = equipmentSlotIn;
        this.renderIndex = renderIndexIn;
        this.damageReduceAmount = materialIn.getDamageReductionAmount(equipmentSlotIn);
        this.setMaxDamage(materialIn.getDurability(equipmentSlotIn));
        this.toughness = materialIn.getToughness();
        this.maxStackSize = 1;
        this.setCreativeTab(Main.creativeTab);	
        this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}
