package com.tage.crimsonwarfare.renders;

import static org.lwjgl.opengl.GL11.GL_LIGHTING;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotated;
import static org.lwjgl.opengl.GL11.glScaled;
import static org.lwjgl.opengl.GL11.glTranslated;
import static org.lwjgl.opengl.GL11.glTranslatef;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;


public class CandleItemRenderer implements IItemRenderer {
   TileEntitySpecialRenderer render;

   private TileEntity entity;

   public CandleItemRenderer(TileEntitySpecialRenderer render,
         TileEntity entity) {
      this.entity = entity;
      this.render = render;
   }

   @Override
   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return true;
   }

   @Override
   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
         ItemRendererHelper helper) {
      return true;
   }

   @Override
   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      if (type == IItemRenderer.ItemRenderType.ENTITY)
      {
        glPushMatrix();
        	GL11.glScalef(20f, 20f, 20f);
                
            GL11.glRotatef(0f, 1f, 0f, 0f);
            GL11.glRotatef(0f, 0f, 1f, 0f);
            GL11.glRotatef(0f, 0f, 0f, 1f);
            GL11.glTranslatef(-0.5f, 0.2f, 0.0f);
            
            TileEntityRendererDispatcher.instance.renderTileEntityAt(entity, -0D,0.0D, -0.5D, 0.0F);
        glPopMatrix();
      }
      if (type == IItemRenderer.ItemRenderType.INVENTORY)
      {
        glPushMatrix();
          	GL11.glScalef(1.5f, 1.5f, 1.5f);
          
          	GL11.glTranslatef(0.0f, -0.05f, -0.0f);
          
          	GL11.glRotatef(0f, 1f, 0f, 0f);
          	GL11.glRotatef(0f, 0f, 1f, 0f);
          	GL11.glRotatef(0f, 0f, 0f, 1f);
          
          	TileEntityRendererDispatcher.instance.renderTileEntityAt(entity, 0.0D,0.0D, 0.0D, 0.0F);
         glPopMatrix();
      }
      
      if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON)
      {
	  	glTranslatef(-0.5F, 0.0F, -0.5F);
	  		glPushMatrix();
	  		GL11.glScalef(1.5f, 1.5f, 1.5f);
          
	  		GL11.glTranslatef(0.0f, 0.3f, 0.2f);
          
	  		GL11.glRotatef(5f, 1f, 0f, 0f);
	  		GL11.glRotatef(0f, 0f, 1f, 0f);
	  		GL11.glRotatef(10f, 0f, 0f, 1f);
          
	  		TileEntityRendererDispatcher.instance.renderTileEntityAt(entity, 0.0D,0.0D, 0.0D, 0.0F);
	  	glPopMatrix();
      }
      
      if (type == IItemRenderer.ItemRenderType.EQUIPPED)
      {
        glPushMatrix();
          	GL11.glScalef(1.7f, 1.7f, 1.7f);
          
          	GL11.glTranslatef(0f, 0.0f, -0.0f);
          
          	GL11.glRotatef(-5f, 1f, 0f, 0f);
          	GL11.glRotatef(-40f, 0f, 1f, 0f);
          	GL11.glRotatef(60f, 0f, 0f, 1f);
          
          	GL11.glTranslatef(0f, -0.6f, -0.4f);
          
          	TileEntityRendererDispatcher.instance.renderTileEntityAt(entity, 0.0D,0.0D, 0.0D, 0.0F);
        glPopMatrix();
      }
   }

}
