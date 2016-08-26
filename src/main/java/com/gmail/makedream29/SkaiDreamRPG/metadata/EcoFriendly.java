package com.gmail.makedream29.SkaiDreamRPG.metadata;

import com.gmail.makedream29.SkaiDreamRPG.component.NatureProperty;

public abstract interface EcoFriendly
{
	public abstract void setWaterAffinity(double arg0);
	
	public abstract void setFireAffinity(double arg0);
	
	public abstract void setWindAffinity(double arg0);
	
	public abstract void setEarthAffinity(double arg0);
	
	public abstract void setLightAffinity(double arg0);
	
	public abstract void setDarkAffinity(double arg0);
	
	public abstract void setNatureProperty(NatureProperty arg0);
	
	public abstract double getWaterAffinity();
	
	public abstract double getFireAffinity();
	
	public abstract double getWindAffinity();

	public abstract double getEarthAffinity();

	public abstract double getLightAffinity();
	
	public abstract double getDarkAffinity();
	
	public abstract NatureProperty getNatureProperty();
}
