package com.tage.crimsonwarfare.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;

public class EventHandler_NameFormat 
{
	@SubscribeEvent
	public void onEvent(NameFormat event)
	{
		System.out.println(event.username);
		if (event.username.equalsIgnoreCase("Tage")) // user name in the string
		{
		    event.displayname = "Claire";
		}
		else
		{
		    event.displayname = event.username;           
		}
		
	}
}
