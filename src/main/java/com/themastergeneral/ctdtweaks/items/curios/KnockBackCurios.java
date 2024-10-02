package com.themastergeneral.ctdtweaks.items.curios;

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.item.CTDItem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class KnockBackCurios extends CTDItem implements ICurioItem  
{
	public double knockback;
	
	public KnockBackCurios(double knockback) 
	{
		super(new Properties().stacksTo(1));
		this.knockback = knockback;
	}
	
	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player player)
			player.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(player.getAttributeValue(Attributes.ATTACK_KNOCKBACK) + this.knockback);
	}
	
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player player)
			player.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(Attributes.ATTACK_KNOCKBACK.getDefaultValue());
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) 
	{
		tooltip.add(Component.literal("+" + this.knockback + " attack knockback."));
	}
}
