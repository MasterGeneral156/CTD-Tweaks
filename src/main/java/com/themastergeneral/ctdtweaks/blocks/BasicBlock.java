package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class BasicBlock extends CTDBlock implements ItemModelProvider
{
	protected String name;
	public BasicBlock(Material materialIn, String name, String modid) 
	{
		super(materialIn, name, modid);
		this.setCreativeTab(Main.creativeTab);
	}
}
