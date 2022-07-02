package com.themastergeneral.ctdtweaks.items;

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
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

public class CobbleGenItem extends CTDItem
{

	public CobbleGenItem() {
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(1));
	}

	protected int maxCobble = 64;	//Max on player
	protected int genRate = 40;		//Ticks to gen cobble
	int ticksToGen = 0;
	
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
				if ((water > 0) && (lava > 0))
				{
					//Check player to ensure we're not giving too much cobble.
					if (cobble < this.maxCobble)
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
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) 
	{
		tooltip.add(new TranslatableComponent("Generates 1 Cobblestone every " + genRate + " ticks, up to a max of " + maxCobble + "."));
		tooltip.add(new TranslatableComponent("§4Must have Water and Lava buckets in inventory!!"));
	}
}
