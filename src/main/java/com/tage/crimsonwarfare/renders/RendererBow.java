package com.tage.crimsonwarfare.renders;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.models.ModelSword;
import com.tage.crimsonwarfare.references.Reference;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.util.ClientUtil;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;

public class RendererBow implements IItemRenderer {
	private IModelCustom modelObj;
	
	ResourceLocation Location = new ResourceLocation("crimson_warfare" + ":" + "textures/models/CrimsonBow.png");
    
	public RendererBow() {
		modelObj = AdvancedModelLoader.loadModel(new ResourceLocation(References.MOD_ID +":" +"models/ModelCrimsonBowTri.obj"));
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type){
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
		case INVENTORY:
		case ENTITY:
		case FIRST_PERSON_MAP:
			return true;
		default: return false;
		}
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		switch(type)
		{
		case ENTITY:
		case INVENTORY:
			return true;
		default:
			return false;
		}
	}
	
    public void renderItem(ItemRenderType type, ItemStack item, Object ... data)
    {
    	switch(type)
    	{
    		case EQUIPPED: {
    			float Scale = 1.7f;
    			GL11.glTranslatef(3.10F, 2.7F, 2F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(120F, 0.0F, 0.0F, 1.0F);
    			GL11.glRotatef(-30F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(15F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(11F, 0.0F, 0.0F, 1.0F);
    			GL11.glRotatef(10F, 0.0F, 1.0F, 0.0F);
    			render(type, 0.2F, -0.2F, 1.3F, 2.0F);
            	return;
        }
        	case EQUIPPED_FIRST_PERSON: {
        		float Scale = 0.85f;
    			GL11.glTranslatef(1F, 1.3F, -2F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(-85F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(60F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(185F, 0.0F, 0.0F, 1.0F);
    			GL11.glRotatef(10F, 1.0F, 0.0F, 0.0F);
    			render(type, 0.7F, -0.0F, item.getItem() == Init.crimson_bow ? 1.0F : 1.2F, 2.0F);
            	return;
        }
    		case INVENTORY:{
    			float Scale = .48f;
    			GL11.glTranslatef(-1.4F, -0.6F, 0.4F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(-65F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(-45F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(-20F, 0.0F, 0.0F, 1.0F);
    			render(type, 0.1F, item.getItem() == Init.crimson_sword ? -0.05F : 0F, item.getItem() == Init.crimson_sword ? 1.0F : 1.2F, 2.0F);
    			return;
    	}
    		case ENTITY:{
    			float Scale = 1f;
    			GL11.glTranslatef(0.5F, -0.3F, 1.6F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(0F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
    			render(type, 0, 0, 0, -10f);
    			return;
    	}
    		default:
    			return;
    	}

    }
	public void render(ItemRenderType type, float x, float y, float z, float scale){
    	{
    		GL11.glPushMatrix();
    			Minecraft.getMinecraft().renderEngine.bindTexture(Location);
    			modelObj.renderAll();
			GL11.glPopMatrix();
    	}
	}
}
