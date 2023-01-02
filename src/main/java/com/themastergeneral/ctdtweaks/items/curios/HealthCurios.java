package com.themastergeneral.ctdtweaks.items.curios;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.HealthTrinketConfig;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class HealthCurios extends CTDItem implements ICurioItem {

	private double healthGain;
	
	public HealthCurios(double healthGain) 
	{
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(HealthTrinketConfig.MAX_STACK.get()));
		this.healthGain = healthGain;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			double hp = player.getMaxHealth() + (stack.getCount() * this.healthGain);
			player.getAttribute(Attributes.MAX_HEALTH).setBaseValue(hp);
		}
	}
	
	@Override
	public void onUnequip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			double hp = player.getMaxHealth() - (stack.getCount() * this.healthGain);
			player.getAttribute(Attributes.MAX_HEALTH).setBaseValue(hp);
			
			//set hp to normal when unequipped...
			if (player.getHealth() > hp)
				player.setHealth((float) hp);
		}
	}
}
