package com.tage.crimsonwarfare.init;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.entity.EntityKnight;
import com.tage.crimsonwarfare.entity.projectiles.EtherealArrow;
import com.tage.crimsonwarfare.references.Reference.References;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EntityInit{

	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity()
	{	
		
		createEntity(EntityKnight.class, "Knight", 0x595959, 0xb30000);
		EntityRegistry.registerGlobalEntityID(EntityKnight.class, "Crimson Knight", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EtherealArrow.class, "etherealarrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EtherealArrow.class, "Ethereal Arrow", EntityRegistry.findGlobalUniqueEntityId(), References.MOD_ID, 64, 20, true);
		LanguageRegistry.instance().addStringLocalization("entity.Knight.name", "en_US", "Crimson Knight");
	}
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainCrimsonWarfare.instance, 64, 1, true);

		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
	    {
			if (BiomeGenBase.getBiomeGenArray()[i] != null)
	        	{				
					EntityRegistry.addSpawn(EntityKnight.class, 2, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray()[i]);
				}
	    	}
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
