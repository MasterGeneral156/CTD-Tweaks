package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.Main;

public class BasicBlock extends CTDBlock implements ItemModelProvider {
	protected String name;

	public BasicBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setCreativeTab(Main.creativeTab);
	}
}
