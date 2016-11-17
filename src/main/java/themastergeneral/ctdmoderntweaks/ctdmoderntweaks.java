package themastergeneral.ctdmoderntweaks;

import themastergeneral.ctdmoderntweaks.client.Tab;
import themastergeneral.ctdmoderntweaks.events.Events;
import themastergeneral.ctdmoderntweaks.processing.Crafting;
import themastergeneral.ctdmoderntweaks.processing.FuelHandler;
import themastergeneral.ctdmoderntweaks.proxy.CommonProxy;
import themastergeneral.ctdmoderntweaks.registers.ModBlocks;
import themastergeneral.ctdmoderntweaks.registers.ModItems;
import net.minecraft.init.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ctdmoderntweaks.modId, name = ctdmoderntweaks.name, version = ctdmoderntweaks.version, acceptedMinecraftVersions = "[1.10.2]")
public class ctdmoderntweaks {

	@SidedProxy(serverSide = "themastergeneral.ctdmoderntweaks.proxy.CommonProxy", clientSide = "themastergeneral.ctdmoderntweaks.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "ctdmoderntweaks";
	public static final String name = "CTD Modern Tweaks";
	public static final String version = "1.0.3";
	
	public static final Tab creativeTab = new Tab();
	
	@Mod.Instance(modId)
	public static ctdmoderntweaks instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		
		ModItems.init();
		ModBlocks.init();
		Crafting.addRecipes();
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new Events());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}