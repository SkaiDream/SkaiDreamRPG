package com.gmail.makedream29.SkaiDreamRPG.metadata;

/**
 * Equippable interface is an essential item of players that can be enabled or installed.
 * If you do not include the items listed in the interface, it must be implemented.
 */
public interface Equippable
{
	public abstract void setReinforcement(int Level);
	
	public abstract void setMaxDurability(int Durability);

	public abstract void setDurability(int Durability);
	
	public abstract void setItemType(String ItemType);
	
	public int getReinforcement();

	public int getMaxDurability();

	public int getDurability();
	
	public String getItemType();
	
	public String getDurabilityColor();
	
	public String getDurabilityColor(int Dura);
	
	public String getReinforcementColor();
}
