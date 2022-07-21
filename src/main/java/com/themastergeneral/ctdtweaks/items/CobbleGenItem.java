package com.themastergeneral.ctdtweaks.items;

import java.util.List;

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.PocketCobbleConfig;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
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
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(1));
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
		tooltip.add(new TranslatableComponent("Generates 1 Cobblestone every " + PocketCobbleConfig.GEN_TICKS.get() + " ticks, up to a max of " + PocketCobbleConfig.MAX_STACK.get() + "."));
		if (PocketCobbleConfig.REQUIRE_BUCKETS.get())
			tooltip.add(new TranslatableComponent("§4Must have Water and Lava buckets in inventory!!"));
	}
}
