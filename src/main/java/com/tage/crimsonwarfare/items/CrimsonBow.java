package com.tage.crimsonwarfare.items;

import com.tage.crimsonwarfare.MainCrimsonWarfare;
import com.tage.crimsonwarfare.entity.projectiles.EtherealArrow;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class CrimsonBow extends ItemBow {
	   public CrimsonBow()
	    {
	        this.maxStackSize = 1;
	        this.setMaxDamage(384);
	        this.setCreativeTab(MainCrimsonWarfare.CrimsonWarfare);
	        this.setUnlocalizedName("crimson_bow");
	    }
	   
	   @Override
	   public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack camael)
	   {
	      return false;
	   }

	   @Override
	   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	   {
	       
	       target.attackEntityFrom(DamageSource.generic, 3F);
	       stack.damageItem(1, attacker);
	       return true;
	   }
	   
	    /**
	     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	     */
	    @Override
	    public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
	    {
	        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

	        ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

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

	            EtherealArrow etherealarrow = new EtherealArrow(p_77615_2_, p_77615_3_, f * 2.0F);

	            if (f == 1.0F)
	            {
	                etherealarrow.setIsCritical(true);
	            }

	            p_77615_1_.damageItem(1, p_77615_3_);
	            p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	            if (!p_77615_2_.isRemote)
	            {
	                p_77615_2_.spawnEntityInWorld(etherealarrow);
	            }
	        }

	    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
	    {
	        return p_77654_1_;
	    }

	    /**
	     * How long it takes to use or consume an item
	     */
	    public int getMaxItemUseDuration(ItemStack p_77626_1_)
	    {
	        return 72000;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack p_77661_1_)
	    {
	        return EnumAction.bow;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	        ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (p_77659_3_.capabilities.isCreativeMode || p_77659_3_.inventory.hasItem(Items.arrow))
	        {
	            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
	        }

	        return p_77659_1_;
	    }

	    /**
	     * Return the enchantability factor of the item, most of the time is based on material.
	     */
	    public int getItemEnchantability()
	    {
	        return 1;
	    }
}
