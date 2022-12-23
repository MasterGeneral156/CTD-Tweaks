/**
 * 
 */
package com.themastergeneral.ctdtweaks.items.curios;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class SunnBlockItem extends CTDItem implements ICurioItem 
{

	public SunnBlockItem() 
	{
		super(new Properties().defaultDurability(128).setNoRepair().tab(CTDTweaks.CreativeTab));
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
				if (wearer.getLastHurtByMob() != null)
				{
					stack.hurtAndBreak(1, player, (p_41300_) -> {
		                  p_41300_.broadcastBreakEvent(Player.getEquipmentSlotForItem(stack));
		               });
					player.getCooldowns().addCooldown(stack.getItem(), 20);
					float currentHP = wearer.getHealth();
					float damageDealt = startHP - currentHP;
					LivingEntity attacker = wearer.getLastHurtByMob();
					attacker.hurt(DamageSource.playerAttack(player), damageDealt);
				}
			}
		}
	}
}
