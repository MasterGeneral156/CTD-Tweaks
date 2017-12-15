package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.config.Config;
import com.themastergeneral.ctdtweaks.items.ModItems;

public class BasicBlock extends CTDBlock {
	protected String name;

	public BasicBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setCreativeTab(CTDTweaks.creativeTab);
	}
}
