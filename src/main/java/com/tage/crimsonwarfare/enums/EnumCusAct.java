package com.tage.crimsonwarfare.enums;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.EnumAction;

public class EnumCusAct {
	
	public static EnumAction WHIRL;
	public static EnumAction CHARGE;
	public static EnumAction LEAP;
	
	public static final String whirlDataKey = "WhirlTime";
	public static final int maxWhirlTime = 36;
	public static final int maxWhirlTailLength = 10;
	
	public static final String chargeDataKey = "ChargeTime";
	public static final int maxChargeTime = 40;
	public static final int maxChargeLength = 10;
	
	public static final String leapDataKey = "LeapDuration";
	public static final int maxLeapTime = 40;
	public static final int maxLeapLength = 15;
	
	public static void initEnums(){
		WHIRL = EnumHelper.addAction("WHIRL");
		CHARGE = EnumHelper.addAction("CHARGE");
		LEAP = EnumHelper.addAction("LEAP");
	}
	
	public static int getMaxWhirlDamageTime()
	{
		return maxWhirlTime - maxWhirlTailLength;
	}
	
	public static int getMaxChargeLength()
	{
		return maxChargeTime - maxChargeLength;
	}
	
	public static int getMaxLeapLength()
	{
		return maxLeapTime - maxLeapLength;
	}
}

