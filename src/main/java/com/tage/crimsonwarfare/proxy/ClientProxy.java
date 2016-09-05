package com.tage.crimsonwarfare.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import com.tage.crimsonwarfare.blocks.Candle;
import com.tage.crimsonwarfare.entity.EntityKnight;
import com.tage.crimsonwarfare.entity.projectiles.EtherealArrow;
import com.tage.crimsonwarfare.event.client.EventHandler_VFX;
import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.renders.CandleItemRenderer;
import com.tage.crimsonwarfare.renders.CandleTileRender;
import com.tage.crimsonwarfare.renders.RenderEtherealArrow;
import com.tage.crimsonwarfare.renders.RenderMobKnight;
import com.tage.crimsonwarfare.renders.RenderModItem;
import com.tage.crimsonwarfare.renders.RendererBattleAxe;
import com.tage.crimsonwarfare.renders.RendererBow;
import com.tage.crimsonwarfare.renders.RendererSword;
import com.tage.crimsonwarfare.renders.RendererCleaver;
import com.tage.crimsonwarfare.renders.RendererHammer;
import com.tage.crimsonwarfare.tileentities.TileCandle;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerRenderThings() 
	{																							 // Scale, x, y, z, texture(available strings found in the RenderSwordCrimson)
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.crimson_sword, (IItemRenderer)new RendererSword("Crimson"));
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.cultist_sword, (IItemRenderer)new RendererSword("Cultist"));
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.crimson_cleaver, (IItemRenderer)new RendererCleaver());
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.crimson_battleaxe, (IItemRenderer)new RendererBattleAxe());
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.crimson_hammer, (IItemRenderer)new RendererHammer());
		MinecraftForgeClient.registerItemRenderer(com.tage.crimsonwarfare.init.Init.crimson_bow, (IItemRenderer)new RendererBow());
		
		
		//RenderingRegistry.registerBlockHandler(Candle.class, new CandleTileRender());
		
		RenderingRegistry.registerEntityRenderingHandler(EtherealArrow.class, new RenderEtherealArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityKnight.class, new RenderMobKnight(new ModelBiped(), 0));
		
		MinecraftForge.EVENT_BUS.register(new EventHandler_VFX());
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Init.candle),
                new CandleItemRenderer(new CandleTileRender(),
                      new TileCandle()));
		TileEntitySpecialRenderer renderCandle = new CandleTileRender();
		ClientRegistry.bindTileEntitySpecialRenderer(TileCandle.class, new CandleTileRender());
		
		MinecraftForgeClient.registerItemRenderer(Items.diamond_sword, new RenderModItem());
		MinecraftForgeClient.registerItemRenderer(Items.wooden_sword, new RenderModItem());
		MinecraftForgeClient.registerItemRenderer(Items.stone_sword, new RenderModItem());
		MinecraftForgeClient.registerItemRenderer(Items.iron_sword, new RenderModItem());
		MinecraftForgeClient.registerItemRenderer(Items.golden_sword, new RenderModItem());
	}
	
}
