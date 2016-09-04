package com.tage.crimsonwarfare.init;

import thaumcraft.api.ItemApi;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import com.tage.crimsonwarfare.blocks.AncientBlock;
import com.tage.crimsonwarfare.blocks.AncientStair;
import com.tage.crimsonwarfare.blocks.Candle;
import com.tage.crimsonwarfare.blocks.Fences;
import com.tage.crimsonwarfare.blocks.InvisibleWall;
import com.tage.crimsonwarfare.blocks.Slabs;
import com.tage.crimsonwarfare.blocks.ObbyStairs;
import com.tage.crimsonwarfare.blocks.Walls;
import com.tage.crimsonwarfare.blocks.WarpHole;
import com.tage.crimsonwarfare.items.Crimson_Sword;
import com.tage.crimsonwarfare.items.CrimsonBattleAxe;
import com.tage.crimsonwarfare.items.CrimsonBow;
import com.tage.crimsonwarfare.items.CrimsonGreatSword;
import com.tage.crimsonwarfare.items.CrimsonHammer;
import com.tage.crimsonwarfare.items.Cultist_Sword;
import com.tage.crimsonwarfare.references.Reference.BlockNames;
import com.tage.crimsonwarfare.tcspesific.Research;
import com.tage.crimsonwarfare.tileentities.TileCandle;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.common.util.EnumHelper;

public class Init {
	//Items
	public static Item crimson_remnants; //TODO - What for?
	
	//Blocks
	//public static BlockFence decorative_fence = new Fences("fence", Material.wood);
	//public static BlockWall decorative_wall = new Walls();
	//public static BlockSlab decorative_slab = new Slabs(false, Material.rock);
	//public static BlockStairs obby_stair = new ObbyStairs(Blocks.obsidian, 0);
	//public static Block ancientblock = new AncientBlock(Material.rock);
	//public static BlockStairs ancientstair = new AncientStair(Blocks.bookshelf, 0);
	public static Block invisiblebarrier = new InvisibleWall(Material.dragonEgg);
	public static Block candle = new Candle(Material.glass);
	public static Block warphole = new WarpHole(Material.rock);
	
	//Materials
	public static ToolMaterial CWVOID = EnumHelper.addToolMaterial("CWVOID", 3, 1561, 8.0F, 4.0F, 10);
	
	//Tools
	public static final ItemSword crimson_sword = new Crimson_Sword();
	public static final ItemSword cultist_sword = new Cultist_Sword();
	public static final ItemSword crimson_cleaver = new CrimsonGreatSword();
	public static final ItemSword crimson_battleaxe = new CrimsonBattleAxe();
	public static final ItemSword crimson_hammer = new CrimsonHammer();
	public static final ItemBow crimson_bow = new CrimsonBow();
	public static ItemPickaxe crimson_pickaxe;
	public static ItemAxe crimson_axe;
	public static ItemSpade crimson_shovel;
	public static ItemHoe crimson_hoe;
	
	//Armour
	//public static final Item crimsonhelm = ItemApi.getItem("ItemCultistPlateArmor", 0);
	
	
	public static void initMaterial(){
		CWVOID = EnumHelper.addToolMaterial("CWVOID", 3, 1561, 8.0F, 4.0F, 10);
	}
	
	//Meta
	/*private static final String[] WallNames = 
			{
		  "Stone" + " " + BlockNames.WALLS,
		  "Quartz" + " " + BlockNames.WALLS,
		  "Bricks" + " " + BlockNames.WALLS,
		  "Sandstone" + " " + BlockNames.WALLS,
		  "Obsidian" + " " + BlockNames.WALLS
		};
	
	private static final String[] FenceNames = 
		{
		  "Stone" + " " + BlockNames.FENCES,
		  "Quartz" + " " + BlockNames.FENCES,
		  "Bricks" + " " + BlockNames.FENCES,
		  "Sandstone" + " " + BlockNames.FENCES,
		  "Obsidian" + " " + BlockNames.FENCES
		};*/

	//Blocks
		public static void initBlocks(){
			/*for 
			(int a = 0; a < WallNames.length; a++)
			{
				LanguageRegistry.addName(new ItemStack
	    		(decorative_wall, 1, a), 
	    		WallNames[a]);
			}
		
	    for (int a = 0; a < FenceNames.length; a++)
	    	{
	    		LanguageRegistry.addName(new ItemStack
	    		(decorative_fence, 1, a),
	    		FenceNames[a]);
	    	}
	    
	    GameRegistry.registerBlock(obby_stair, "Obsidian_Stair");
	    LanguageRegistry.addName(obby_stair, "Obsidian Stair");
	    
	    GameRegistry.registerBlock(ancientstair, "ancientstair");
	    LanguageRegistry.addName(ancientstair, "Ancient Stair");*/
	    
	    GameRegistry.registerBlock(invisiblebarrier, "invisbarr");
	    LanguageRegistry.addName(invisiblebarrier, "Invisible Barrier");

	    GameRegistry.registerBlock(candle, "Candle");
	    GameRegistry.registerTileEntity(TileCandle.class, "candle");
	    LanguageRegistry.addName(candle, "Candle");
	    
	    GameRegistry.registerBlock(warphole, "warphole");
	    LanguageRegistry.addName(warphole, "Warp Hole");
	    
	}
		
	public static void initItems()
	{
		
	}
	
	public static void initTools()
	{
		GameRegistry.registerItem(crimson_sword, "crimson_sword");
		GameRegistry.registerItem(cultist_sword, "cultist_sword");
		GameRegistry.registerItem(crimson_cleaver, "crimson_cleaver");
		GameRegistry.registerItem(crimson_battleaxe, "crimson_battleaxe");
		GameRegistry.registerItem(crimson_hammer, "crimson_hammer");
		GameRegistry.registerItem(crimson_bow, "crimson_bow");
	}
	
	public static void initSpecials()
	{
		
	}
}
