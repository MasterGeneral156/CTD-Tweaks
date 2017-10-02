package com.themastergeneral.ctdtweaks;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdtweaks.proxy.CommonProxy;
import com.themastergeneral.ctdtweaks.proxy.client.CreativeTab;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CTDTweaks.MODID, name = CTDTweaks.MODNAME, certificateFingerprint = CTDTweaks.FingerPrint, version = CTDTweaks.VERSION, dependencies = CTDTweaks.DEPENDENCIES, updateJSON = CTDTweaks.updateJSON, acceptedMinecraftVersions = CTDTweaks.MCVersion)
public class CTDTweaks {
	public static final String MODID = "ctdtweaks";
	public static final String MODNAME = "CTD Tweaks";
	public static final String VERSION = "1.7.3";
	public static final String DEPENDENCIES = "required-after:baubles;required-after:ctdcore@[1.2,];";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Tweaks.json";
	public static final String MCVersion = "1.12.2";
	public static final String FingerPrint = "441b509a0f58a0ef41aca8daf1be20d96287635e";

	public static final CreativeTab creativeTab = new CreativeTab();

	@Instance
	public static CTDTweaks instance = new CTDTweaks();

	@SidedProxy(clientSide = "com.themastergeneral.ctdtweaks.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdtweaks.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Tweaks! TheMasterGeneral will not support this version!");
	}
}