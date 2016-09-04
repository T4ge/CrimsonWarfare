package com.tage.crimsonwarfare.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelEmpoweredAmber - Tage
 * Created using Tabula 4.1.1
 */
public class ModelEmpoweredAmber extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2a;
    public ModelRenderer shape2b;
    public ModelRenderer shape2y;
    public ModelRenderer shape2x;
    public ModelRenderer shape4a;
    public ModelRenderer shape4b;
    public ModelRenderer shape4c;
    public ModelRenderer shape4d;
    public ModelRenderer shape5b;
    public ModelRenderer shape5a;
    public ModelRenderer shape5b_1;
    public ModelRenderer shape5a_1;
    public ModelRenderer shape14a;
    public ModelRenderer shape14b;
    public ModelRenderer shape14c;
    public ModelRenderer shape14d;

    public ModelEmpoweredAmber() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.shape5b = new ModelRenderer(this, 26, 0);
        this.shape5b.setRotationPoint(-1.0F, 22.0F, -2.9F);
        this.shape5b.addBox(0.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape5b, -0.6108652381980153F, 0.0F, 0.0F);
        this.shape2b = new ModelRenderer(this, 16, 0);
        this.shape2b.setRotationPoint(-8.0F, 21.0F, -8.0F);
        this.shape2b.addBox(0.0F, 0.0F, 0.0F, 16, 1, 16, 0.0F);
        this.shape5b_1 = new ModelRenderer(this, 20, 4);
        this.shape5b_1.setRotationPoint(2.9F, 22.0F, -1.0F);
        this.shape5b_1.addBox(0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5b_1, 0.0F, 0.0F, -0.6108652381980153F);
        this.shape4c = new ModelRenderer(this, 26, 0);
        this.shape4c.setRotationPoint(-1.0F, -10.0F, 2.9F);
        this.shape4c.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape4c, -0.6108652381980153F, 0.0F, 0.0F);
        this.shape4d = new ModelRenderer(this, 20, 0);
        this.shape4d.setRotationPoint(1.0F, -10.0F, -2.9F);
        this.shape4d.addBox(-2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape4d, 0.6108652381980153F, 0.0F, 0.0F);
        this.shape14b = new ModelRenderer(this, 0, 34);
        this.shape14b.setRotationPoint(-4.0F, -9.0F, -4.0F);
        this.shape14b.addBox(0.0F, 0.0F, 0.0F, 8, 30, 0, 0.0F);
        this.shape14c = new ModelRenderer(this, 0, 26);
        this.shape14c.setRotationPoint(4.0F, -9.0F, -4.0F);
        this.shape14c.addBox(0.0F, 0.0F, 0.0F, 0, 30, 8, 0.0F);
        this.shape5a_1 = new ModelRenderer(this, 26, 4);
        this.shape5a_1.setRotationPoint(-2.9F, 22.0F, -1.0F);
        this.shape5a_1.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5a_1, 0.0F, 0.0F, 0.6108652381980153F);
        this.shape4a = new ModelRenderer(this, 26, 4);
        this.shape4a.setRotationPoint(2.9F, -10.0F, -1.0F);
        this.shape4a.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape4a, 0.0F, 0.0F, 0.6108652381980153F);
        this.shape5a = new ModelRenderer(this, 20, 0);
        this.shape5a.setRotationPoint(1.0F, 22.0F, 2.9F);
        this.shape5a.addBox(-2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape5a, 0.6108652381980153F, 0.0F, 0.0F);
        this.shape14a = new ModelRenderer(this, 0, 26);
        this.shape14a.setRotationPoint(-4.0F, -9.0F, -4.0F);
        this.shape14a.addBox(0.0F, 0.0F, 0.0F, 0, 30, 8, 0.0F);
        this.shape4b = new ModelRenderer(this, 20, 4);
        this.shape4b.setRotationPoint(-2.9F, -10.0F, -1.0F);
        this.shape4b.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape4b, 0.0F, 0.0F, -0.6108652381980153F);
        this.shape2x = new ModelRenderer(this, 16, 23);
        this.shape2x.setRotationPoint(-2.5F, 20.0F, -2.5F);
        this.shape2x.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-2.0F, -8.0F, -2.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 4, 28, 4, 0.0F);
        this.shape14d = new ModelRenderer(this, 0, 34);
        this.shape14d.setRotationPoint(-4.0F, -9.0F, 4.0F);
        this.shape14d.addBox(0.0F, 0.0F, 0.0F, 8, 30, 0, 0.0F);
        this.shape2a = new ModelRenderer(this, 16, 0);
        this.shape2a.setRotationPoint(-4.0F, -10.0F, -4.0F);
        this.shape2a.addBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F);
        this.shape2y = new ModelRenderer(this, 16, 17);
        this.shape2y.setRotationPoint(-2.5F, -9.0F, -2.5F);
        this.shape2y.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape5b.render(f5);
        this.shape2b.render(f5);
        this.shape5b_1.render(f5);
        this.shape4c.render(f5);
        this.shape4d.render(f5);
        this.shape14b.render(f5);
        this.shape14c.render(f5);
        this.shape5a_1.render(f5);
        this.shape4a.render(f5);
        this.shape5a.render(f5);
        this.shape14a.render(f5);
        this.shape4b.render(f5);
        this.shape2x.render(f5);
       // this.shape1.render(f5);
        this.shape14d.render(f5);
        this.shape2a.render(f5);
        this.shape2y.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

	public void renderModel(float f5) {
        this.shape5b.render(f5);
        this.shape2b.render(f5);
        this.shape5b_1.render(f5);
        this.shape4c.render(f5);
        this.shape4d.render(f5);
        this.shape14b.render(f5);
        this.shape14c.render(f5);
        this.shape5a_1.render(f5);
        this.shape4a.render(f5);
        this.shape5a.render(f5);
        this.shape14a.render(f5);
        this.shape4b.render(f5);
        this.shape2x.render(f5);
        //this.shape1.render(f5);
        this.shape14d.render(f5);
        this.shape2a.render(f5);
        this.shape2y.render(f5);
	}

	public void renderModel2(Entity entity, float f, float g, float h, float i,
			float j, float f5) {
        this.shape5b.render(f5);
        this.shape2b.render(f5);
        this.shape5b_1.render(f5);
        this.shape4c.render(f5);
        this.shape4d.render(f5);
        this.shape14b.render(f5);
        this.shape14c.render(f5);
        this.shape5a_1.render(f5);
        this.shape4a.render(f5);
        this.shape5a.render(f5);
        this.shape14a.render(f5);
        this.shape4b.render(f5);
        this.shape2x.render(f5);
        //this.shape1.render(f5);
        this.shape14d.render(f5);
        this.shape2a.render(f5);
        this.shape2y.render(f5);
		
	}

	public void render3(Entity entity, float f, float g, float h, float i, float j, float f5) 
	{
		this.shape1.render(f5);
	}
}
