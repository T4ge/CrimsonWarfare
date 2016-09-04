package com.tage.crimsonwarfare.models;

import com.tage.crimsonwarfare.entity.EntityElf;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.util.MathHelper;

public class ModelElf extends ModelBiped
{
    public int heldItemLeft;
    public int heldItemRight;
    public boolean isSneak;
    public boolean aimedBow;
	
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer earright1;
    ModelRenderer earright2;
    ModelRenderer earleft1;
    ModelRenderer earleft2;
    ModelRenderer chest;
    ModelRenderer hair1;
    ModelRenderer hair2;
    ModelRenderer hair3;
    ModelRenderer hair4;
    ModelRenderer Hood;
  
  public ModelElf()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-2F, -2F, -1.5F, 3, 12, 3);
      rightarm.setRotationPoint(-4F, 2F, 0.5333334F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -1.5F, 3, 12, 3);
      leftarm.setRotationPoint(5F, 2F, 0.4666667F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      
      leftleg = new ModelRenderer(this, 0, 32);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      
      earright1 = new ModelRenderer(this, 0, 0);
      earright1.addBox(0F, 0F, 0F, 1, 6, 1);
      earright1.setRotationPoint(-4F, -3.6F, -1F);
      earright1.setTextureSize(128, 64);
      earright1.mirror = true;
      setRotation(earright1, 2.181662F, -0.715585F, 0F);
      
      earright1.mirror = false;
      earright2 = new ModelRenderer(this, 0, 0);
      earright2.addBox(0F, 0F, 0F, 1, 6, 1);
      earright2.setRotationPoint(-4F, -2.3F, -1F);
      earright2.setTextureSize(128, 64);
      earright2.mirror = true;
      setRotation(earright2, 2.326524F, -0.715585F, 0F);
      
      earleft1 = new ModelRenderer(this, 0, 0);
      earleft1.addBox(0F, 0F, 0F, 1, 6, 1);
      earleft1.setRotationPoint(3F, -3.6F, -1F);
      earleft1.setTextureSize(128, 64);
      earleft1.mirror = true;
      setRotation(earleft1, 2.181662F, 0.715585F, 0F);
      
      earleft2 = new ModelRenderer(this, 0, 0);
      earleft2.addBox(0F, 0F, 0F, 1, 6, 1);
      earleft2.setRotationPoint(3F, -2.3F, -1F);
      earleft2.setTextureSize(128, 64);
      earleft2.mirror = true;
      setRotation(earleft2, 2.326524F, 0.715585F, 0F);
      
      chest = new ModelRenderer(this, 19, 32);
      chest.addBox(0F, 0F, 0F, 7, 3, 3);
      chest.setRotationPoint(-3.5F, 1.4F, -2F);
      chest.setTextureSize(128, 64);
      chest.mirror = false;
      setRotation(chest, -0.7033987F, 0F, 0F);
      
      hair1 = new ModelRenderer(this, 32, 0);
      hair1.addBox(0F, 0F, 0F, 2, 2, 1);
      hair1.setRotationPoint(-1F, -6F, 4F);
      hair1.setTextureSize(128, 64);
      hair1.mirror = true;
      setRotation(hair1, 0F, 0F, 0F);
      
      hair2 = new ModelRenderer(this, 38, 0);
      hair2.addBox(0F, 0F, 0F, 3, 3, 1);
      hair2.setRotationPoint(-1.5F, -6.5F, 5F);
      hair2.setTextureSize(128, 64);
      hair2.mirror = true;
      setRotation(hair2, 0F, 0F, 0F);
      
      hair3 = new ModelRenderer(this, 46, 0);
      hair3.addBox(0F, 0F, 0F, 2, 3, 1);
      hair3.setRotationPoint(-1F, -6F, 6F);
      hair3.setTextureSize(128, 64);
      hair3.mirror = true;
      setRotation(hair3, 0F, 0F, 0F);
      
      hair4 = new ModelRenderer(this, 52, 0);
      hair4.addBox(0F, 0F, 0F, 2, 3, 1);
      hair4.setRotationPoint(-1F, -5F, 7F);
      hair4.setTextureSize(128, 64);
      hair4.mirror = true;
      setRotation(hair4, 0F, 0F, 0F);
      
      Hood = new ModelRenderer(this, 16, 38);
      Hood.addBox(0F, -8F, 0F, 9, 9, 9);
      Hood.setRotationPoint(-4.5F, -8.5F, -4.5F);
      Hood.setTextureSize(128, 64);
      Hood.mirror = true;
      setRotation(Hood, 0F, 0F, 0F);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    earright1.render(f5);
    earright2.render(f5);
    earleft1.render(f5);
    earleft2.render(f5);
    chest.render(f5);
    hair1.render(f5);
    hair2.render(f5);
    hair3.render(f5);
    hair4.render(f5);
    Hood.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
	    {
	        this.rightarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
	        this.leftarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
	        this.rightarm.rotateAngleZ = 0.0F;
	        this.leftarm.rotateAngleZ = 0.0F;
	        this.rightleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
	        this.leftleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
	        this.rightleg.rotateAngleY = 0.0F;
	        this.leftleg.rotateAngleY = 0.0F;
	        
	        if (this.isRiding)
	        {
	            this.rightarm.rotateAngleX += -((float)Math.PI / 5F);
	            this.leftarm.rotateAngleX += -((float)Math.PI / 5F);
	            this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	            this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	            this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
	            this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
	        }

	        if (this.heldItemLeft != 0)
	        {
	            this.leftarm.rotateAngleX = this.leftarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
	        }

	        if (this.heldItemRight != 0)
	        {
	            this.rightarm.rotateAngleX = this.rightarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
	        }

	        this.rightarm.rotateAngleY = 0.0F;
	        this.leftarm.rotateAngleY = 0.0F;
	        float f6;
	        float f7;

	        if (this.onGround > -9990.0F)
	        {
	            f6 = this.onGround;
	            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
	            this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
	            this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
	            this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
	            this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
	            this.rightarm.rotateAngleY += this.body.rotateAngleY;
	            this.leftarm.rotateAngleY += this.body.rotateAngleY;
	            this.leftarm.rotateAngleX += this.body.rotateAngleY;
	            f6 = 1.0F - this.onGround;
	            f6 *= f6;
	            f6 *= f6;
	            f6 = 1.0F - f6;
	            f7 = MathHelper.sin(f6 * (float)Math.PI);
	            float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
	            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
	            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
	            this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
	        }

	        if (this.isSneak)
	        {
	            this.body.rotateAngleX = 0.5F;
	            this.rightarm.rotateAngleX += 0.4F;
	            this.leftarm.rotateAngleX += 0.4F;
	            this.rightleg.rotationPointZ = 4.0F;
	            this.leftleg.rotationPointZ = 4.0F;
	            this.rightleg.rotationPointY = 9.0F;
	            this.leftleg.rotationPointY = 9.0F;
	            this.head.rotationPointY = 1.0F;
	            this.Hood.rotationPointY = 1.0F;
	        }
	        else
	        {
	            this.body.rotateAngleX = 0.0F;
	            this.rightleg.rotationPointZ = 0.1F;
	            this.leftleg.rotationPointZ = 0.1F;
	            this.rightleg.rotationPointY = 12.0F;
	            this.leftleg.rotationPointY = 12.0F;
	            this.head.rotationPointY = 0.0F;
	            this.Hood.rotationPointY = 0.0F;
	        }

	        this.rightarm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
	        this.leftarm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
	        this.rightarm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
	        this.leftarm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;

	        if (this.aimedBow)
	        {
	            f6 = 0.0F;
	            f7 = 0.0F;
	            this.rightarm.rotateAngleZ = 0.0F;
	            this.leftarm.rotateAngleZ = 0.0F;
	            this.rightarm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.head.rotateAngleY;
	            this.leftarm.rotateAngleY = 0.1F - f6 * 0.6F + this.head.rotateAngleY + 0.4F;
	            this.rightarm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
	            this.leftarm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
	            this.rightarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
	            this.leftarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
	            this.rightarm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
	            this.leftarm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
	            this.rightarm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
	            this.leftarm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
	        }
	    }
  	}

}
