package com.gmail.makedream29.SkaiDreamRPG.component;

import com.gmail.makedream29.SkaiDreamRPG.Named;

public interface ItemQuality extends Named
{
	public ItemQuality get(Object arg0);
	
	public String getDisplayName();
	
	public String getName();
	
	public int getQuantify();
	
	public String getColor();
}
