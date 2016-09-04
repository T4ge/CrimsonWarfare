package com.tage.crimsonwarfare.blocks;

import java.util.Random;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.tileentities.TileCandle;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Candle extends BlockContainer{

	public Candle(Material mat) {
		super(mat);
		this.setBlockName("candle");
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.8F, 0.625F);
		this.blockHardness = 5.0F;
		this.blockResistance = 1.0F;
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(MainCrimsonWarfare.CrimsonWarfare);
		this.setLightLevel(0.9375F);
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube()
	{
	return false;
	}
	
	public boolean renderAsNormalBlock() 
	{
		return false;
	}
	
	public int quantityDropped(Random ran)
	{
		return 1;
	}
	
	public Candle getBlockDropped(int int1, Random ran, int int2)
	{
		return this;
	}
	
	   @Override
	   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	   {
	   if (entity == null)
	   {
	   return;
	   }

	   TileCandle tile = (TileCandle) world.getTileEntity(x, y, z);
	   tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	   }
	   
	@Override
	public TileEntity createNewTileEntity(World var1, int var2){
		return new TileCandle();
	}	
}
	
