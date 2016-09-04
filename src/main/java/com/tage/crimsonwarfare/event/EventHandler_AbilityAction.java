package com.tage.crimsonwarfare.event;

import java.util.List;
import java.util.Random;

import com.tage.crimsonwarfare.enums.EnumCusAct;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;

public class EventHandler_AbilityAction {

	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event)
	{
		if (event.player.getEntityData().getInteger(EnumCusAct.whirlDataKey) > 0)
		{
			float width = 2.5f;
			float height = 2.0f;
			AxisAlignedBB bounds = AxisAlignedBB.getBoundingBox(event.player.posX-width, event.player.posY, event.player.posZ-width, event.player.posX+width, event.player.posY+2, event.player.posZ+width);
			List <EntityLivingBase> entities = event.player.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, bounds);
			for(int i = 0; i < entities.size(); i++)
			{
				entities.get(i).attackEntityFrom(DamageSource.causePlayerDamage(event.player), 4.0f);
			}
			System.out.println(entities.size());
			
			//event.player.rotationYaw -= 20f; //Glitchy but functional :( I can't math tho! ;D
			System.out.println(event.player.getEntityData().getInteger(EnumCusAct.whirlDataKey));
			event.player.getEntityData().setInteger(EnumCusAct.whirlDataKey, event.player.getEntityData().getInteger(EnumCusAct.whirlDataKey) -1);
		}
		
		if (event.player.getEntityData().getInteger(EnumCusAct.chargeDataKey) > 0)
		{
			float width = 1f;
			float height = 2f;
			AxisAlignedBB bounds = AxisAlignedBB.getBoundingBox(event.player.posX-width, event.player.posY, event.player.posZ-width, event.player.posX+width, event.player.posY+2, event.player.posZ+width);
			List <EntityLivingBase> entities = event.player.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, bounds);
			for(int i = 0; i < entities.size(); i++)
			{
				entities.get(i).attackEntityFrom(DamageSource.causePlayerDamage(event.player), 7.0f);
			}
			System.out.println(entities.size());
			
			event.player.getEntityData().setInteger(EnumCusAct.chargeDataKey, event.player.getEntityData().getInteger(EnumCusAct.chargeDataKey) -1);
			System.out.println(event.player.getEntityData().getInteger(EnumCusAct.chargeDataKey));
		}
		
	}
}

