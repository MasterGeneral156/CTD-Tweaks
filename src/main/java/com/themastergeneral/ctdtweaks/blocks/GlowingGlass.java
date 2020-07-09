package com.themastergeneral.ctdtweaks.blocks;

import com.themastergeneral.ctdtweaks.CTDTweaks;

import net.minecraft.block.material.Material;

public class GlowingGlass extends SoulSandGlass 
{

	public GlowingGlass(String name) {
		super(Material.GLASS, name);
		this.setLightLevel(15F);
		this.setResistance(6000);
	}

}
