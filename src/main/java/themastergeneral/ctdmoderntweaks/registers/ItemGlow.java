package themastergeneral.ctdmoderntweaks.registers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;

public class ItemGlow extends Item implements ItemModelProvider
{
	protected String name;
	public ItemGlow(String name) 
	{
		 this.name = name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(ctdmoderntweaks.creativeTab); //this is commented out, because we don't have our creative-tab yet.
	}
	@Override
	public void registerItemModel(Item item) 
	{
		ctdmoderntweaks.proxy.registerItemRenderer(this, 0, name);
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
	     par1ItemStack.setTagInfo("ench", new NBTTagList());
	     return true;
	}
}