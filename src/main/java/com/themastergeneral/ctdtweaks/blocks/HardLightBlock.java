package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdtweaks.Main;

public class HardLightBlock extends BasicBlock {

	public HardLightBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setHardness(50F);
		this.setLightLevel(15F);
		this.setResistance(6000);
	}
}
