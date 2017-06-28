package com.themastergeneral.ctdtweaks.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class FlightRing extends BasicRing {

	public FlightRing(String name, String modid) 
	{
		super(name, modid);
		this.maxStackSize = 1;
	}
}
