package com.tage.crimsonwarfare.tcspesific;

import java.util.HashMap;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
//import thaumcraft.common.config.ConfigItems;
import thaumcraft.api.ItemApi;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigItems;

//import thaumcraft.common.config.ConfigItems;

import com.tage.crimsonwarfare.init.Init;
import com.tage.crimsonwarfare.references.Reference.References;
import com.tage.crimsonwarfare.util.CWFakeResearch;

public class Research {
    public static HashMap recipes = new HashMap<String,Object>();
    public static String Name = References.MOD_ID;
    public static final ResourceLocation background = new ResourceLocation(References.MOD_ID + ":" + "textures/misc/vortex.png");
    		
    public static void setupResearchPages()
    {
        ResearchCategories.registerCategory(Name, new ResourceLocation("thaumcraft", "textures/items/cultistplatehelm.png"), background);
	}
    
    public static void registerRecipes()
    {
    	Research.recipes.put("crimsonhelm", ThaumcraftApi.addInfusionCraftingRecipe("crimsonhelm", new ItemStack (ConfigItems.itemHelmetCultistPlate, 0), 2, (new AspectList()).add(Aspect.ARMOR, 24).add(Aspect.ELDRITCH, 12), new ItemStack(Items.iron_helmet), new ItemStack[] { new ItemStack(Items.dye, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    	Research.recipes.put("crimsonchest", ThaumcraftApi.addInfusionCraftingRecipe("crimsonchest", new ItemStack (ConfigItems.itemChestCultistPlate, 0), 2, (new AspectList()).add(Aspect.ARMOR, 24).add(Aspect.ELDRITCH, 12), new ItemStack(Items.iron_chestplate), new ItemStack[] { new ItemStack(Items.dye, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    	Research.recipes.put("crimsonlegs", ThaumcraftApi.addInfusionCraftingRecipe("crimsonlegs", new ItemStack (ConfigItems.itemLegsCultistPlate, 0), 2, (new AspectList()).add(Aspect.ARMOR, 24).add(Aspect.ELDRITCH, 12), new ItemStack(Items.iron_leggings), new ItemStack[] { new ItemStack(Items.dye, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    	Research.recipes.put("crimsonboots", ThaumcraftApi.addInfusionCraftingRecipe("crimsonboots", new ItemStack (ConfigItems.itemBootsCultist, 0), 2, (new AspectList()).add(Aspect.ARMOR, 24).add(Aspect.ELDRITCH, 12), new ItemStack(Items.iron_boots), new ItemStack[] { new ItemStack(Items.dye, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    	
    	Research.recipes.put("cultist_sword", ThaumcraftApi.addInfusionCraftingRecipe("cultist_sword", new ItemStack(Init.cultist_sword), 1, (new AspectList()).add(Aspect.ELDRITCH, 8).add(Aspect.WEAPON, 8), ItemApi.getItem("itemSwordThaumium", 0), new ItemStack[] { new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.diamond), new ItemStack(Items.skull, 1, 1) }));
    	Research.recipes.put("crimson_sword", ThaumcraftApi.addInfusionCraftingRecipe("crimson_sword", new ItemStack(Init.crimson_sword), 1, (new AspectList()).add(Aspect.ELDRITCH, 8).add(Aspect.WEAPON, 8), new ItemStack(Init.crimson_sword), new ItemStack[] { new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.diamond), new ItemStack(Items.skull, 1, 1) }));
    	Research.recipes.put("crimson_cleaver", ThaumcraftApi.addInfusionCraftingRecipe("crimson_cleaver", new ItemStack(Init.crimson_cleaver), 1, (new AspectList()).add(Aspect.WEAPON, 6).add(Aspect.ELDRITCH, 8).add(Aspect.AIR, 16).add(Aspect.MOTION, 8), new ItemStack(Init.crimson_cleaver), new ItemStack[] { new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.diamond), new ItemStack(Items.skull, 1, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    	Research.recipes.put("crimson_battleaxe", ThaumcraftApi.addInfusionCraftingRecipe("crimson_battleaxe", new ItemStack(Init.crimson_battleaxe), 1, (new AspectList()).add(Aspect.WEAPON, 6).add(Aspect.ELDRITCH, 8).add(Aspect.AIR, 16).add(Aspect.MOTION, 8), new ItemStack(Init.crimson_battleaxe), new ItemStack[] { new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.ender_pearl, 0), new ItemStack(Items.diamond), new ItemStack(Items.skull, 1, 1), ItemApi.getItem("itemResource", 17), ItemApi.getItem("itemResource", 17)}));
    }
    
    public static void addResearchItem() 
    {
    	new ResearchItem("CULTISTSWORD", Name, (new AspectList())
    			.add(Aspect.WEAPON, 3)
    			.add(Aspect.ELDRITCH, 4), 
    			-9, -1, 0, 
    			new ItemStack(Init.cultist_sword))
    			.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.CULTISTSWORD.1"), 
    			new ResearchPage((InfusionRecipe) recipes.get("cultist_sword")) })
    			.setParents(new String[] {"ASPECTWAR"})
    			.setConcealed()
    			.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("CULTISTSWORD", 0);
        
        (new ResearchItem("CRIMSONSWORD", Name, (new AspectList())
        		.add(Aspect.WEAPON, 3)
        		.add(Aspect.ELDRITCH, 4), 
        		-9, -3, 0, 
        		new ItemStack(Init.crimson_sword)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.CRIMSONSWORD.1"), 
        		new ResearchPage((InfusionRecipe) recipes.get("crimson_sword")) })
        		.setParents(new String[] {"CULTISTSWORD", "ASPECTWAR"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("CRIMSONSWORD", 1);
        
        (new ResearchItem("CRIMSONGREATSWORD", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-11, -2, 0, 
        		new ItemStack(Init.crimson_cleaver)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.CULTISTGREATSWORD.1"), 
        		new ResearchPage((InfusionRecipe) recipes.get("crimson_cleaver")) })
        		.setParents(new String[] {"CRIMSONSWORD", "CULTISTSWORD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimson_cleaver", 2);
        
        (new ResearchItem("CRIMSONBATTLEAXE", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-11, -4, 0, 
        		new ItemStack(Init.crimson_battleaxe)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.CRIMSONBATTLEAXE.1"), 
        		new ResearchPage((InfusionRecipe) recipes.get("crimson_battleaxe")) })
        		.setParents(new String[] {"CRIMSONSWORD", "CRIMSONGREATSWORD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimson_battleaxe", 2);
        
       // getFakeResearchItem("INFERNALFURNACE", "ARTIFICE", 8,-9, new ResourceLocation("thaumcraft", "textures/misc/r_infernalfurnace.png")).registerResearchItem();
		
        
        getFakeResearchItem("CRIMSON", "BASICS",
        		-6, -2, 
        		new ItemStack(ConfigItems.itemEldritchObject, 1, 1))
        		.setStub()
        		.setHidden()
        		.setRound()
        		.setSpecial()
        		.registerResearchItem();
        
        (new ResearchItem("ASPECTWAR", Name, (new AspectList()),
        		-8, -2, 0, 
        		Aspect.WEAPON.getImage()))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.warfareattack.1")})
        		.setParents(new String[] {"CWFAKECRIMSON"})
        		.setConcealed()
        		.registerResearchItem();
        
        (new ResearchItem("ASPECTSHIELD", Name, (new AspectList()),
        		-4, -2, 0, 
        		Aspect.ARMOR.getImage()))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.warfaredefence.1")})
        		.setParents(new String[] {"CWFAKECRIMSON"})
        		.setConcealed()
        		.registerResearchItem();
        
        (new ResearchItem("CRIMSONHELM", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-3, -4, 0, 
        		new ItemStack (ConfigItems.itemHelmetCultistPlate, 0)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.cultisthelm.1"), 
        				new ResearchPage((InfusionRecipe) recipes.get("crimsonhelm")) })
        		.setParents(new String[] {"ASPECTSHIELD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimsonhelm", 2);
        
        (new ResearchItem("CRIMSONCHEST", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-3, -3, 0, 
        		new ItemStack (ConfigItems.itemChestCultistPlate, 0)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.cultistchest.1"), 
        				new ResearchPage((InfusionRecipe) recipes.get("crimsonchest")) })
        		.setParents(new String[] {"ASPECTSHIELD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimsonchest", 2);
        
        (new ResearchItem("CRIMSONLEGS", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-3, -1, 0, 
        		new ItemStack (ConfigItems.itemLegsCultistPlate, 0)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.cultistlegs.1"), 
        				new ResearchPage((InfusionRecipe) recipes.get("crimsonlegs")) })
        		.setParents(new String[] {"ASPECTSHIELD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimsonlegs", 2);
        
        (new ResearchItem("CRIMSONBOOTS", Name, (new AspectList())
        		.add(Aspect.WEAPON, 4)
        		.add(Aspect.ELDRITCH, 4)
        		.add(Aspect.AIR, 4)
        		.add(Aspect.MOTION, 4),
        		-3, 0, 0, 
        		new ItemStack (ConfigItems.itemBootsCultist, 0)))
        		.setPages(new ResearchPage[] { new ResearchPage("crimsonwarfare.research_page.cultistboots.1"), 
        				new ResearchPage((InfusionRecipe) recipes.get("crimsonboots")) })
        		.setParents(new String[] {"ASPECTSHIELD"})
        		.setConcealed()
        		.registerResearchItem();
        ThaumcraftApi.addWarpToResearch("crimsonboots", 2);
	}
      
	private static CWFakeResearch getFakeResearchItem(String original, String originalCat, int xPos, int yPos, Object icon)
	{
		CWFakeResearch item = null;
		if(icon instanceof ItemStack)
			item = new CWFakeResearch("CWFAKE"+original, Name, original, originalCat, xPos, yPos, (ItemStack)icon);
		if(icon instanceof ResourceLocation)
			item = new CWFakeResearch("CWFAKE"+original, Name, original, originalCat, xPos, yPos, (ResourceLocation) icon);
		return item;
	}
}
