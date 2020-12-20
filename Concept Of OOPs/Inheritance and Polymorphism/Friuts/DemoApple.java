package com.app.org;

public class DemoApple extends DemoFruit 
{
	public DemoApple(String name) 
	{
		super(name);
	}
	public String toString()
	{
		return super.toString();
	}

	public void teste() 
	{
		System.out.println(getName()+ " is sweet in taste");
	}
	public void jam()
	{
		System.out.println("Making jam from "+getName());
	}
}
