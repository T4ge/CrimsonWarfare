package com.tage.crimsonwarfare.renders;

import org.lwjgl.opengl.GL11;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.models.ModelSword;
import com.tage.crimsonwarfare.references.Reference;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.util.ClientUtil;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;

public class RendererSword implements IItemRenderer {
	
	private IModelCustom modelObj;
	private Object Texture;
	
	ResourceLocation Crimson = new ResourceLocation("crimson_warfare" + ":" + "textures/models/CrimsonSword.png");
	ResourceLocation Cultist = new ResourceLocation("crimson_warfare" + ":" + "textures/models/CultistSword.png");
	ResourceLocation Location;
    
	public RendererSword(String Texture) {
		this.Texture = Texture;
		modelObj = AdvancedModelLoader.loadModel(new ResourceLocation(References.MOD_ID +":" +"models/ModelCrimsonSwordTri.obj"));
		if
		(Texture == "Cultist")
			{
			Location = Cultist;
			}
		if 
		(Texture == "Crimson")
			{
			Location = Crimson;
			}
		else
		{
			return;
		}
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
    			float Scale = 0.15f;
    			GL11.glTranslatef(1.28F, -0.46F, -0.3F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(1F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(-2F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(35F, 0.0F, 0.0F, 1.0F);
    			render(0.2F, -0.2F, 1.3F, 2.0F);
            	return;
        }
        	case EQUIPPED_FIRST_PERSON: {
        		float Scale = 0.4f;
    			GL11.glTranslatef(2.2F, -2.3F, -0.4F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(10F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
            render(0.7F, -0.0F, item.getItem() == Init.crimson_sword ? 1.0F : 1.2F, 2.0F);
            	return;
        }
    		case INVENTORY:{
    			float Scale = 0.16f;
    			GL11.glTranslatef(-1.4F, -1.6F, 0.2F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(-20F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(35F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(-30F, 0.0F, 0.0F, 1.0F);
    			render(0.1F, item.getItem() == Init.crimson_sword ? -0.05F : 0F, item.getItem() == Init.crimson_sword ? 1.0F : 1.2F, 2.0F);
    			return;
    	}
    		case ENTITY:{
    			float Scale = 0.15f;
    			GL11.glTranslatef(-0.1F, -0.9F, -0.4F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(0F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
    			render(0, 0, 0, -10f);
    			return;
    	}
    		default:
    			return;
    	}

    }
	public void render(float x, float y, float z, float scale){
    	{
    		GL11.glPushMatrix();
    			Minecraft.getMinecraft().renderEngine.bindTexture(Location);
    			modelObj.renderAll();
			GL11.glPopMatrix();
    	}
    }
}
