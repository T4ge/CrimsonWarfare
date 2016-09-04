package com.tage.crimsonwarfare.items;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.enums.EnumCusAct;
import com.tage.crimsonwarfare.init.Init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import thaumcraft.api.ThaumcraftApi;

public class CrimsonGreatSword extends ItemSword {

public CrimsonGreatSword() {
	super(Init.CWVOID);
	this.setFull3D();
	this.setCreativeTab(MainCrimsonWarfare.CrimsonWarfare);
	this.setUnlocalizedName("crimson_cleaver");
}

@Override
public EnumAction getItemUseAction(ItemStack p_77661_1_)
{
	return null/*EnumAction.bow*/;
}

@Override
public boolean func_150897_b(Block block)
{
    return false;
}

@Override
@SideOnly(Side.CLIENT)
public EnumRarity getRarity(ItemStack item){
	return EnumRarity.common;
}

 public void onPlayerStoppedUsing(ItemStack _item, World _world, EntityPlayer _player, int _duration)
    {
        int j = this.getMaxItemUseDuration(_item) - _duration;

        if (true)
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }
            
            if (f != 1.0F)
            {
                return;
            }

            _item.damageItem(1, _player);
            _world.playSoundAtEntity(_player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            
            _player.getEntityData().setInteger(EnumCusAct.whirlDataKey, EnumCusAct.maxWhirlTime);
            
        }
    }
 
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
        return item;
    }
    
    public int getMaxItemUseDuration(ItemStack item)
    {
        return 72000;
    }
    
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        ArrowNockEvent event = new ArrowNockEvent(player, item);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return event.result;
        }
        player.setItemInUse(item, this.getMaxItemUseDuration(item));
        return item;
    }
    
    @Override
    public void onUpdate (ItemStack stack, World world, Entity entity, int par4, boolean par5)
    {
        super.onUpdate(stack, world, entity, par4, par5);
        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == stack)
            {
                player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2, 2, true));
            }
        }
    }
}
