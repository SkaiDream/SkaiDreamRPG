package com.gmail.makedream29.SkaiDreamRPG.component;

import com.devrean.Rcore.metadata.Named;

public interface ItemQuality extends Named
{
	public ItemQuality get(Object arg0);

	@Override
	public String getName();

	@Override
	public String getDisplayName();
	
	public int getQuantify();
	
	public String getColor();
}
