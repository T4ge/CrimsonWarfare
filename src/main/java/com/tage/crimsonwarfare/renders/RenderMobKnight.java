package com.tage.crimsonwarfare.renders;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.tage.crimsonwarfare.entity.EntityKnight;
import com.tage.crimsonwarfare.references.Reference.References;

public class RenderMobKnight extends RenderBiped{

    private ModelBiped field_82434_o;
    protected ModelBiped field_82437_k;
    protected ModelBiped field_82435_l;
    protected ModelBiped field_82436_m;
    protected ModelBiped field_82433_n;
    private Object var1;
    ResourceLocation var2;
    private int field_82431_q = 1;
	private static final ResourceLocation mobTextures = new ResourceLocation(References.MOD_ID + ":textures/models/knight.png");
	
    public RenderMobKnight(ModelBiped par1model, float par2)
    {
        super(new ModelBiped(), 0.5F, 1.0F);
        this.field_82434_o = this.modelBipedMain;
    }
	
    private void func_82427_a(EntityKnight p_82427_1_)
    {

            this.mainModel = this.field_82434_o;
            this.field_82423_g = this.field_82437_k;
            this.field_82425_h = this.field_82435_l;
            this.modelBipedMain = (ModelBiped)this.mainModel;
    }
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityKnight)par1EntityLivingBase, par2);
    }
    protected void scaleSpider(EntityKnight par1EntityCaveSpider, float par2)
    {
        GL11.glScalef(1.0F, 1.0F, 1.0F);
    }
    
	/*public RenderMobKnight(ModelBiped par1model, float par2) {
		super(par1model, par2);
		// TODO Auto-generated constructor stub
	}*/

	protected ResourceLocation getEntityTexture(EntityKnight entity){
		return mobTextures;
	}
	
    protected ResourceLocation getEntityTexture(EntityLiving p_110775_1_)
    {
        return this.getEntityTexture((EntityKnight)p_110775_1_);
    }

}

