package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class ModItems 
{
	public static BasicCore corecombat;
	public static BasicItem nuggettin;
	public static BasicItem fuelwither;
	public static BasicGlow enchantedgoldingot;
	public static BasicItem coreflight;
	 public static void init() 
	 {
		 corecombat = register(new BasicCore("corecombat", 64));
		 coreflight = register(new BasicCore("coreflight", 128));
		 nuggettin = register(new BasicItem ("nuggettin"));
		 fuelwither = register(new BasicItem ("fuelwither"));
		 enchantedgoldingot = register(new BasicGlow ("enchantedgoldingot"));
		  
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
