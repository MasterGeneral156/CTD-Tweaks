package com.themastergeneral.ctdtweaks.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BaseBlock extends CTDBlock {

	public BaseBlock() {
		super(Block.Properties.of(Material.GLASS, MaterialColor.STONE)
				.strength(2F)
				.sound(SoundType.STONE));
	}

}
