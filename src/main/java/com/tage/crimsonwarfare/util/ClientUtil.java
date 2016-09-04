package com.tage.crimsonwarfare.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.obj.Face;
import net.minecraftforge.client.model.obj.GroupObject;
import net.minecraftforge.client.model.obj.TextureCoordinate;
import net.minecraftforge.client.model.obj.WavefrontObject;

public class ClientUtil {
	
	static HashMap<String, ResourceLocation> resourceMap = new HashMap<String, ResourceLocation>();
	
	public static Minecraft mc()
	{
		return Minecraft.getMinecraft();
	}
	
	public static WavefrontObject getModel(String path)
	{
		ResourceLocation rl = resourceMap.containsKey(path) ? resourceMap.get(path) : new ResourceLocation(path);
		if(!resourceMap.containsKey(path))
			resourceMap.put(path, rl);
		return (WavefrontObject)AdvancedModelLoader.loadModel(rl);
	}
	
	public static void bindTexture(String path)
	{
		mc().getTextureManager().bindTexture(getResource(path));
	}
	
	public static ResourceLocation getResource(String path)
	{
		ResourceLocation rl = resourceMap.containsKey(path) ? resourceMap.get(path) : new ResourceLocation(path);
		if(!resourceMap.containsKey(path))
			resourceMap.put(path, rl);
		return rl;
	}
}
