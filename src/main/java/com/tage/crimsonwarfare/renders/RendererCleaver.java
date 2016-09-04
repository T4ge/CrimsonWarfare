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

public class RendererCleaver implements IItemRenderer {
	private IModelCustom modelObj;
	
	ResourceLocation Location = new ResourceLocation("crimson_warfare" + ":" + "textures/models/CrimsonCleaver.png");
    
	public RendererCleaver() {
		modelObj = AdvancedModelLoader.loadModel(new ResourceLocation(References.MOD_ID +":" +"models/ModelCrimsonCleaverTri.obj"));
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
    			float Scale = 1f;
    			GL11.glTranslatef(0.75F, 0.45F, 0F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(-35F, 0.0F, 0.0F, 1.0F);
    			render(type, 0.2F, -0.2F, 1.3F, 2.0F);
            	return;
        }
        	case EQUIPPED_FIRST_PERSON: {
        		float Scale = 1f;

    			GL11.glTranslatef(0.55F, 0.4F, -0.1F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(10F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(200F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
    			
        			/*GL11.glPushMatrix();
    	 			GL11.glScalef(.75f,.75f,.75f);
        			float f12 = 0.8F;
        			EntityClientPlayerMP player = ClientUtil.mc().thePlayer;
        			Render render;
        			RenderPlayer renderplayer;

        			GL11.glTranslatef(0.0F, 0.0F * f12 - (1.0F - 1.0f) * 1.2F + 0.04F, -0.9F * f12);
        			GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
        			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        			ClientUtil.bindTexture(player.getLocationSkin().getResourceDomain()+":"+player.getLocationSkin().getResourcePath());

        				float x = -1.2F;
        				float y = -0.2F;
        				float z = -1.6F;
        			
        				//ARM #1
    					GL11.glPushMatrix();
    					GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
    					GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    					
    					GL11.glTranslatef(x, y, z + 0.1F);
    					
    					GL11.glRotatef(90, 1.0F, 0.0F, 0.0F);
    					GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
    					GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
    					GL11.glRotatef(-90, 0.0F, 0.0F, 1.0F);
        				render = RenderManager.instance.getEntityRenderObject(player);
        				renderplayer = (RenderPlayer)render;
        				renderplayer.renderFirstPersonArm(player);
        				GL11.glPopMatrix();
        				
        				//ARM #2
        				GL11.glPushMatrix();
        				GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
        				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
        				
        				GL11.glTranslatef(x, y, z - 0.1F);
        				
        				GL11.glRotatef(0, 1.0F, 0.0F, 0.0F);
        				GL11.glRotatef(-95.0F, 0.0F, 0.0F, 1.0F);
        				GL11.glRotatef(-90, 0.0F, 1.0F, 0.0F);
        				GL11.glRotatef(0, 0.0F, 0.0F, 1.0F);
        				render = RenderManager.instance.getEntityRenderObject(player);
        				renderplayer = (RenderPlayer)render;
        				renderplayer.renderFirstPersonArm(player);
        				GL11.glPopMatrix();
        				
    			GL11.glPopMatrix();*/
    			render(type, 0.7F, -0.0F, item.getItem() == Init.crimson_sword ? 1.0F : 1.2F, 2.0F);
            	return;
        }
    		case INVENTORY:{
    			float Scale = 1f;
    			GL11.glTranslatef(-0.1F, -0.3F, 0.3F);
    			GL11.glScalef(Scale, Scale, Scale);
    			GL11.glRotatef(-10F, 1.0F, 0.0F, 0.0F);
    			GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
    			GL11.glRotatef(40F, 0.0F, 0.0F, 1.0F);
    			render(type, 0.1F, item.getItem() == Init.crimson_sword ? -0.05F : 0F, item.getItem() == Init.crimson_sword ? 1.0F : 1.2F, 2.0F);
    			return;
    	}
    		case ENTITY:{
    			float Scale = 1f;
    			GL11.glTranslatef(0F, 0.6F, 0F);
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
    		
    		/*if (type == ItemRenderType.EQUIPPED_FIRST_PERSON)
    		{
    				GL11.glPushMatrix();
    	 			GL11.glScalef(.75f,.75f,.75f);
        			float f12 = 0.8F;
        			EntityClientPlayerMP player = ClientUtil.mc().thePlayer;
        			Render render;
        			RenderPlayer renderplayer;

        			GL11.glTranslatef(0.0F, 0.0F * f12 - (1.0F - 1.0f) * 1.2F + 0.04F, -0.9F * f12);
        			GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
        			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        			ClientUtil.bindTexture(player.getLocationSkin().getResourceDomain()+":"+player.getLocationSkin().getResourcePath());

        				float x1 = -1.2F;
        				float y1 = -0.2F;
        				float z1 = -1.6F;
        			
        				//ARM #1
    					GL11.glPushMatrix();
    					GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
    					GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    					
    					GL11.glTranslatef(x1, y1, z1 + 0.1F);
    					
    					GL11.glRotatef(90, 1.0F, 0.0F, 0.0F);
    					GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
    					GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
    					GL11.glRotatef(-90, 0.0F, 0.0F, 1.0F);
        				render = RenderManager.instance.getEntityRenderObject(player);
        				renderplayer = (RenderPlayer)render;
        				renderplayer.renderFirstPersonArm(player);
        				GL11.glPopMatrix();
        				
        				//ARM #2
        				GL11.glPushMatrix();
        				GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
        				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
        				
        				GL11.glTranslatef(x1, y1, z1 - 0.1F);
        				
        				GL11.glRotatef(0, 1.0F, 0.0F, 0.0F);
        				GL11.glRotatef(-95.0F, 0.0F, 0.0F, 1.0F);
        				GL11.glRotatef(-90, 0.0F, 1.0F, 0.0F);
        				GL11.glRotatef(0, 0.0F, 0.0F, 1.0F);
        				render = RenderManager.instance.getEntityRenderObject(player);
        				renderplayer = (RenderPlayer)render;
        				renderplayer.renderFirstPersonArm(player);
        				GL11.glPopMatrix();
        				GL11.glPopMatrix();
    			}*/
    		
    		
    		GL11.glPushMatrix();
    			Minecraft.getMinecraft().renderEngine.bindTexture(Location);
    			modelObj.renderAll();
			GL11.glPopMatrix();
    	}
	}
}
