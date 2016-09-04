package com.tage.crimsonwarfare.blocks;

import java.util.List;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.references.Reference.BlockNames;
import com.tage.crimsonwarfare.references.Reference.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Fences extends BlockFence {
	
	private final String par1;
	private final String Name = BlockNames.FENCES;
	private IIcon[] Icons;
	private final int maxMeta = MetaUtil.maxMeta;
	
	@SideOnly(Side.CLIENT)
	private IIcon Stone0;
	@SideOnly(Side.CLIENT)
	private IIcon Stone1;
	
	@SideOnly(Side.CLIENT)
	private IIcon Quartz;
	
	@SideOnly(Side.CLIENT)
	private IIcon Brick;
	
	@SideOnly(Side.CLIENT)
	private IIcon SandS2;
	@SideOnly(Side.CLIENT)
	private IIcon SandS0;
	@SideOnly(Side.CLIENT)
	private IIcon SandS1;
	
	@SideOnly(Side.CLIENT)
	private IIcon Obby;
	
	public Fences(String string, Material material) {
		super(string, material);
		this.par1 = string;
		setBlockName(Name);
		blockHardness = 1.5F;
		blockResistance = 30.0F;
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypeStone);
		setBlockTextureName(Name);
		this.setCreativeTab(MainCrimsonWarfare.CrimsonWarfare);
		Icons = new IIcon[maxMeta];
		GameRegistry.registerBlock(this, MetaUtil.class, Name);
	}
	
	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
	{
		return true;
		
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconReg)
	{
		this.Stone0 = iconReg.registerIcon("minecraft" + ":" + "stone_slab_top");
		this.Stone1 = iconReg.registerIcon("minecraft" + ":" + "stone_slab_side");
		this.Quartz = iconReg.registerIcon("minecraft" + ":" + "quartz_block_top");
		this.Brick  = iconReg.registerIcon("minecraft" + ":" + "brick");
		this.SandS0 = iconReg.registerIcon("minecraft" + ":" + "sandstone_bottom");
		this.SandS1 = iconReg.registerIcon("minecraft" + ":" + "sandstone_top");
		this.SandS2 = iconReg.registerIcon("minecraft" + ":" + "sandstone_normal");
		this.Obby   = iconReg.registerIcon("minecraft" + ":" + "obsidian");
	}

	@Override
	public IIcon getIcon (int side, int meta)
	{
		switch (meta) {
		case 0: return side == 0 ? this.Stone0 : (side == 1 ? this.Stone0 : this.Stone1);
		case 1: return this.Quartz;
		case 2: return this.Brick;
		case 3: return side == 0 ? this.SandS0 : (side == 1 ? this.SandS1 : this.SandS2);
		case 4: return this.Obby;
		default: return Icons[0];
		}
	}

	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list)
	{
		for(int i = 0; i < maxMeta; i++)
			{
				list.add(new ItemStack(item, 1, i));
			
			}
	}
}
