package com.tage.crimsonwarfare.renders;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.entity.projectiles.EtherealArrow;
import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.models.ModelSword;
import com.tage.crimsonwarfare.references.Reference;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.util.ClientUtil;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SideOnly(Side.CLIENT)
public class RenderEtherealArrow extends Render
{
	private IModelCustom modelObj;
	ResourceLocation arrowTextures = new ResourceLocation("crimson_warfare" + ":" + "textures/models/EtherealArrow.png");
	
	public RenderEtherealArrow() 
	{
		modelObj = AdvancedModelLoader.loadModel(new ResourceLocation(References.MOD_ID +":" +"models/ModelEtherealArrowTri.obj"));
	}
	
	@Override
	public void doRender(Entity var1, double x, double y, double z,	float whatAre, float theseFor) {
		System.out.println("Rendering Arrow - doRender");
		GL11.glPushMatrix();
		Minecraft.getMinecraft().renderEngine.bindTexture(arrowTextures);
			GL11.glScalef(1.7f, 1.7f, 1.7f);
			modelObj.renderAll();	
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return arrowTextures;
	}
}

