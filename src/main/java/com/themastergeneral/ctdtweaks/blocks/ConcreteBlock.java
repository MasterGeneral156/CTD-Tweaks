package com.themastergeneral.ctdtweaks.blocks;

import javax.annotation.Nullable;

import com.themastergeneral.ctdtweaks.config.Config;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ConcreteBlock extends BasicBlock {
	protected static final AxisAlignedBB CONCRETE_AABB = new AxisAlignedBB(
			0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

	public ConcreteBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setHardness(1.8F);
		this.setHarvestLevel("pickaxe", 0);
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState,
			IBlockAccess worldIn, BlockPos pos) {
		return CONCRETE_AABB;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos,
			IBlockState state, Entity entityIn) {
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(
				MobEffects.SPEED, 20, 3, true, false));
	}

}
