package com.tage.crimsonwarfare.world.dimension;

import com.tage.crimsonwarfare.MainCrimsonWarfare;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderCW extends WorldProvider
{
	
	public WorldProviderCW()
	{
		this.hasNoSky = true;
	}

	@Override
	protected void registerWorldChunkManager()
	{
		super.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.sky, 0.0F);
		this.dimensionId = DimRegistry.dimID;
	}
	
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderCW(worldObj, 0);
	}
	
	@Override
	public String getDimensionName() 
	{
		return "CWVoid";
	}
}
