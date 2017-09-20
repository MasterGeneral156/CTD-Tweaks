package com.themastergeneral.ctdtweaks.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.config.Config;

public class VoidSword extends ItemSword implements ItemModelProvider {
	protected String name;
	protected String modid;

	public VoidSword(String name, String modid, ToolMaterial material) {
		super(material);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setMaxStackSize(1);
	}

	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target,
			EntityLivingBase attacker) {
		target.attackEntityFrom(DamageSource.OUT_OF_WORLD, Float.MAX_VALUE);
		// target.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE,
		// 20, 2048, true, false));
		return true;
	}
}
