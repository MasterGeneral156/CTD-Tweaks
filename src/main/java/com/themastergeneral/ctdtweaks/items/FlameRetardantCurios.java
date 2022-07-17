package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class FlameRetardantCurios extends CTDItem implements ICurioItem {

	public FlameRetardantCurios() 
	{
		super(new Item.Properties().tab(CTDTweaks.CreativeTab).stacksTo(1).defaultDurability(64));
	}
	
	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) 
	{
		LivingEntity wearer = slotContext.entity();
		if (wearer instanceof Player)
		{
			Player player = (Player) wearer;
			if(player.isOnFire())
			{
				if (!player.getCooldowns().isOnCooldown(stack.getItem()))
				{
					stack.hurtAndBreak(1, player, (p_41300_) -> {
		                  p_41300_.broadcastBreakEvent(player.getEquipmentSlotForItem(stack));
		               });
					player.getCooldowns().addCooldown(stack.getItem(), 20);
					player.clearFire();
				}
			}
		}
	}

}
