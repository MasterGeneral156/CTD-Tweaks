package com.themastergeneral.ctdtweaks.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.BlockRenderRegister;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class SoulSandGlass extends BlockGlass implements ItemModelProvider,
		BlockRenderRegister {
	protected String name;
	protected String modid;

	public SoulSandGlass(Material materialIn, boolean ignoreSimilarity,
			String name, String modid) {
		super(materialIn, ignoreSimilarity);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(0.3F);
		this.setSoundType(SoundType.GLASS);
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	public int quantityDropped(Random random) {
		return 1;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(modid, itemBlock, 0, name);
	}

	@Override
	public void reg(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(modid + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));
	}
}
