package com.themastergeneral.ctdtweaks.events;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class FlightEvent 
{
	@SubscribeEvent
	public void onTickPlayerEvent(PlayerTickEvent event)
	{
		if(event.phase == Phase.START)
		{
			EntityPlayer player = (EntityPlayer) event.player;
			if(player.inventory.hasItemStack(new ItemStack(ModItems.flightcore)))
			{
				player.capabilities.allowFlying = true;
			}
			else
			{
				if(player.capabilities.isFlying == true)
				{
					player.capabilities.isFlying = player.capabilities.isCreativeMode ? true : false;
					player.capabilities.allowFlying = player.capabilities.isCreativeMode ? true : false;
				}
			}
			if(event.phase == Phase.END)
			{

			}
		}
	}
}
