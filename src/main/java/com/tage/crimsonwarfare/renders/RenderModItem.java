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
	private float scale;
	private float t1;
	private float t2;
	private float t3;

	public RenderModItem() {
		this.scale = 0.8f;
		this.t1 = 0f;
		this.t2 = 0f;
		this.t3 = 0f;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.EQUIPPED /*|| type == ItemRenderType.EQUIPPED_FIRST_PERSON || type == ItemRenderType.INVENTORY*/;
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
			GL11.glRotatef(-12F, 0.0F, 0.0F, 1F);
			GL11.glScalef(this.scale, this.scale, this.scale);
			GL11.glTranslatef(-0.3f, 0.2f, 0.045f);
			
			renderEquippedItem(item, (EntityLivingBase) data[1], false);
			break;
		default:
		}
	}

	private void renderEquippedItem(ItemStack stack, EntityLivingBase entity, boolean firstPerson) {
		GL11.glPushMatrix();
		float f = 1.2f;
		
		GL11.glScalef(f, f, f);
		IIcon icon = stack.getItem().getIcon(stack, 0);
		Tessellator tessellator = Tessellator.instance;
		ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		GL11.glPopMatrix();
	}
}