package com.app.org;

public class DemoOrange extends DemoFruit
{
	public DemoOrange(String name) 
	{
		super(name);	
	}
	@Override
	public String toString() 
	{
		return super.toString();
	}

	@Override
	public void teste() 
	{
		System.out.println(getName()+" is Sour in taste");
	}
	public void juice() 
	{
		System.out.println("Extracting  juice  from " + getName());
	}
}
