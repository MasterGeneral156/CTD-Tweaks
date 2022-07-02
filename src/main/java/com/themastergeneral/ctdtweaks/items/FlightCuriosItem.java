package com.themastergeneral.ctdtweaks.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class FlightCuriosItem extends BaseItem implements ICurioItem {

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			player.getAbilities().flying = true;
			player.getAbilities().mayfly = true;
			player.onUpdateAbilities();
		}
	}
	
	@Override
	public void onUnequip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			player.getAbilities().flying = false;
			player.getAbilities().mayfly = false;
			player.onUpdateAbilities();
		}
	}
	
	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			if(!player.getAbilities().mayfly)
			{
				player.getAbilities().flying = false;
				player.getAbilities().mayfly = false;
				player.onUpdateAbilities();
			}
		}
	}
}
