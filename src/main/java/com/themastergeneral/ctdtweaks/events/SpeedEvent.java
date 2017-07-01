package com.themastergeneral.ctdtweaks.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import com.themastergeneral.ctdtweaks.items.ModItems;

public class SpeedEvent 
{
	@SubscribeEvent
	public void onTickPlayerEvent(PlayerTickEvent event)
	{
		if(event.phase == Phase.START)
		{
			EntityPlayer player = (EntityPlayer) event.player;
			if(player.inventory.hasItemStack(new ItemStack(ModItems.speedring)))
			{
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2, true, false));
			}
			else
			{
				player.removeActivePotionEffect(MobEffects.SPEED);
			}
			if(event.phase == Phase.END)
			{

			}
		}
	}
}
