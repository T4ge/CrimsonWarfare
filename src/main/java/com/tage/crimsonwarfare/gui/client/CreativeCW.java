package com.tage.crimsonwarfare.gui.client;

import com.tage.crimsonwarfare.init.Init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeCW extends CreativeTabs {

	public CreativeCW(String tabLabel) {
		super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Init.crimson_sword;
	}
	
	public String getTranslatedTabLabel()
	{
		return "Crimson Warfare";
	}


}
