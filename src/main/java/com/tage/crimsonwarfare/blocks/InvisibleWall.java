package com.tage.crimsonwarfare.blocks;

import com.tage.crimsonwarfare.references.Reference.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InvisibleWall extends Block {

	public InvisibleWall(Material mat) 
	{
		super(mat);
		this.setBlockUnbreakable();
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setBlockTextureName(References.MOD_ID + ":" + "invisblock");
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
}
