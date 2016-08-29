package com.gmail.makedream29.SkaiDreamRPG.Inventory;

import java.util.Collection;

import org.bukkit.inventory.Inventory;

public abstract interface RPGInventory extends RPGExtraInventory
{
	public abstract Inventory getInventoryType(boolean arg0);
	
	public abstract Collection<RPGItem> getAllItem();
	
	public abstract RPGInventory getInventory();
	
	public abstract RPGInventory getInventory(Object arg0);
	
	public abstract RPGExtraInventory getExtraInventory();
	
	public abstract RPGInventory getAccessoryInventory(Object arg0);
	
	public abstract void setInventory(RPGInventory arg0);
	
	public abstract void setExtraInventory(RPGExtraInventory arg0);
}
