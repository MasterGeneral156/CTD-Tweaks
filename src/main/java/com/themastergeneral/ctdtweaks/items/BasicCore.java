package com.themastergeneral.ctdtweaks.items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasicCore extends BasicItem 
{
	public BasicCore(String name, int durability, String modid) 
	{
		super(name, modid);
		this.maxStackSize = 1;
		this.setMaxDamage(durability - 1);
		this.setNoRepair();
	}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	 {
		 return false;
	 }

	 @Override
	 public boolean getShareTag()
	 {
		 return true;
	 }
	 public boolean hasContainerItem(ItemStack itemStack)
	 {
		 return true;
	 }
	 @Override
	 public ItemStack getContainerItem(ItemStack itemStack)
	 {
		 ItemStack stack = itemStack.copy();
		 stack.setItemDamage(stack.getItemDamage() + 1);
		 this.maxStackSize = 1;
		 return stack;
	 }
	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack) {
	      par1ItemStack.setTagInfo("ench", new NBTTagList());
	      return true;
	 }
}
