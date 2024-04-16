package com.themastergeneral.ctdtweaks.items.curios;

import com.themastergeneral.ctdcore.item.CTDItem;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CuriosSunnBlock extends CTDItem implements ICurioItem 
{

	public CuriosSunnBlock() 
	{
		super(new Properties().defaultDurability(128).setNoRepair());
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		float startHP = wearer.getHealth();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			if (!player.getCooldowns().isOnCooldown(stack.getItem()))
			{
				if (player.getLastDamageSource() != null)	//null check
				{
					DamageSource playerDmgd = player.getLastDamageSource();
					if (playerDmgd.getEntity() instanceof LivingEntity && playerDmgd.getEntity().isAlive())	//make sure dmg src is entity
					{
						stack.hurtAndBreak(1, player, (p_41300_) -> {
			                  p_41300_.broadcastBreakEvent(Player.getEquipmentSlotForItem(stack));
			               });
						player.getCooldowns().addCooldown(stack.getItem(), 102);	//might just be better to have the cooldown longer 
																					//just to have the game internally clear the last 
																					//damage source? idfk
						float currentHP = player.getHealth();
						float damageDealt = startHP - currentHP;
						player.getLastDamageSource().getEntity().hurt(playerDmgd, damageDealt);
					}
				}
			}
		}
	}
}
