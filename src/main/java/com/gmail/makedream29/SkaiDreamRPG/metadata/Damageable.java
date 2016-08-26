package com.gmail.makedream29.SkaiDreamRPG.metadata;

/**
 * Damageable are included physical Skill, weapon swing damage, throwable items, 
 * debuff damage from a food, Magical Skill, debuff from a harmful portion, and etc.
 * If you do not include the items listed in the interface, it must be implemented.
 */
public interface Damageable
{
	public abstract void setPhysicalDamage(double damage);

	public abstract void setMagicalDamage(double damage);
	
	public String getPhysicalDamageOutput();

	public String getMagicalDamageOutput();

	public double getPhysicalDamage();

	public double getMagicalDamage();
	
	/**
	 * Plus reinforcement damage, Extra damage, and physical damage, then returns the value rounded.
	 * @return the total damage
	 */
	public int getTotalPhysicalDamage();
	
	/**
	 * Plus reinforcement damage, Extra damage, and magical damage, then returns the value rounded.
	 * @return the total damage
	 */
	public int getTotalMagicalDamage();
}
