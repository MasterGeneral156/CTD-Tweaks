package themastergeneral.ctdmoderntweaks.registers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;

public class ItemFlightCore extends Item implements ItemModelProvider
{
	 
	 protected String name;
	 public ItemFlightCore(String name, int durability) {
	 this.name = name;
	 this.setUnlocalizedName(name);
	 this.setRegistryName(name);
	 this.setCreativeTab(ctdmoderntweaks.creativeTab);
	 this.maxStackSize = 1;
	 this.setMaxDamage(durability - 1);
	 this.setNoRepair();
	 }
	 
	 @Override
	 public void registerItemModel(Item item) 
	 {
		 ctdmoderntweaks.proxy.registerItemRenderer(this, 0, name);
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
		 stack.stackSize = 1;
		 return stack;
	 }
	 @Override
	 public void onUpdate(ItemStack stack, World worldIn, EntityPlayer entityIn, int itemSlot, boolean isSelected)
	 {
		 super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		if (entityIn instanceof EntityLivingBase)	// If the Entity is an instance of EntityLivingBase,
		{
			entityIn.capabilities.allowFlying = true;
		}
		else
		{
			
		}
	 }
	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack) {
	      par1ItemStack.setTagInfo("ench", new NBTTagList());
	      return true;
	 }
}
