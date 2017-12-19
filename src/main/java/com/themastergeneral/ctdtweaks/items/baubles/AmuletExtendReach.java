package com.themastergeneral.ctdtweaks.items.baubles;

import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmuletExtendReach extends BasicAmulet {

	private int range;

	public AmuletExtendReach(String name, String modid, int ranged) {
		super(name, modid);
		range = ranged;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase entity) {
		EntityPlayer player = (EntityPlayer) entity;
		player.getEntityAttribute(player.REACH_DISTANCE).setBaseValue(
				(double) range);
	}

	@Override
	public void onUnequipped(ItemStack stack, EntityLivingBase entity) {
		EntityPlayer player = (EntityPlayer) entity;
		Double reach = player.getEntityAttribute(player.REACH_DISTANCE)
				.getAttributeValue();
		if (reach != null) {
			if (reach != 5D) {
				player.getEntityAttribute(player.REACH_DISTANCE).setBaseValue(
						5D);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		if (stack.getItem() == ModItems.creativeamuletreach) {
			stack.setTagInfo("ench", new NBTTagList());
			return true;
		} else {
			return false;
		}
	}

}
