package com.themastergeneral.ctdtweaks.items;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class CobbleGenItem extends BaseItem
{

	protected int maxCobble = 64;	//Max on player
	protected int genRate = 40;		//Ticks to gen cobble
	int ticksToGen = 0;
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int int1, boolean bool1)
	{
		if (entity instanceof Player)
		{
			Player player = (Player) entity;
			int lava = player.getInventory().countItem(Items.LAVA_BUCKET);
			int water = player.getInventory().countItem(Items.WATER_BUCKET);
			int cobble = player.getInventory().countItem(Blocks.COBBLESTONE.asItem());
			
			//Check that player has lava and water buckets in inventory
			if ((water > 0) && (lava > 0))
			{
				//Check player to ensure we're not giving too much cobble.
				if (cobble <= this.maxCobble)
				{
					this.ticksToGen++;
					if (this.ticksToGen == this.genRate)
					{
						player.addItem(new ItemStack(Blocks.COBBLESTONE));
						this.ticksToGen = 0;
					}
				}
			}
			else
			{
				this.ticksToGen = 0;
			}
		}
	}
}
