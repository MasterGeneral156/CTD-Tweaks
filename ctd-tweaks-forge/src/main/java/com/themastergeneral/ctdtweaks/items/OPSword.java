/*
	Project:	CTD Tweaks 1.20
	File:		com.themastergeneral.ctdtweaks.items.OPSword
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Tweaks
	License:	MIT License

				Copyright (c) 2024 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.ctdtweaks.items;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.ctdtweaks.CTDTweaksRef;
import com.themastergeneral.ctdtweaks.TiersCTDTweaks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;

import javax.annotation.Nullable;
import java.util.List;

public class OPSword extends SwordItem {

	public float attackDmg;
	ITagManager<Item> tagManager = ForgeRegistries.ITEMS.tags();

	public OPSword(int attackDmg, float speed) {
		super(TiersCTDTweaks.OP_TIER, attackDmg, speed, new Properties().stacksTo(1).defaultDurability(TiersCTDTweaks.OP_TIER.getUses())); // Pass 0 or some base value here
		this.attackDmg = attackDmg;
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity attacker, LivingEntity defender) {
		super.hurtEnemy(stack, attacker, defender);
		if (tagManager.getTag(CTDTweaksRef.voidDamage).contains(stack.getItem())) {
			attacker.hurt(defender.damageSources().fellOutOfWorld(), getDamage());
		}
		doWeaponSpecificAction(stack, attacker, defender);
		return true;
	}

	@Override
	public float getDamage() {
		return this.attackDmg; // Return the actual damage value without casting to int
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if (tagManager.getTag(CTDTweaksRef.voidDamage).contains(stack.getItem()))
			tooltip.add(ModUtils.displayTranslation("item.ctdtweaks.destruction_item.desc"));
		if (tagManager.getTag(CTDTweaksRef.burnDamage).contains(stack.getItem()))
			tooltip.add(ModUtils.displayTranslation("item.ctdtweaks.fire_item.desc"));
		if (stack.getItem() == ModItems.op_sword)
			tooltip.add(ModUtils.displayTranslation("item.ctdtweaks.op_sword.desc"));
		if (stack.getItem() == ModItems.op_hammer)
			tooltip.add(ModUtils.displayTranslation("item.ctdtweaks.op_hammer.desc"));
	}

	protected void doWeaponSpecificAction(ItemStack stack, LivingEntity attacker, LivingEntity defender) {
		Item item = stack.getItem();
		if (defender instanceof Player defp) {
			//Void damage cooldown, give attacker some weakness
			if (tagManager.getTag(CTDTweaksRef.voidDamage).contains(item))
			{
				defp.getCooldowns().addCooldown(defp.getMainHandItem().getItem(), 15);
				attacker.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1, 30));
			}

		}
		else
		{
			if (tagManager.getTag(CTDTweaksRef.confusionDamage).contains(item))
			{
				defender.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 175, 1, true, false));
			}
			else if (tagManager.getTag(CTDTweaksRef.burnDamage).contains(item))
			{
				defender.setSecondsOnFire(5);
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int int1, boolean bool1)
	{
		if (entity instanceof LivingEntity living) {
			if (tagManager.getTag(CTDTweaksRef.heavyWeapon).contains(stack.getItem()))
				living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 2, true, false));
		}
	}
}
