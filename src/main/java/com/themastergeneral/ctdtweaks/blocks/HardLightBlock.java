package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;

public class HardLightBlock extends BasicBlock {

	public HardLightBlock(Material materialIn, String name) {
		super(materialIn, name);
		this.setHardness(50F);
		this.setLightLevel(15F);
		this.setResistance(6000);
	}
}
