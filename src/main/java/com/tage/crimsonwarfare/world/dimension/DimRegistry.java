package com.tage.crimsonwarfare.world.dimension;

import net.minecraftforge.common.DimensionManager;

public class DimRegistry {
	
	public static void dimRegistry()
	{
		registerDimension();
	}
	
	public static final int dimID = -2;
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimID, WorldProviderCW.class, false);
		DimensionManager.registerDimension(dimID, dimID);
	}
}
