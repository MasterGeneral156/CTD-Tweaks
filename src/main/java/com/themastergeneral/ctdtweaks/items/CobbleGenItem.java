/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.items.CobbleGenItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
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

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.config.PocketCobbleConfig;

import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CobbleGenItem extends CTDItem implements ICurioItem
{

	public CobbleGenItem() {
		super(new Item.Properties().stacksTo(1));
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int int1, boolean bool1)
	{
		if (!level.isClientSide)
		{
			if (entity instanceof Player)
			{
				Player player = (Player) entity;
				int lava = player.getInventory().countItem(Items.LAVA_BUCKET);
				int water = player.getInventory().countItem(Items.WATER_BUCKET);
				int cobble = player.getInventory().countItem(Blocks.COBBLESTONE.asItem());
				
				//Check that player has lava and water buckets in inventory
				if (((water > 0) && (lava > 0)) || (!PocketCobbleConfig.REQUIRE_BUCKETS.get()))
				{
					//Check player to ensure we're not giving too much cobble.
					if (cobble < PocketCobbleConfig.MAX_STACK.get())
					{
						if (!player.getCooldowns().isOnCooldown(stack.getItem()))
						{
							player.addItem(new ItemStack(Blocks.COBBLESTONE));
							player.awardStat(Stats.ITEM_USED.get(this));
							player.getCooldowns().addCooldown(stack.getItem(), PocketCobbleConfig.GEN_TICKS.get());
						}
					}
				}
			}
		}
	}
	
	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		Entity wearer = slotContext.entity();
		if (!wearer.getLevel().isClientSide)
		{
			if (wearer instanceof Player)
			{
				Player player = (Player) wearer;
				int lava = player.getInventory().countItem(Items.LAVA_BUCKET);
				int water = player.getInventory().countItem(Items.WATER_BUCKET);
				int cobble = player.getInventory().countItem(Blocks.COBBLESTONE.asItem());
				
				//Check that player has lava and water buckets in inventory
				if (((water > 0) && (lava > 0)) || (!PocketCobbleConfig.REQUIRE_BUCKETS.get()))
				{
					//Check player to ensure we're not giving too much cobble.
					if (cobble < PocketCobbleConfig.MAX_STACK.get())
					{
						if (!player.getCooldowns().isOnCooldown(stack.getItem()))
						{
							player.addItem(new ItemStack(Blocks.COBBLESTONE));
							player.awardStat(Stats.ITEM_USED.get(this));
							player.getCooldowns().addCooldown(stack.getItem(), PocketCobbleConfig.GEN_TICKS.get());
						}
					}
				}
			}
		}
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) 
	{
		tooltip.add(Component.literal("Generates 1 Cobblestone every " + PocketCobbleConfig.GEN_TICKS.get() + " ticks, up to a max of " + PocketCobbleConfig.MAX_STACK.get() + "."));
		if (PocketCobbleConfig.REQUIRE_BUCKETS.get())
			tooltip.add(Component.literal("�4Must have Water and Lava buckets in inventory!!"));
	}
}
