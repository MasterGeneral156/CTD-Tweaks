package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.items.rings.RingHaste;
import com.themastergeneral.ctdtweaks.items.rings.RingSpeed;

public class ModBaubleItems extends RegisterItem
{
	public static BasicRing basering;
	public static RingSpeed speedring;
	public static RingHaste hastering;
	
	public static void init() 
	{
		 speedring = register(new RingSpeed("speedring", Main.MODID));
		 hastering = register(new RingHaste("hastering", Main.MODID));
		 basering = register(new BasicRing("basering", Main.MODID));
	}
}
