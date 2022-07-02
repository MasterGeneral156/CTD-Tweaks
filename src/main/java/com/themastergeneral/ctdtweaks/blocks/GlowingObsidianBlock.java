package com.themastergeneral.ctdtweaks.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class GlowingObsidianBlock extends CTDBlock {

	public GlowingObsidianBlock() {
		super(Block.Properties.of(Material.STONE, MaterialColor.STONE)
				.strength(50F)
				.explosionResistance(12000)
				.lightLevel((p_50755_) -> {
				      return 15;
				   })
				.sound(SoundType.STONE));
	}

}
