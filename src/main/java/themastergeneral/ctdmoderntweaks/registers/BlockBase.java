package themastergeneral.ctdmoderntweaks.registers;

import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import themastergeneral.ctdmoderntweaks.registers.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider{

	protected String name;
	
	public BlockBase(Material materialIn, String name, Boolean isBlock) {
		super(materialIn);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(ctdmoderntweaks.creativeTab); //this creativetab hasn't been implemented yet
		this.fullBlock=isBlock;
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		ctdmoderntweaks.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}	
}
