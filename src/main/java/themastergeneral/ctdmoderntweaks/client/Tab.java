package themastergeneral.ctdmoderntweaks.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;
import themastergeneral.ctdmoderntweaks.registers.ModItems;;

public class Tab extends CreativeTabs{

	public Tab() {
		super(ctdmoderntweaks.modId);
		//setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.coreCombat; //shown icon on creative tab
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return false;
	 }

}
