package com.tage.crimsonwarfare;

import com.tage.crimsonwarfare.enums.EnumCusAct;
import com.tage.crimsonwarfare.event.EventHandler_AbilityAction;
import com.tage.crimsonwarfare.event.EventHandler_NameFormat;
import com.tage.crimsonwarfare.gui.client.CreativeCW;
import com.tage.crimsonwarfare.handlers.LogHelper;
import com.tage.crimsonwarfare.init.EntityInit;
import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.proxy.CommonProxy;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.tcspesific.Research;
import com.tage.crimsonwarfare.world.dimension.DimRegistry;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod
	(
		modid= References.MOD_ID,
		name= References.MOD_NAME, 
		version=References.VERSION, 
		dependencies = "required-after:Thaumcraft@[4.2.2.5,);"
	)

public class MainCrimsonWarfare
{
	@Mod.Instance(References.MOD_ID)
		public static MainCrimsonWarfare instance;

	@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.SERVERPROXY)
		public static CommonProxy proxy;
		public static CreativeTabs CrimsonWarfare = new CreativeCW("Crimson Warfare");

		public static final String MODID = References.MOD_ID;
		public static final String VERSION = References.VERSION;

	@Mod.EventHandler
		public void PreInit(FMLPreInitializationEvent event)
		{
			EnumCusAct.initEnums();
			Init.initBlocks();
			Init.initItems();
			Init.initTools();
			Init.initMaterial();
			
			EntityInit.mainRegistry();
			
			//DimRegistry.registerDimension();
			
			FMLInterModComms.sendMessage("CrimsonWarfare", "championWhiteList", "CrimsonWarfare.Knight:100");
			FMLCommonHandler.instance().bus().register(new EventHandler_AbilityAction());
			MinecraftForge.EVENT_BUS.register(new EventHandler_NameFormat());
		}

	@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.registerRenderThings();
			LogHelper.info("Initialization Complete!");
		}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
		{
			Research.registerRecipes();
			Research.setupResearchPages();
			Research.addResearchItem();
			
			LogHelper.info("Post Initialization Complete!");
		}
}