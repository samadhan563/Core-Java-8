package com.app.org;

public class DemoCherry extends DemoFruit
{
	@Override
	public String toString() 
	{
		
		return super.toString();
	}

	@Override
	public void teste()
	{
		System.out.println(super.getName()+" sweet n sour");
	}

	public DemoCherry(String name)
	{
		super(name);
	}
	public void squash()
	{
		System.out.println("Making squash from "+getName());
	}
}
