package com.tage.crimsonwarfare.renders;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;

import com.tage.crimsonwarfare.blocks.BlockCandle;
import com.tage.crimsonwarfare.models.ModelCandle;
import com.tage.crimsonwarfare.models.ModelCandleNew2;
import com.tage.crimsonwarfare.models.ModelCandleUpdate;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.tileentities.TileCandle;

public class CandleTileRender extends TileEntitySpecialRenderer
{
	ResourceLocation block = (new ResourceLocation(References.MOD_ID + ":textures/models/Candle.png")); 

	private final ModelCandleUpdate model;
	
	public CandleTileRender() {
	this.model = new ModelCandleUpdate();
	}

	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
	int meta = world.getBlockMetadata(x, y, z);
	GL11.glPushMatrix();
	GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
	GL11.glPopMatrix();
	}



	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {

	//if(){
	//WallMounted
	GL11.glPushMatrix();
	GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
	this.bindTexture(block);;
	GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
	GL11.glPushMatrix();
	TileCandle tile = (TileCandle) tileentity;
	int direction = tile.direction;
	GL11.glRotatef(direction * -90, 0.0F, 1.0F, 0.0F);
	GL11.glTranslatef(0.095f, -0.595f, -0.38f);
	GL11.glPushMatrix();
	GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glEnable(GL11.GL_BLEND);
    	this.model.renderflame(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glDisable(GL11.GL_BLEND);
	GL11.glPopMatrix();
	GL11.glPopMatrix();
	GL11.glPopMatrix();
	/*}
	else
	{
	//FloorMounted
	GL11.glPushMatrix();
	GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
	this.bindTexture(block);;
	GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
	GL11.glPushMatrix();
	TileCandle tile = (TileCandle) tileentity;
	int direction = tile.direction;
	GL11.glRotatef(direction * -90, 0.0F, 1.0F, 0.0F);
	GL11.glTranslatef(0.095f, -0.595f, -0.38f);
	GL11.glPushMatrix();
	GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	this.model.renderFloor((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glEnable(GL11.GL_BLEND);
    	this.model.renderflame(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glDisable(GL11.GL_BLEND);
	GL11.glPopMatrix();
	GL11.glPopMatrix();
	GL11.glPopMatrix();
	}*/
	}
	
    private void adjustLightFixture(World world, int i, int j, int k, Block block) 
	{
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightValue(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
	}
}
	
	
	
/*    private final ModelCandleUpdate model;
    
    public CandleTileRender() 
    	{
            this.model = new ModelCandleUpdate();
    	}
    
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) 
    	{
            int meta = world.getBlockMetadata(x, y, z);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    	}
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) 
    	{
            GL11.glPushMatrix();
            
            GL11.glTranslatef((float) x + 0.625F, (float) y + 0.8F, (float) z + 0.375F);
            
            
            ResourceLocation block = (new ResourceLocation(References.MOD_ID + ":textures/models/Candle.png")); 
            Minecraft.getMinecraft().renderEngine.bindTexture(block);
            
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glEnable(GL11.GL_BLEND);
            	this.model.renderflame(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glDisable(GL11.GL_BLEND);
            
            GL11.glScalef(10f, 1.5f, 1.5f);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    	}
   
    private void adjustLightFixture(World world, int i, int j, int k, Block block) 
    	{
            Tessellator tess = Tessellator.instance;
            float brightness = block.getLightValue(world, i, j, k);
            int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
            int modulousModifier = skyLight % 65536;
            int divModifier = skyLight / 65536;
            tess.setColorOpaque_F(brightness, brightness, brightness);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    	}
}*/
