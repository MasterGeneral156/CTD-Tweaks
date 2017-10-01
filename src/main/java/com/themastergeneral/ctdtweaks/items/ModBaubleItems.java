package com.themastergeneral.ctdtweaks.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdtweaks.Main;
import com.themastergeneral.ctdtweaks.items.rings.RingHaste;
import com.themastergeneral.ctdtweaks.items.rings.RingSpeed;

public class ModBaubleItems {
	public static BasicRing basering;
	public static RingSpeed speedring;
	public static RingHaste hastering;

	public static void init() {
		speedring = register(new RingSpeed("speedring", Main.MODID));
		hastering = register(new RingHaste("hastering", Main.MODID));
		basering = register(new BasicRing("basering", Main.MODID));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}
		return item;
	}
}
