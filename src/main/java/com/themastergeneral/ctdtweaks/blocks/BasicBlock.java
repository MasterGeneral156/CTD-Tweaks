package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class BasicBlock extends Block implements ItemModelProvider
{
	protected String name;
	public BasicBlock(Material materialIn, String name, Boolean isBlock) 
	{
		super(materialIn);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.creativeTab);
		this.fullBlock=isBlock;
	}
	
	@Override
	public void registerItemModel(Item itemBlock) 
	{
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}	
}
