package com.tage.crimsonwarfare.blocks;

import com.tage.crimsonwarfare.handlers.DimTeleporter;
import com.tage.crimsonwarfare.world.dimension.DimRegistry;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public class BlockWarp extends BlockPortal 
{
	public BlockWarp()
	{
	super();
	}

	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP))) {
			
			EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
			if (thePlayer.timeUntilPortal > 0) 
			{
				thePlayer.timeUntilPortal = 10;
			} 
			else if (thePlayer.dimension != DimRegistry.dimID) 
			{
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimRegistry.dimID, new DimTeleporter(thePlayer.mcServer.worldServerForDimension(DimRegistry.dimID)));
			} 
			else 
			{
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new DimTeleporter(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
	}
}

//Portal
//Custom Model
//Rotation
//FX stuff (Particles and effects)
//Lots of renders