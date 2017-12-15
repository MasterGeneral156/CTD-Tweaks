package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdtweaks.CTDTweaks;

public class BasicBlock extends CTDBlock {
	protected String name;

	public BasicBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setCreativeTab(CTDTweaks.creativeTab);
	}
}
