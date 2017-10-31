package com.themastergeneral.ctdtweaks.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

import com.themastergeneral.ctdcore.helpers.WorldHelper;
import com.themastergeneral.ctdtweaks.config.Config;

public class ItemDrill extends BasicItem {
	public ItemDrill(String name, String modid) {
		super(name, modid);
		this.setMaxDamage(2048);
		this.setHarvestLevel("shovel", Config.drillMiningLevel);
		this.setHarvestLevel("pickaxe", Config.drillMiningLevel);
	}

	@Override
	public int getHarvestLevel(ItemStack stack, String toolClass,
			EntityPlayer player, IBlockState blockState) {
		return Config.drillMiningLevel;
	}

	/*public boolean breakBlocks(ItemStack stack, int radius, World world,
			BlockPos aPos, int side, EntityPlayer player) {
		int xRange = radius;
		int yRange = radius;
		int zRange = 0;

		// Corrects Blocks to hit depending on Side of original Block hit
		if (side == 0 || side == 1) {
			zRange = radius;
			yRange = 0;
		}
		if (side == 4 || side == 5) {
			xRange = 0;
			zRange = radius;
		}

		// Not defined later because main Block is getting broken below
		IBlockState state = world.getBlockState(aPos);
		float mainHardness = state.getBlockHardness(world, aPos);

		// Break Middle Block first
		if (stack.getItemDamage() >= 1) {
			if (!this.tryHarvestBlock(world, aPos, false, stack, player, 1)) {
				return false;
			}
		} else {
			return false;
		}

		// Break Blocks around
		if (radius > 0 && mainHardness >= 0.2F) {
			for (int xPos = aPos.getX() - xRange; xPos <= aPos.getX() + xRange; xPos++) {
				for (int yPos = aPos.getY() - yRange; yPos <= aPos.getY()
						+ yRange; yPos++) {
					for (int zPos = aPos.getZ() - zRange; zPos <= aPos.getZ()
							+ zRange; zPos++) {
						if (!(aPos.getX() == xPos && aPos.getY() == yPos && aPos
								.getZ() == zPos)) {
							if (stack.getItemDamage() >= 1) {
								// Only break Blocks around that are (about) as
								// hard or softer
								BlockPos thePos = new BlockPos(xPos, yPos, zPos);
								IBlockState theState = world
										.getBlockState(thePos);
								if (theState.getBlockHardness(world, thePos) <= mainHardness + 5.0F) {
									this.tryHarvestBlock(world, thePos, true,
											stack, player, 1);
								}
							} else {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	private boolean tryHarvestBlock(World world, BlockPos pos, boolean isExtra,
			ItemStack stack, EntityPlayer player, int use) {
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		float hardness = block.getBlockHardness(state, world, pos);
		boolean canHarvest = (ForgeHooks.canHarvestBlock(block, player, world,
				pos) || this.canHarvestBlock(state, stack))
				&& (!isExtra || this.getStrVsBlock(stack,
						world.getBlockState(pos)) > 1.0F);
		if (hardness >= 0.0F
				&& (!isExtra || (canHarvest && !block.hasTileEntity(world
						.getBlockState(pos))))) {
			stack.damageItem(use, player);
			return WorldHelper.playerHarvestBlock(stack, world, player, pos);
		}
		return false;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack stack, BlockPos pos,
			EntityPlayer player) {
		boolean toReturn = false;
		if (stack.getItemDamage() >= 1) {
			// Block hit
			RayTraceResult ray = WorldHelper
					.getNearestBlockWithDefaultReachDistance(player.world,
							player);
			if (ray != null) {
				int side = ray.sideHit.ordinal();
				// Breaks the Blocks
				toReturn = this.breakBlocks(stack, 2, player.world, pos, side,
						player);
			}
		}
		return toReturn;
	}*/
}
