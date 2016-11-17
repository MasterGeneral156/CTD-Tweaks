package themastergeneral.ctdmoderntweaks.processing;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import themastergeneral.ctdmoderntweaks.registers.ModBlocks;
import themastergeneral.ctdmoderntweaks.registers.ModItems;

public class Crafting {
	
	public static void addRecipes() {
		ItemStack item;
		//Wither Fuel
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fuelWitherBlock), " W ", "WCW", " W ", 'C', Blocks.COAL_BLOCK, 'W', Items.NETHER_STAR);
		
		//Combat Core
		GameRegistry.addRecipe(new ItemStack(ModItems.coreCombat), "RSR", "BNP", "RAR", 'R', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S', Items.DIAMOND_SWORD, 'B', Items.BOW, 'A', Items.ARROW, 'P', Items.SHIELD);
		
		//Nether Star
		GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), "WWW", "SSS", "CS ", 'W', new ItemStack(Items.SKULL, 1, 1), 'S', Blocks.SOUL_SAND, 'C', new ItemStack(ModItems.coreCombat, 1, OreDictionary.WILDCARD_VALUE));
	
		//Dragon Egg
		GameRegistry.addRecipe(new ItemStack(Blocks.DRAGON_EGG), " C ", "CTC", " C ", 'T', new ItemStack(ModItems.coreCombat, 1, OreDictionary.WILDCARD_VALUE), 'C', Items.END_CRYSTAL);
		
		//Elytra
		GameRegistry.addRecipe(new ItemStack(Items.ELYTRA, 1, 432), "PSP", "LSL", "LSL", 'L', Items.LEATHER, 'S', Items.STICK, 'P', Blocks.PURPUR_BLOCK);
		
		//Wither Fuel Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fuelWitherBlock), "FFF", "FFF", "FFF", 'F', ModItems.fuelWither);
		
		//Enchanted Gold Ingot
		GameRegistry.addRecipe(new ItemStack(ModItems.enchantedGoldIngot), "GGG", "GBG", "GGG", 'G', Items.GOLD_INGOT, 'B', new ItemStack(Items.ENCHANTED_BOOK, 1, OreDictionary.WILDCARD_VALUE));
		
		//Knockback Stick?
		item = new ItemStack(Items.STICK);
		item.addEnchantment(Enchantment.getEnchantmentByID(19), 10);
		GameRegistry.addRecipe(item, new Object[] {" P ", "PSP", " P ", 'S', Items.STICK, 'P', Blocks.PISTON});
		
		
		//shapeless crafting recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fuelWither, 9), new ItemStack(ModBlocks.fuelWitherBlock));
		
		//Buckets into fluid?
		GameRegistry.addShapelessRecipe(new ItemStack(Items.BUCKET, 1), new ItemStack(Items.BUCKET, 1, OreDictionary.WILDCARD_VALUE));
		
		//smelting recipes
		GameRegistry.addSmelting(Items.WHEAT, new ItemStack(Items.BREAD), 0.1f);
		
	}
}
