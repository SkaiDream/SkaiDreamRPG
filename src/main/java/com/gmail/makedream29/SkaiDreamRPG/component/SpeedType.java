package com.gmail.makedream29.SkaiDreamRPG.component;

import com.gmail.makedream29.SkaiDreamRPG.Named;

public interface SpeedType extends Named
{
	public SpeedType get(Object obj);
	
	public String getName();
	
	public String getDisplayName();
	
	public double getProportion();
	
	public String getColor();
}
