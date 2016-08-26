package com.gmail.makedream29.SkaiDreamRPG.Inventory;

import com.gmail.makedream29.RPGCustomAPI.item.RPGItem;

public abstract interface RPGExtraInventory
{
	public abstract void setLeftRing(RPGItem arg0);
	
	public abstract void setRightRing(RPGItem arg0);
	
	public abstract void setLeftGlove(RPGItem arg0);
	
	public abstract void setRightGlove(RPGItem arg0);
	
	public abstract void setNecklace(RPGItem arg0);
	
	public abstract void setAssistantStone(RPGItem arg0);
	
	public abstract RPGItem getLeftRing();
	
	public abstract RPGItem getRightRing();
	
	public abstract RPGItem getLeftGlove();
	
	public abstract RPGItem getRightGlove();
	
	public abstract RPGItem getNecklace();
	
	public abstract RPGItem getAssistantStone();
}
