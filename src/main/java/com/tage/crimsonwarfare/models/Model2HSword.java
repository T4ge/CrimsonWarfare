package com.tage.crimsonwarfare.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * CrimsonCleaverModel - Tage
 * Created using Tabula 4.1.1
 */
public class Model2HSword extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4d;
    public ModelRenderer shape4a;
    public ModelRenderer shape4b;
    public ModelRenderer shape4c;
    public ModelRenderer shape8;
    public ModelRenderer shape8b;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape10b;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape15b;
    public ModelRenderer shape15c;
    public ModelRenderer shape15d;
    public ModelRenderer shape14b;
    public ModelRenderer shape14c;
    public ModelRenderer shape26;
    public ModelRenderer shape21;
    public ModelRenderer shape21_1;
    public ModelRenderer shape21_2;
    public ModelRenderer shape21_3;
    public ModelRenderer shape21_4;
    public ModelRenderer shape21_5;
    public ModelRenderer shape21_6;
    public ModelRenderer shape21_7;
    public ModelRenderer shape21_8;
    public ModelRenderer shape21_9;

    public Model2HSword() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape21_2 = new ModelRenderer(this, 0, 0);
        this.shape21_2.setRotationPoint(-0.7F, 21.0F, 0.3F);
        this.shape21_2.addBox(0.0F, 0.0F, -0.3F, 1, 4, 0, 0.0F);
        this.shape21_4 = new ModelRenderer(this, 0, 0);
        this.shape21_4.setRotationPoint(-0.9F, 3.6F, 0.3F);
        this.shape21_4.addBox(0.0F, 0.0F, -0.3F, 1, 15, 0, 0.0F);
        this.shape21_5 = new ModelRenderer(this, 0, 0);
        this.shape21_5.setRotationPoint(1.2F, -1.7F, 0.0F);
        this.shape21_5.addBox(-0.2F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(shape21_5, 0.0F, 0.0F, 0.019198621771937624F);
        this.shape4c = new ModelRenderer(this, 0, 0);
        this.shape4c.setRotationPoint(3.0F, -1.0F, -0.5F);
        this.shape4c.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape4c, 0.0F, 2.96705972839036F, 0.0F);
        this.shape15c = new ModelRenderer(this, 0, 0);
        this.shape15c.setRotationPoint(1.3F, -26.18F, 0.0F);
        this.shape15c.addBox(-2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape15c, 0.0F, 0.0F, -1.0953686385516412F);
        this.shape14 = new ModelRenderer(this, 0, 0);
        this.shape14.setRotationPoint(2.06F, -19.91F, 0.0F);
        this.shape14.addBox(0.0F, -0.8F, 0.0F, 5, 1, 1, 0.0F);
        this.setRotateAngle(shape14, 0.0F, 0.0F, 1.6390387005478748F);
        this.shape21_9 = new ModelRenderer(this, 0, 0);
        this.shape21_9.setRotationPoint(1.2F, -1.7F, 0.0F);
        this.shape21_9.addBox(-0.2F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(shape21_9, 0.0F, 0.0F, 0.019198621771937624F);
        this.shape8 = new ModelRenderer(this, 0, 0);
        this.shape8.setRotationPoint(-1.5F, -1.0F, 0.0F);
        this.shape8.addBox(0.0F, -18.0F, 0.0F, 1, 9, 1, 0.0F);
        this.shape21_3 = new ModelRenderer(this, 0, 0);
        this.shape21_3.setRotationPoint(2.1F, -2.0F, 0.0F);
        this.shape21_3.addBox(-0.1F, 0.0F, 0.0F, 1, 5, 0, 0.0F);
        this.setRotateAngle(shape21_3, 0.0F, 0.0F, 0.019198621771937624F);
        this.shape4d = new ModelRenderer(this, 0, 0);
        this.shape4d.setRotationPoint(-2.0F, -1.0F, -0.5F);
        this.shape4d.addBox(0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape4d, 0.0F, -2.8797932657906435F, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 0);
        this.shape10.setRotationPoint(-1.5F, -4.0F, 0.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape26 = new ModelRenderer(this, 0, 0);
        this.shape26.setRotationPoint(-0.4F, -5.8F, 0.0F);
        this.shape26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape26, 0.0F, 0.0F, -0.5009094953223726F);
        this.shape15d = new ModelRenderer(this, 0, 0);
        this.shape15d.setRotationPoint(3.0F, -28.08F, 0.0F);
        this.shape15d.addBox(-2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape15d, 0.0F, 0.0F, -0.7358308126408092F);
        this.shape21_1 = new ModelRenderer(this, 0, 0);
        this.shape21_1.setRotationPoint(0.1F, -26.0F, 0.8F);
        this.shape21_1.addBox(0.0F, 0.0F, 0.0F, 2, 25, 0, 0.0F);
        this.shape21_6 = new ModelRenderer(this, 0, 0);
        this.shape21_6.setRotationPoint(-0.7F, 21.0F, 0.3F);
        this.shape21_6.addBox(0.0F, 0.0F, -0.3F, 1, 4, 0, 0.0F);
        this.shape15b = new ModelRenderer(this, 0, 0);
        this.shape15b.setRotationPoint(0.3F, -23.7F, 0.0F);
        this.shape15b.addBox(-2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape15b, 0.0F, 0.0F, -1.3973105991466601F);
        this.shape15 = new ModelRenderer(this, 0, 0);
        this.shape15.setRotationPoint(-0.2F, -20.8F, 0.0F);
        this.shape15.addBox(-2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape15, 0.0F, 0.0F, -1.4095279039106205F);
        this.shape21 = new ModelRenderer(this, 0, 0);
        this.shape21.setRotationPoint(0.1F, -26.0F, 0.2F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 2, 25, 0, 0.0F);
        this.shape4a = new ModelRenderer(this, 0, 0);
        this.shape4a.setRotationPoint(-2.0F, -1.0F, 1.5F);
        this.shape4a.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape4a, 0.0F, 2.8797932657906435F, 0.0F);
        this.shape10b = new ModelRenderer(this, 0, 0);
        this.shape10b.setRotationPoint(-0.3F, -5.5F, 0.0F);
        this.shape10b.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape10b, 0.0F, 0.0F, 0.10681415022205297F);
        this.shape14b = new ModelRenderer(this, 0, 0);
        this.shape14b.setRotationPoint(2.63F, -27.88F, 0.0F);
        this.shape14b.addBox(-1.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape14b, 0.0F, 0.0F, 1.6896532488557106F);
        this.shape14c = new ModelRenderer(this, 0, 0);
        this.shape14c.setRotationPoint(1.98F, -21.91F, 0.0F);
        this.shape14c.addBox(-1.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape14c, 0.0F, 0.0F, 1.635548042043886F);
        this.shape12 = new ModelRenderer(this, 0, 0);
        this.shape12.setRotationPoint(0.7F, -5.4F, 0.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape12, 0.0F, 0.0F, 2.8911379059286073F);
        this.shape21_8 = new ModelRenderer(this, 0, 0);
        this.shape21_8.setRotationPoint(-0.9F, 3.6F, 0.3F);
        this.shape21_8.addBox(0.0F, 0.0F, -0.3F, 1, 15, 0, 0.0F);
        this.shape8b = new ModelRenderer(this, 0, 0);
        this.shape8b.setRotationPoint(1.5F, -1.0F, 0.0F);
        this.shape8b.addBox(0.0F, -14.0F, 0.0F, 1, 14, 1, 0.0F);
        this.setRotateAngle(shape8b, 0.0F, 0.0F, 0.0017453292519943296F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(-2.0F, -1.0F, -0.5F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        this.shape11 = new ModelRenderer(this, 0, 0);
        this.shape11.setRotationPoint(-0.7F, -3.4F, 0.0F);
        this.shape11.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape11, 0.0017453292519943296F, 0.0F, -0.9250245035569946F);
        this.shape21_7 = new ModelRenderer(this, 0, 0);
        this.shape21_7.setRotationPoint(2.1F, -2.0F, 0.0F);
        this.shape21_7.addBox(-0.1F, 0.0F, 0.0F, 1, 5, 0, 0.0F);
        this.setRotateAngle(shape21_7, 0.0F, 0.0F, 0.019198621771937624F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(-0.5F, 8.0F, -0.5F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.shape4b = new ModelRenderer(this, 0, 0);
        this.shape4b.setRotationPoint(3.0F, -1.0F, 1.5F);
        this.shape4b.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape4b, 0.0F, -2.96705972839036F, 0.0F);
        this.shape21.addChild(this.shape21_2);
        this.shape21.addChild(this.shape21_4);
        this.shape21.addChild(this.shape21_5);
        this.shape21_1.addChild(this.shape21_9);
        this.shape21.addChild(this.shape21_3);
        this.shape21_1.addChild(this.shape21_6);
        this.shape21_1.addChild(this.shape21_8);
        this.shape21_1.addChild(this.shape21_7);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape4c.render(f5);
        this.shape15c.render(f5);
        this.shape14.render(f5);
        this.shape8.render(f5);
        this.shape4d.render(f5);
        this.shape10.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.shape26.offsetX, this.shape26.offsetY, this.shape26.offsetZ);
        GL11.glTranslatef(this.shape26.rotationPointX * f5, this.shape26.rotationPointY * f5, this.shape26.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.4D, 1.0D);
        GL11.glTranslatef(-this.shape26.offsetX, -this.shape26.offsetY, -this.shape26.offsetZ);
        GL11.glTranslatef(-this.shape26.rotationPointX * f5, -this.shape26.rotationPointY * f5, -this.shape26.rotationPointZ * f5);
        this.shape26.render(f5);
        GL11.glPopMatrix();
        this.shape15d.render(f5);
        this.shape21_1.render(f5);
        this.shape15b.render(f5);
        this.shape15.render(f5);
        this.shape21.render(f5);
        this.shape4a.render(f5);
        this.shape10b.render(f5);
        this.shape14b.render(f5);
        this.shape14c.render(f5);
        this.shape12.render(f5);
        this.shape8b.render(f5);
        this.shape3.render(f5);
        this.shape11.render(f5);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape4b.render(f5);
    }

    public void renderInv(float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape4c.render(f5);
        this.shape15c.render(f5);
        this.shape14.render(f5);
        this.shape8.render(f5);
        this.shape4d.render(f5);
        this.shape10.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.shape26.offsetX, this.shape26.offsetY, this.shape26.offsetZ);
        GL11.glTranslatef(this.shape26.rotationPointX * f5, this.shape26.rotationPointY * f5, this.shape26.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.4D, 1.0D);
        GL11.glTranslatef(-this.shape26.offsetX, -this.shape26.offsetY, -this.shape26.offsetZ);
        GL11.glTranslatef(-this.shape26.rotationPointX * f5, -this.shape26.rotationPointY * f5, -this.shape26.rotationPointZ * f5);
        this.shape26.render(f5);
        GL11.glPopMatrix();
        this.shape15d.render(f5);
        this.shape21_1.render(f5);
        this.shape15b.render(f5);
        this.shape15.render(f5);
        this.shape21.render(f5);
        this.shape4a.render(f5);
        this.shape10b.render(f5);
        this.shape14b.render(f5);
        this.shape14c.render(f5);
        this.shape12.render(f5);
        this.shape8b.render(f5);
        this.shape3.render(f5);
        this.shape11.render(f5);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape4b.render(f5);
    }
    
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
