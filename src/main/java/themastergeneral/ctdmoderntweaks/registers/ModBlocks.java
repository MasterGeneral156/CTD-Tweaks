package themastergeneral.ctdmoderntweaks.registers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import themastergeneral.ctdmoderntweaks.registers.ItemModelProvider;

public class ModBlocks {
	public static BlockOre fuelWitherBlock;
	public static BlockBase monitor;
 
 public static void init() {
	 fuelWitherBlock = register(new BlockOre("fuelWitherBlock"));
	 monitor = register(new BlockBase(Material.IRON, "monitor", false));
 }
 
 private static <T extends Block> T register (T block, ItemBlock itemBlock) {
 
 GameRegistry.register(block);
 if(itemBlock != null) {
 GameRegistry.register(itemBlock);
 }
 
 if(block instanceof ItemModelProvider) {
 ((ItemModelProvider)block).registerItemModel(itemBlock);
 }
 
 return block;
 }
 
 private static <T extends Block> T register(T block) {
 ItemBlock itemBlock = new ItemBlock(block);
 itemBlock.setRegistryName(block.getRegistryName());
 return register(block, itemBlock);
 }
}
