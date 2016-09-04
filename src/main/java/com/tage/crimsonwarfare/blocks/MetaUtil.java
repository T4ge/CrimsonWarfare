package com.tage.crimsonwarfare.blocks;

import com.tage.crimsonwarfare.references.Reference.BlockNames;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaUtil extends ItemBlockWithMetadata {

	public final static int maxMeta = 5;
	public String Name = this.getUnlocalizedName();
	public String Stone = "stone";
	public String Quartz = "quartz";
	public String Bricks = "bricks";
	public String Sandstone = "sandstone";
	public String Obsidian = "obsidian";
	
	
	public MetaUtil(Block block) {
		super(block, block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return Stone + " " + this.getUnlocalizedName();
		case 1:
			return Quartz + " " + this.getUnlocalizedName();
		case 2:
			return Bricks + " " + this.getUnlocalizedName();
		case 3:
			return Sandstone + " " + this.getUnlocalizedName();
		case 4:
			return Obsidian + " " + this.getUnlocalizedName();
		default:
			return this.getUnlocalizedName();
		}
	}
}
