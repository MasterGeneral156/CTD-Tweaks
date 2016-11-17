package themastergeneral.ctdmoderntweaks.processing;

import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;
import themastergeneral.ctdmoderntweaks.registers.ModBlocks;
import themastergeneral.ctdmoderntweaks.registers.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		Item var1 = fuel.getItem();
		
		if(var1 == Item.getItemFromBlock(ModBlocks.fuelWitherBlock))
		{
			return 100000;
		}
		else if (var1 == ModItems.fuelWither)
		{
			return 10000;
		}
		else
		{
			return 0;
		}
	}
}
