package com.tage.crimsonwarfare.items;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.enums.EnumCusAct;

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
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import thaumcraft.api.ThaumcraftApi;

public class Cultist_Sword extends ItemSword {

	public Cultist_Sword() {
		super(ThaumcraftApi.toolMatThaumium);
		this.setFull3D();
		this.setCreativeTab(MainCrimsonWarfare.CrimsonWarfare);
		this.setUnlocalizedName("cultist_sword");
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack item)
    {
		return null /*EnumAction.bow*/;
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
            System.out.println("Charging Charge!");
            _item.damageItem(1, _player);
            _world.playSoundAtEntity(_player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            
            Vec3 lookVector = _player.getLookVec();
            float force = 1.0F;
            if (_player.onGround) force *= 3.5F;
            lookVector.normalize();
            lookVector.xCoord *= force;
            lookVector.yCoord = 0;
            lookVector.zCoord *= force;
            
            _player.motionX += lookVector.xCoord;
            _player.motionY += lookVector.yCoord;
            _player.motionZ += lookVector.zCoord;
            
            _player.getEntityData().setInteger(EnumCusAct.chargeDataKey, EnumCusAct.maxChargeLength);
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
    public boolean func_150897_b(Block block)
    {
        return false;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.common;
	}
}
