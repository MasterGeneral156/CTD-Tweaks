package com.themastergeneral.ctdtweaks.items.blocks;

import javax.annotation.Nullable;

import com.themastergeneral.ctdtweaks.CTDTweaks;
import com.themastergeneral.ctdtweaks.items.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class ModBlockItems extends BlockItem
{
    public ModBlockItems(Block blockIn)
    {
        super(blockIn, new Item.Properties().tab(CTDTweaks.CreativeTab));
    }
    
    @Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType)
	{
		if (stack.getItem() == ModItems.block_coal_wither)
			return 560000;
		else
			return -1;
	}
}
