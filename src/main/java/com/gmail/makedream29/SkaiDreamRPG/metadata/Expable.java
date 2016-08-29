package com.gmail.makedream29.SkaiDreamRPG.metadata;

/**
 * 
 * Expable is an interface that is implemented in all RPGCustomObject with the method or you can get the experience.
 * @author makedream29
 *
 */
public abstract interface Expable
{
	/**
	 * <code>setExperience()</code> is used differently depending on the type of Entity:<br></br>
	 * 1. If the Human Entity Type monsters, you set a number of experience points you get killed this monster <br>
	 * 2. If the type of player, set the player's experience.<br><br>
	 * 
	 * through using the method {@link #getExperience()},
	 * You can get an amount of experience you get when killing the monster or having the player experience.
	 * 
	 * @param arg0 The amount of experience points
	 * @return 
	 * @see #getExperience()
	 */
	public abstract boolean setExperience(double arg0);
	
	/**
	 * It returns a number of experience points. See the {@link #setExperience(double)} for more information.
	 * @return return the experience points if existing, otherwise <code>0.0D</code>.
	 * @see #setExperience(double)
	 */
	public abstract double getExperience();
}
