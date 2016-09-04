package com.tage.crimsonwarfare.renders;

import org.lwjgl.opengl.GL11;

import com.tage.crimsonwarfare.entity.EntityElf;
import com.tage.crimsonwarfare.references.Reference.References;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class RenderElf extends RenderPlayer{
	
	private static final ResourceLocation Textures = new ResourceLocation(References.MOD_ID + ":textures/models/FemaleElf.png");
    
	public RenderElf(ModelBase par1model, float par2) {
		super();
	}

	protected ResourceLocation getEntityTexture(EntityPlayer entity){
		return Textures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPlayer)entity);
	}
}
