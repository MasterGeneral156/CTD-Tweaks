package com.themastergeneral.ctdtweaks.items;

import java.util.concurrent.TimeUnit;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpecialArmor extends BasicArmor {
	private World world;

	public SpecialArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (!world.isRemote)
		{
			if (itemStack.getItem() == ModItems.nightvision) 
			{
				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 300, 0, true, false));
			}
			if (itemStack.getItem() == ModItems.goodbyeboots) 
			{
				if (player.capabilities.isCreativeMode) 
				{
					player.setGameType(GameType.SURVIVAL);
				}
				int dmg = itemStack.getItemDamage();
				player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 50, true, false));
				player.inventory.decrStackSize(36, 1);
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.goodbyeboots, 1,  dmg + 1));
			}
		}
	}
}
