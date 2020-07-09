package com.themastergeneral.ctdtweaks.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlowingBlock extends BasicBlock {

	public GlowingBlock(Material materialIn, String name) {
		super(materialIn, name);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		par1ItemStack.setTagInfo("ench", new NBTTagList());
		return true;
	}
}
