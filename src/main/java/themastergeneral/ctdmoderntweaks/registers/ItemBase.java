package themastergeneral.ctdmoderntweaks.registers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;

public class ItemBase extends Item implements ItemModelProvider
{ 
	protected String name;
	public ItemBase(String name) 
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(ctdmoderntweaks.creativeTab); //this is commented out, because we don't have our creative-tab yet.
	}
	@Override
	public void registerItemModel(Item item) 
	{
		ctdmoderntweaks.proxy.registerItemRenderer(this, 0, name);
	}
}