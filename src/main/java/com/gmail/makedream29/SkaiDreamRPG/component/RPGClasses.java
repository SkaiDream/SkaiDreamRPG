package com.gmail.makedream29.SkaiDreamRPG.component;

import com.devrean.Rcore.metadata.Named;

public interface RPGClasses extends Named
{	
	@Override
	public String getName();

	@Override
	public String getDisplayName();
	
	public int getQuantify();
}
