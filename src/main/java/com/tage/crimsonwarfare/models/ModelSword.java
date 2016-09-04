package com.tage.crimsonwarfare.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSword extends ModelBase
{
  //fields
    ModelRenderer HiltMain;
    ModelRenderer HiltTopMiddle;
    ModelRenderer HiltBottomMiddle;
    ModelRenderer SwordTip1;
    ModelRenderer SwordBladeMain;
    ModelRenderer SwordTip2;
    ModelRenderer SwordTipMiddle;
    ModelRenderer SwordTipFiller;
    ModelRenderer SwordHilt1;
    ModelRenderer SwordHilt2;
    ModelRenderer SwordHilt3;
    ModelRenderer SwordHilt4;
    ModelRenderer SwordHiltEnd1;
    ModelRenderer SwordHiltEnd2;
    ModelRenderer SwordHiltHorn1;
    ModelRenderer SwordHiltHorn2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
  public ModelSword()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      HiltMain = new ModelRenderer(this, 16, 0);
      HiltMain.addBox(0F, 0F, 0F, 1, 4, 1);
      HiltMain.setRotationPoint(0F, 1F, 0F);
      HiltMain.setTextureSize(64, 32);
      HiltMain.mirror = false;
      setRotation(HiltMain, 0F, 0F, 0F);
      
      HiltTopMiddle = new ModelRenderer(this, 0, 14);
      HiltTopMiddle.addBox(0F, 0F, 0F, 2, 1, 2);
      HiltTopMiddle.setRotationPoint(-0.5F, 0F, -0.5F);
      HiltTopMiddle.setTextureSize(64, 32);
      HiltTopMiddle.mirror = false;
      setRotation(HiltTopMiddle, 0F, 0F, 0F);
      
      HiltBottomMiddle = new ModelRenderer(this, 0, 17);
      HiltBottomMiddle.addBox(0F, 0F, 0F, 2, 1, 2);
      HiltBottomMiddle.setRotationPoint(-0.5F, 5F, -0.5F);
      HiltBottomMiddle.setTextureSize(64, 32);
      HiltBottomMiddle.mirror = false;
      setRotation(HiltBottomMiddle, 0F, 0F, 0F);
      
      SwordTip1 = new ModelRenderer(this, 8, 16);
      SwordTip1.addBox(0F, -1F, 0F, 4, 1, 1);
      SwordTip1.setRotationPoint(2F, -13F, 0F);
      SwordTip1.setTextureSize(64, 32);
      SwordTip1.mirror = false;
      setRotation(SwordTip1, 0F, 0F, -1.783028F);
      
      SwordBladeMain = new ModelRenderer(this, 0, 0);
      SwordBladeMain.addBox(0F, 0F, 0F, 1, 13, 1);
      SwordBladeMain.setRotationPoint(-1F, -13F, 0F);
      SwordBladeMain.setTextureSize(64, 32);
      setRotation(SwordBladeMain, 0F, 0F, 0F);
      SwordBladeMain.mirror = true;
      
      SwordTip2 = new ModelRenderer(this, 8, 18);
      SwordTip2.addBox(0F, 0F, 0F, 4, 1, 1);
      SwordTip2.setRotationPoint(-1F, -13F, 0F);
      SwordTip2.setTextureSize(64, 32);
      SwordTip2.mirror = false;
      setRotation(SwordTip2, 0F, 0F, -1.376192F);
      
      SwordTip2.mirror = false;
      SwordTipMiddle = new ModelRenderer(this, 10, 0);
      SwordTipMiddle.addBox(-1F, -1F, 0F, 1, 1, 1);
      SwordTipMiddle.setRotationPoint(0.5F, -16.2F, 0F);
      SwordTipMiddle.setTextureSize(64, 32);
      setRotation(SwordTipMiddle, 0F, 0F, 0.7853982F);
      
      SwordTipFiller = new ModelRenderer(this, 8, 0);
      SwordTipFiller.addBox(-0.5F, -3F, 0F, 1, 4, 0);
      SwordTipFiller.setRotationPoint(0.5F, -13F, 0.5F);
      SwordTipFiller.setTextureSize(64, 32);
      SwordTipFiller.mirror = false;
      setRotation(SwordTipFiller, 0F, 0F, 0F);
      
      SwordHilt1 = new ModelRenderer(this, 10, 4);
      SwordHilt1.addBox(0F, 0F, 0F, 1, 1, 2);
      SwordHilt1.setRotationPoint(1.5F, 0F, 1.5F);
      SwordHilt1.setTextureSize(64, 32);
      SwordHilt1.mirror = false;
      setRotation(SwordHilt1, 0F, 1.834341F, 0F);
      
      SwordHilt2 = new ModelRenderer(this, 10, 7);
      SwordHilt2.addBox(0F, 0F, -2F, 1, 1, 2);
      SwordHilt2.setRotationPoint(1.5F, 0F, -0.5F);
      SwordHilt2.setTextureSize(64, 32);
      SwordHilt2.mirror = false;
      setRotation(SwordHilt2, 0F, -1.832596F, 0F);
      
      SwordHilt3 = new ModelRenderer(this, 10, 10);
      SwordHilt3.addBox(-1F, 0F, 0F, 1, 1, 2);
      SwordHilt3.setRotationPoint(-0.5F, 0F, 1.5F);
      SwordHilt3.setTextureSize(64, 32);
      SwordHilt3.mirror = false;
      setRotation(SwordHilt3, 0F, -1.834341F, 0F);
      
      SwordHilt4 = new ModelRenderer(this, 10, 13);
      SwordHilt4.addBox(-1F, 0F, -2F, 1, 1, 2);
      SwordHilt4.setRotationPoint(-0.5F, 0F, -0.5F);
      SwordHilt4.setTextureSize(64, 32);
      SwordHilt4.mirror = false;
      setRotation(SwordHilt4, 0F, 1.834341F, 0F);
      
      SwordHiltEnd1 = new ModelRenderer(this, 16, 5);
      SwordHiltEnd1.addBox(0F, 0F, 0F, 1, 1, 1);
      SwordHiltEnd1.setRotationPoint(2.5F, 0F, 0F);
      SwordHiltEnd1.setTextureSize(64, 32);
      SwordHiltEnd1.mirror = false;
      setRotation(SwordHiltEnd1, 0F, 0F, 0F);
      
      SwordHiltEnd2 = new ModelRenderer(this, 16, 7);
      SwordHiltEnd2.addBox(0F, 0F, 0F, 1, 1, 1);
      SwordHiltEnd2.setRotationPoint(-2.5F, 0F, 0F);
      SwordHiltEnd2.setTextureSize(64, 32);
      SwordHiltEnd2.mirror = false;
      setRotation(SwordHiltEnd2, 0F, 0F, 0F);
      
      SwordHiltHorn1 = new ModelRenderer(this, 16, 9);
      SwordHiltHorn1.addBox(0F, 0F, 0F, 1, 2, 1);
      SwordHiltHorn1.setRotationPoint(3.5F, 1F, 0F);
      SwordHiltHorn1.setTextureSize(64, 32);
      SwordHiltHorn1.mirror = false;
      setRotation(SwordHiltHorn1, 0F, 0F, -2.617994F);
      
      SwordHiltHorn2 = new ModelRenderer(this, 16, 12);
      SwordHiltHorn2.addBox(-1F, 0F, 0F, 1, 2, 1);
      SwordHiltHorn2.setRotationPoint(-2.5F, 1F, 0F);
      SwordHiltHorn2.setTextureSize(64, 32);
      SwordHiltHorn2.mirror = false;
      setRotation(SwordHiltHorn2, 0F, 0F, 2.617994F);
      
      Shape1 = new ModelRenderer(this, 4, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 13, 1);
      Shape1.setRotationPoint(1F, -13F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = false;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 8, 4);
      Shape2.addBox(0F, 0F, 0F, 1, 12, 0);
      Shape2.setRotationPoint(0F, -12F, 0.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = false;
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 10, 2);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape3.setRotationPoint(0F, -1F, 0F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = false;
      setRotation(Shape3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    HiltMain.render(f5);
    HiltTopMiddle.render(f5);
    HiltBottomMiddle.render(f5);
    SwordTip1.render(f5);
    SwordBladeMain.render(f5);
    SwordTip2.render(f5);
    SwordTipMiddle.render(f5);
    SwordTipFiller.render(f5);
    SwordHilt1.render(f5);
    SwordHilt2.render(f5);
    SwordHilt3.render(f5);
    SwordHilt4.render(f5);
    SwordHiltEnd1.render(f5);
    SwordHiltEnd2.render(f5);
    SwordHiltHorn1.render(f5);
    SwordHiltHorn2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

public void renderInv(float f, float f1, float f2, float f3, float f4, float f5) {
    HiltMain.render(f5);
    HiltTopMiddle.render(f5);
    HiltBottomMiddle.render(f5);
    SwordTip1.render(f5);
    SwordBladeMain.render(f5);
    SwordTip2.render(f5);
    SwordTipMiddle.render(f5);
    SwordTipFiller.render(f5);
    SwordHilt1.render(f5);
    SwordHilt2.render(f5);
    SwordHilt3.render(f5);
    SwordHilt4.render(f5);
    SwordHiltEnd1.render(f5);
    SwordHiltEnd2.render(f5);
    SwordHiltHorn1.render(f5);
    SwordHiltHorn2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
  }
}
