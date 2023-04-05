/*
	Project:	CTD Tweaks 1.19
	File:		com.themastergeneral.ctdtweaks.items.TeleporterItem
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

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TeleporterItem extends BaseDurabilityItem {
	
	public TeleporterItem(int durability) 
	{
		super(durability);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) 
	{
	      return 0.0F;
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) 
	{
		ItemStack stackIn = playerIn.getItemInHand(handIn);
		//Store coords in NBT
		if (playerIn.isCrouching())
		{
			setCoords(stackIn, playerIn);
			playerIn.displayClientMessage(Component.literal("Location set."), true);
			playerIn.getCooldowns().addCooldown(this, 10);
		}
		//TP to coords in NBT
		else
		{
			double posX = getCoordsX(stackIn);
			double posY = getCoordsY(stackIn);
			double posZ = getCoordsZ(stackIn);
			if (validTeleport(posX, posY, posZ))
			{
				stackIn.hurtAndBreak(1, playerIn, (p_41300_) -> {
	                  p_41300_.broadcastBreakEvent(playerIn.getEquipmentSlotForItem(stackIn));
	               });
				playerIn.getCooldowns().addCooldown(this, 200);
				playerIn.setPos(posX, posY, posZ);
				double rposX = Math.round(stackIn.getTag().getDouble("posX") * 100.0) / 100.0;
				double rposY = Math.round(stackIn.getTag().getDouble("posY") * 100.0) / 100.0;
				double rposZ = Math.round(stackIn.getTag().getDouble("posZ") * 100.0) / 100.0;
				playerIn.displayClientMessage(Component.literal(playerIn.getCommandSenderWorld().toString()), true);
				//playerIn.displayClientMessage(new TranslatableComponent("Teleported to X: " + rposX + " Y: " + rposY + " Z: " + rposZ + "."), true);
			}
			else
			{
				playerIn.displayClientMessage(Component.literal("Please set a location by crouching and right clicking at the same time."), true);
			}
		}
		return InteractionResultHolder.sidedSuccess(stackIn, worldIn.isClientSide());
	}
	
	public static void setCoords(ItemStack stackIn, Player playerIn)
	{		
		CompoundTag compoundnbt = new CompoundTag();
		int damage = stackIn.getDamageValue();
		compoundnbt.putDouble("posX", playerIn.getX());
		compoundnbt.putDouble("posY", playerIn.getY());
		compoundnbt.putDouble("posZ", playerIn.getZ());
		//compoundnbt.putString("posZ", playerIn.getLevel().toString());
		stackIn.setTag(compoundnbt);
		stackIn.hurtAndBreak(1, playerIn, (p_41300_) -> {
            p_41300_.broadcastBreakEvent(playerIn.getEquipmentSlotForItem(stackIn));
         });
	}
	
	public static double getCoordsX(ItemStack stackIn)
	{
		CompoundTag nbt = stackIn.getTag();
		return nbt.getDouble("posX");
	}
	
	public static double getCoordsY(ItemStack stackIn)
	{
		CompoundTag nbt = stackIn.getTag();
		return nbt.getDouble("posY");
	}
	
	public static double getCoordsZ(ItemStack stackIn)
	{
		CompoundTag nbt = stackIn.getTag();
		return nbt.getDouble("posZ");
	}
	
	public static boolean validTeleport(double posX, double posY, double posZ)
	{
		if ((posX == 0.0D) && (posY < 1.0D) && (posZ == 0.0D))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public void onCraftedBy(ItemStack stack, Level worldIn, Player playerIn) 
	{
		CompoundTag compoundnbt = new CompoundTag();
		compoundnbt.putDouble("posX", Double.NaN);
		compoundnbt.putDouble("posY", Double.NaN);
		compoundnbt.putDouble("posZ", Double.NaN);
		stack.setTag(compoundnbt);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) 
	{
		double posX = Math.round(stack.getTag().getDouble("posX") * 100.0) / 100.0;
		double posY = Math.round(stack.getTag().getDouble("posY") * 100.0) / 100.0;
		double posZ = Math.round(stack.getTag().getDouble("posZ") * 100.0) / 100.0;
		tooltip.add(Component.literal("Location X: " + posX + " Y: " + posY + " Z: " + posZ));
	}
}

