/*
	Project:	CTD Tweaks 1.20
	File:		com.themastergeneral.ctdtweaks.items.curios.CuriosSunnBlock
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2024 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.ctdtweaks.items.curios;

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.item.CTDItem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CuriosSunnBlock extends CTDItem implements ICurioItem 
{

	public CuriosSunnBlock() 
	{
		super(new Properties().defaultDurability(128).setNoRepair());
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		float startHP = wearer.getHealth();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			if (!player.getCooldowns().isOnCooldown(stack.getItem()))
			{
				if (player.getLastDamageSource() != null)	//null check
				{
					DamageSource playerDmgd = player.getLastDamageSource();
					if (playerDmgd.getEntity() instanceof LivingEntity && playerDmgd.getEntity().isAlive())	//make sure dmg src is entity
					{
						stack.hurtAndBreak(1, player, (p_41300_) -> {
			                  p_41300_.broadcastBreakEvent(Player.getEquipmentSlotForItem(stack));
			               });
						player.getCooldowns().addCooldown(stack.getItem(), 102);	//might just be better to have the cooldown longer 
																					//just to have the game internally clear the last 
																					//damage source? idfk
						float currentHP = player.getHealth();
						float damageDealt = startHP - currentHP;
						player.getLastDamageSource().getEntity().hurt(playerDmgd, damageDealt);
					}
				}
			}
		}
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) 
	{
		tooltip.add(Component.literal("Thorns, but passes damage back to the attacker"));
	}
}
