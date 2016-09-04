package com.tage.crimsonwarfare.renders;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class RenderModItem implements IItemRenderer
{
	private final float scale = 0.6F;
	private final float t1 = -0.05F;
	private final float t2 = 0.27F;
	private final float t3 = 0.0F;

	public RenderModItem() {
		//this.scale = 0.70F;
		//this.t1 = -0.11F;
		//this.t2 = 0.3F;
		//this.t3 = 0F;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON || type == ItemRenderType.INVENTORY;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type){
		case EQUIPPED_FIRST_PERSON:
			renderEquippedItem(item, (EntityLivingBase) data[1], true);
			
			break;
		case EQUIPPED:
			GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-13F, 0.0F, 0.0F, 1F);
			
			GL11.glTranslatef(t1, t2, t3);
			
			renderEquippedItem(item, (EntityLivingBase) data[1], false);
			break;
		case INVENTORY:
			//GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
			//GL11.glRotatef(0F, 0.0F, 1.0F, 0.0F);
			//GL11.glRotatef(-13F, 0.0F, 0.0F, 1F);
			
			//GL11.glTranslatef(t1, t2, t3);
			
			//renderEquippedItem(item, (EntityLivingBase) data[1], false);
		default:
		}
	}

	private void renderEquippedItem(ItemStack stack, EntityLivingBase entity, boolean firstPerson) {
		GL11.glPushMatrix();
		float f = scale;
		
		if (firstPerson) {
			f *= 1.75F;
			GL11.glTranslatef(-0.35F * scale, -0.125F * scale, 0.0F);
		} else {
			f *= (entity instanceof EntityPlayer ? 2.0F : 1.75F);
			GL11.glTranslatef(1.0F - f, -0.125F * scale, 0.05F * scale);
		}
		GL11.glScalef(f, f, f);
		IIcon icon = stack.getItem().getIcon(stack, 0);
		Tessellator tessellator = Tessellator.instance;
		//ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		GL11.glPopMatrix();
	}
}