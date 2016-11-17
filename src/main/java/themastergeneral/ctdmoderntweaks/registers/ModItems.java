package themastergeneral.ctdmoderntweaks.registers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemCore coreCombat;
	public static ItemBase nuggetTin;
	public static ItemBase fuelWither;
	public static ItemGlow enchantedGoldIngot;
	public static ItemBase coreFlight;
	
	 public static void init() 
	 {
		 nuggetTin = register(new ItemBase("nuggetTin"));
		 fuelWither = register(new ItemBase("fuelWither"));
		 coreCombat = register(new ItemCore("coreCombat", 65));
		 enchantedGoldIngot = register(new ItemGlow("enchantedGoldIngot"));
		 coreFlight = register(new ItemBase("coreFlight"));
		  
	 }
	
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}
