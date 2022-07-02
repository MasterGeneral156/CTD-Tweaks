package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class SpeedCuriosItem extends CTDItem implements ICurioItem {

	public SpeedCuriosItem() {
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(1));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if(!wearer.hasEffect(MobEffects.MOVEMENT_SPEED)) 
		{
            MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Integer.MAX_VALUE, 2, false, false);
            if(wearer.level.isClientSide) effectInstance.setNoCounter(true);
            wearer.addEffect(effectInstance);
        }
	}
	
	@Override
	public void onUnequip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		wearer.removeEffect(MobEffects.MOVEMENT_SPEED);
	}
	
	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if(!wearer.hasEffect(MobEffects.MOVEMENT_SPEED)) 
		{
			MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Integer.MAX_VALUE, 2, false, false);
            if(wearer.level.isClientSide) effectInstance.setNoCounter(true);
            wearer.addEffect(effectInstance);
		}
	}
}
