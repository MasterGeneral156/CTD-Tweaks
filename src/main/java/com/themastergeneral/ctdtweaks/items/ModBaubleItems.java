package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdtweaks.items.rings.RingHaste;
import com.themastergeneral.ctdtweaks.items.rings.RingSpeed;
import com.themastergeneral.ctdtweaks.proxy.client.ItemModelProvider;

public class ModBaubleItems 
{
	public static BasicRing basering;
	public static RingSpeed speedring;
	public static RingHaste hastering;
	
	public static void init() 
	{
		 speedring = register(new RingSpeed("speedring"));
		 hastering = register(new RingHaste("hastering"));
		 basering = register(new BasicRing("basering"));
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
