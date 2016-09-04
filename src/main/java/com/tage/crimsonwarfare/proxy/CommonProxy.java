package com.tage.crimsonwarfare.proxy;

import net.minecraft.creativetab.CreativeTabs;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy 
{
	public void initialize() {}
	
	public void registerRenderers() {}
	
	public static void registerTileEntities() {}
}
