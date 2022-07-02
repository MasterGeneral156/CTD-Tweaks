package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.item.ItemStack;

public class BaseDurabilityItem extends CTDItem {

	public BaseDurabilityItem(int durability) {
		super(new Properties().stacksTo(1).tab(CTDTweaks.CreativeTab).defaultDurability(durability));
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
    {
		ItemStack newStack = itemStack.copy();
		newStack.setDamageValue(newStack.getDamageValue() + 1);
		return newStack;
        
    }
	
	@Override
	public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

}
