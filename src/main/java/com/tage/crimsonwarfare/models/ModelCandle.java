package com.tage.crimsonwarfare.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * ModelCandle - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelCandle extends ModelBase {
    public ModelRenderer shape8_1;
    public ModelRenderer shape18;
    public ModelRenderer shape17;
    public ModelRenderer shape16;
    public ModelRenderer shape15;
    public ModelRenderer shape14;
    public ModelRenderer WallMount1;
    public ModelRenderer shape11;
    public ModelRenderer shape10;
    public ModelRenderer shape5;
    public ModelRenderer shape7;
    public ModelRenderer Floor;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer Flame1;
    public ModelRenderer Flame2;
    public ModelRenderer Flame3;
    public ModelRenderer Flame4;
    public ModelRenderer Banner;
    public ModelRenderer WallMount2;

    public ModelCandle() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape5 = new ModelRenderer(this, 0, 5);
        this.shape5.setRotationPoint(4.0F, 5.0F, 2.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(2.0F, 4.0F, 4.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.shape18 = new ModelRenderer(this, 0, 0);
        this.shape18.setRotationPoint(1.0F, 5.0F, -1.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape8_1 = new ModelRenderer(this, 40, 7);
        this.shape8_1.setRotationPoint(0.5F, 8.5F, 0.5F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.shape14 = new ModelRenderer(this, 28, 11);
        this.shape14.setRotationPoint(-1.0F, 6.0F, -1.0F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.WallMount1 = new ModelRenderer(this, 4, 4);
        this.WallMount1.setRotationPoint(1.0F, 10.0F, 2.0F);
        this.WallMount1.addBox(0.0F, 0.0F, -3.0F, 2, 2, 2, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 9);
        this.shape10.setRotationPoint(1.5F, -1.600000023841858F, 1.5F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);

        this.WallMount2 = new ModelRenderer(this, 4, 0);
        this.WallMount2.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.WallMount2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.shape16 = new ModelRenderer(this, 36, 11);
        this.shape16.setRotationPoint(4.0F, 6.0F, 4.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape2 = new ModelRenderer(this, 28, 0);
        this.shape2.setRotationPoint(-1.0F, 8.0F, -1.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.shape11 = new ModelRenderer(this, 0, 12);
        this.shape11.setRotationPoint(-1.0F, 6.0F, 1.0F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape17 = new ModelRenderer(this, 40, 11);
        this.shape17.setRotationPoint(4.0F, 6.0F, -1.0F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);

        this.Floor = new ModelRenderer(this, 28, 7);
        this.Floor.setRotationPoint(0.5F, 12.0F, 0.5F);
        this.Floor.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.shape1 = new ModelRenderer(this, 12, 0);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);

        this.shape15 = new ModelRenderer(this, 32, 11);
        this.shape15.setRotationPoint(-1.0F, 6.0F, 4.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape7 = new ModelRenderer(this, 4, 8);
        this.shape7.setRotationPoint(1.0F, 8.0F, 1.0F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);

        this.Banner = new ModelRenderer(this, 44, 11);
        this.Banner.setRotationPoint(2.0F, 9.0F, 4.5F);
        this.Banner.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F);
        this.WallMount1.addChild(this.WallMount2);
        
        this.Flame1 = new ModelRenderer(this, 0, 24);
        this.Flame1.setRotationPoint(2.5F, -2.5F, 1.53F);
        this.Flame1.addBox(0.0F, 0.0F, 0.0F, 0, 8, 4, 0.0F);
        this.setRotateAngle(Flame1, 0.0F, 0.0F, -0.0F);
        this.Flame2 = new ModelRenderer(this, 0, 24);
        this.Flame2.setRotationPoint(1.5F, -2.5F, 2.55F);
        this.Flame2.addBox(0.0F, 0.0F, 0.0F, 4, 8, 0, 0.0F);
        this.setRotateAngle(Flame2, 0.0F, 0.0F, 0.0F);
        this.Flame3 = new ModelRenderer(this, 0, 24);
        this.Flame3.setRotationPoint(1.5F, -2.5F, 1.53F);
        this.Flame3.addBox(0.0F, 0.0F, 0.0F, 0, 8, 4, 0.0F);
        this.setRotateAngle(Flame3, 0.0F, 0.0F, 0.0F);
        this.Flame4 = new ModelRenderer(this, 0, 24);
        this.Flame4.setRotationPoint(1.5F, -2.5F, 1.5F);
        this.Flame4.addBox(0.0F, 0.0F, 0.0F, 4, 8, 0, 0.0F);
        this.setRotateAngle(Flame4, -0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape5.render(f5);
        this.shape3.render(f5);
        this.shape18.render(f5);
        this.shape8_1.render(f5);
        this.shape14.render(f5);
        this.WallMount1.render(f5);
        this.shape10.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame2.offsetX, this.Flame2.offsetY, this.Flame2.offsetZ);
        GL11.glTranslatef(this.Flame2.rotationPointX * f5, this.Flame2.rotationPointY * f5, this.Flame2.rotationPointZ * f5);
        GL11.glScaled(0.12D, 0.12D, 1.0D);
        GL11.glTranslatef(-this.Flame2.offsetX, -this.Flame2.offsetY, -this.Flame2.offsetZ);
        GL11.glTranslatef(-this.Flame2.rotationPointX * f5, -this.Flame2.rotationPointY * f5, -this.Flame2.rotationPointZ * f5);
        this.Flame2.render(f5);
        GL11.glPopMatrix();
        this.shape16.render(f5);
        this.shape2.render(f5);
        this.shape11.render(f5);
        this.shape17.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame3.offsetX, this.Flame3.offsetY, this.Flame3.offsetZ);
        GL11.glTranslatef(this.Flame3.rotationPointX * f5, this.Flame3.rotationPointY * f5, this.Flame3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.12D, 0.12D);
        GL11.glTranslatef(-this.Flame3.offsetX, -this.Flame3.offsetY, -this.Flame3.offsetZ);
        GL11.glTranslatef(-this.Flame3.rotationPointX * f5, -this.Flame3.rotationPointY * f5, -this.Flame3.rotationPointZ * f5);
        this.Flame3.render(f5);
        GL11.glPopMatrix();
        this.Floor.render(f5);
        this.shape1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame1.offsetX, this.Flame1.offsetY, this.Flame1.offsetZ);
        GL11.glTranslatef(this.Flame1.rotationPointX * f5, this.Flame1.rotationPointY * f5, this.Flame1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.12D, 0.12D);
        GL11.glTranslatef(-this.Flame1.offsetX, -this.Flame1.offsetY, -this.Flame1.offsetZ);
        GL11.glTranslatef(-this.Flame1.rotationPointX * f5, -this.Flame1.rotationPointY * f5, -this.Flame1.rotationPointZ * f5);
        this.Flame1.render(f5);
        GL11.glPopMatrix();
        this.shape15.render(f5);
        this.shape7.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame4.offsetX, this.Flame4.offsetY, this.Flame4.offsetZ);
        GL11.glTranslatef(this.Flame4.rotationPointX * f5, this.Flame4.rotationPointY * f5, this.Flame4.rotationPointZ * f5);
        GL11.glScaled(0.12D, 0.12D, 1.0D);
        GL11.glTranslatef(-this.Flame4.offsetX, -this.Flame4.offsetY, -this.Flame4.offsetZ);
        GL11.glTranslatef(-this.Flame4.rotationPointX * f5, -this.Flame4.rotationPointY * f5, -this.Flame4.rotationPointZ * f5);
        this.Flame4.render(f5);
        GL11.glPopMatrix();
        this.Banner.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void renderflame(float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame4.offsetX, this.Flame4.offsetY, this.Flame4.offsetZ);
        GL11.glTranslatef(this.Flame4.rotationPointX * f5, this.Flame4.rotationPointY * f5, this.Flame4.rotationPointZ * f5);
        GL11.glScaled(0.12D, 0.12D, 1.0D);
        GL11.glTranslatef(-this.Flame4.offsetX, -this.Flame4.offsetY, -this.Flame4.offsetZ);
        GL11.glTranslatef(-this.Flame4.rotationPointX * f5, -this.Flame4.rotationPointY * f5, -this.Flame4.rotationPointZ * f5);
        this.Flame4.render(f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame3.offsetX, this.Flame3.offsetY, this.Flame3.offsetZ);
        GL11.glTranslatef(this.Flame3.rotationPointX * f5, this.Flame3.rotationPointY * f5, this.Flame3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.12D, 0.12D);
        GL11.glTranslatef(-this.Flame3.offsetX, -this.Flame3.offsetY, -this.Flame3.offsetZ);
        GL11.glTranslatef(-this.Flame3.rotationPointX * f5, -this.Flame3.rotationPointY * f5, -this.Flame3.rotationPointZ * f5);
        this.Flame3.render(f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame1.offsetX, this.Flame1.offsetY, this.Flame1.offsetZ);
        GL11.glTranslatef(this.Flame1.rotationPointX * f5, this.Flame1.rotationPointY * f5, this.Flame1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.12D, 0.12D);
        GL11.glTranslatef(-this.Flame1.offsetX, -this.Flame1.offsetY, -this.Flame1.offsetZ);
        GL11.glTranslatef(-this.Flame1.rotationPointX * f5, -this.Flame1.rotationPointY * f5, -this.Flame1.rotationPointZ * f5);
        this.Flame1.render(f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslatef(this.Flame2.offsetX, this.Flame2.offsetY, this.Flame2.offsetZ);
        GL11.glTranslatef(this.Flame2.rotationPointX * f5, this.Flame2.rotationPointY * f5, this.Flame2.rotationPointZ * f5);
        GL11.glScaled(0.12D, 0.12D, 1.0D);
        GL11.glTranslatef(-this.Flame2.offsetX, -this.Flame2.offsetY, -this.Flame2.offsetZ);
        GL11.glTranslatef(-this.Flame2.rotationPointX * f5, -this.Flame2.rotationPointY * f5, -this.Flame2.rotationPointZ * f5);
        this.Flame2.render(f5);
        GL11.glPopMatrix();
    }
}
