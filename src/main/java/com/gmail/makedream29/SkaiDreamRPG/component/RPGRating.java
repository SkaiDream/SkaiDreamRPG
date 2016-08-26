package com.gmail.makedream29.SkaiDreamRPG.component;

import com.devrean.Rcore.metadata.Named;

public interface RPGRating extends Named
{
	public RPGRating get(Object obj);
	
	@Override
	public String getName();

	@Override
	public String getDisplayName();

	public double getProportion();
	
	public String getColor();
}
