package com.tage.crimsonwarfare.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ObbyStairs extends BlockStairs {

	public ObbyStairs(Block block, int i) {
		super(block, i);
		setBlockName("Obsidianstairs");
	}

	@Override
	public int damageDropped(int meta)
	{
		return 0;
	}
	
}
