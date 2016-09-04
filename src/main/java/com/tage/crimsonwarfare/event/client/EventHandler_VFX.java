package com.tage.crimsonwarfare.event.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

import com.tage.crimsonwarfare.enums.EnumCusAct;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler_VFX {

	@SubscribeEvent
	public void onWorldRender(RenderWorldLastEvent event)
	{
		GL11.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT, GL11.GL_NICEST);
	    GL11.glShadeModel(GL11.GL_SMOOTH);
	    GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glDepthFunc(GL11.GL_ALWAYS);
		//renderWhirl(Minecraft.getMinecraft().thePlayer, event.partialTicks);
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		GL11.glEnable(GL11.GL_CULL_FACE);
	}
	
	
	
	/*public static void renderWhirl(EntityPlayer player, float partialTicks)
	{
		float r = 1.0F;
		float g = 1.0F;
		float b = 1.0F;
		float a = 1.0F;
		
		EntityPlayer clientPlayer = Minecraft.getMinecraft().thePlayer;
		float viewX = (float) (player.lastTickPosX + (player.posX-player.lastTickPosX)*partialTicks);
		float viewY = (float) (player.lastTickPosY + (player.posY-player.lastTickPosY)*partialTicks);
		float viewZ = (float) (player.lastTickPosZ + (player.posZ-player.lastTickPosZ)*partialTicks);
		
		float posX = 0;
		float posY = 0;
		float posZ = 0;
		
		if(player != clientPlayer)
		{
			posX = (float) (player.lastTickPosX + (player.posX - player.lastTickPosX)*partialTicks) - viewX;
			posY = (float) (player.lastTickPosY + (player.posY - player.lastTickPosY)*partialTicks) - viewY;
			posZ = (float) (player.lastTickPosZ + (player.posZ - player.lastTickPosZ)*partialTicks) - viewZ;
		}
		
		float rotY = -player.rotationYaw;
		
		
		float progress = player.getEntityData().getInteger(EnumCusAct.whirlDataKey);
		float innerRingRadius = 2;
		float ringWidth = 1;
		float outerRingRadius = innerRingRadius + ringWidth;
		GL11.glPushMatrix();
			GL11.glTranslatef(posX, posY, posZ);
			GL11.glRotatef(rotY, 0, 1, 0);
			GL11.glColor4f(r, g, b, a);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			
			GL11.glBegin(GL11.GL_QUADS);
				int maxTailLength = EnumCusAct.maxWhirlTailLength;
				int tailLength = EnumCusAct.maxWhirlTime - (int)progress;
				if (tailLength > EnumCusAct.getMaxWhirlDamageTime()) tailLength = (EnumCusAct.maxWhirlTime-EnumCusAct.getMaxWhirlDamageTime())-((int)tailLength-EnumCusAct.getMaxWhirlDamageTime());
				if(tailLength > maxTailLength) tailLength = maxTailLength;
				
				float angle = ((float)(EnumCusAct.maxWhirlTime-progress))/EnumCusAct.getMaxWhirlDamageTime()*360.0F;
				if (angle > 360.0F) angle = 360.0F*2;
				float angleDiff = 360.0F/EnumCusAct.getMaxWhirlDamageTime(); 
				for(int i = 0; i < tailLength; i++)
				{
					float alpha = a*(1-((float)i)/tailLength);
					//int visProgress = EnumCusAct.maxWhirlTime-(int)progress;
					//if (visProgress > EnumCusAct.getMaxWhirlDamageTime()) visProgress = EnumCusAct.getMaxWhirlDamageTime();
					//float alpha = ((float)((EnumCusAct.maxWhirlTime-progress)-i-visProgress)/maxTailLength);
					if (alpha < 0) alpha = 0;
					if (alpha > 1) alpha = 1;
 					Vector2f vector = new Vector2f((float)(Math.sin((angle-i*angleDiff)/180.0F*Math.PI)), (float)(Math.cos((angle-i*angleDiff)/180.0F*Math.PI)));
					vector = (Vector2f) vector.normalise();
					GL11.glColor4f(r, g, b, alpha); GL11.glVertex3f(vector.x*(innerRingRadius+ringWidth/2*(1-alpha)), 0, vector.y*(innerRingRadius+ringWidth/2*(1-alpha)));
					GL11.glColor4f(r, g, b, alpha); GL11.glVertex3f(vector.x*(outerRingRadius-ringWidth/2*(1-alpha)), 0, vector.y*(outerRingRadius-ringWidth/2*(1-alpha)));
					
					alpha = a*(1-((float)i+1)/tailLength);
					vector = new Vector2f((float)(Math.sin((angle-(i+1)*angleDiff)/180.0F*Math.PI)), (float)(Math.cos((angle-(i+1)*angleDiff)/180.0F*Math.PI)));
					vector = (Vector2f) vector.normalise();
					GL11.glColor4f(r, g, b, alpha); GL11.glVertex3f(vector.x*(outerRingRadius-ringWidth/2*(1-alpha)), 0, vector.y*(outerRingRadius-ringWidth/2*(1-alpha)));
					GL11.glColor4f(r, g, b, alpha); GL11.glVertex3f(vector.x*(innerRingRadius+ringWidth/2*(1-alpha)), 0, vector.y*(innerRingRadius+ringWidth/2*(1-alpha)));
				}
			GL11.glEnd();
				Vector2f vector = new Vector2f((float)(Math.sin((angle)/180.0F*Math.PI)), (float)(Math.cos((angle)/180.0F*Math.PI)));
				vector = (Vector2f) vector.normalise();
				
				GL11.glPushMatrix();
					GL11.glTranslatef(vector.x*outerRingRadius, 0, vector.y*outerRingRadius);
					GL11.glColor3f(1, 0F, 0);
					//renderBox(GL11.GL_QUADS);
				GL11.glPopMatrix();
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glPopMatrix();
	}*/
	
	public static void renderBox(int mode){
		  float s = 0.1f;
		  GL11.glBegin(mode);
		   //Back
		   GL11.glVertex3f(-s,-s,-s);
		   GL11.glVertex3f(-s,s,-s);
		   GL11.glVertex3f(s,s,-s);
		   GL11.glVertex3f(s,-s,-s);
		  GL11.glEnd();
		  GL11.glBegin(mode);
		   //Front
		   GL11.glVertex3f(-s,s,s);
		   GL11.glVertex3f(-s,-s,s);
		   GL11.glVertex3f(s,-s,s);
		   GL11.glVertex3f(s,s,s);
		  GL11.glEnd();
		  GL11.glBegin(mode);
		   //Left
		   GL11.glVertex3f(-s,s,-s);
		   GL11.glVertex3f(-s,-s,-s);
		   GL11.glVertex3f(-s,-s,s);
		   GL11.glVertex3f(-s,s,s);
		  GL11.glEnd();
		  GL11.glBegin(mode);
		   //Right
		   GL11.glVertex3f(s,-s,-s);
		   GL11.glVertex3f(s,s,-s);
		   GL11.glVertex3f(s,s,s);
		   GL11.glVertex3f(s,-s,s);
		  GL11.glEnd();
		  GL11.glBegin(mode);
		   //Top
		   GL11.glVertex3f(-s,s,-s);
		   GL11.glVertex3f(-s,s,s);
		   GL11.glVertex3f(s,s,s);
		   GL11.glVertex3f(s,s,-s);
		  GL11.glEnd();
		  GL11.glBegin(mode);
		   //Bottom
		   GL11.glVertex3f(-s,-s,s);
		   GL11.glVertex3f(-s,-s,-s);
		   GL11.glVertex3f(s,-s,-s);
		   GL11.glVertex3f(s,-s,s);
		  GL11.glEnd();
		 }
}
