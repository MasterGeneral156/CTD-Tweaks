/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.items.FlightCuriosItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2022 MasterGeneral156
				
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
package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class FlightCuriosItem extends CTDItem implements ICurioItem {

	public FlightCuriosItem()
	{
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(1));
	}
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
