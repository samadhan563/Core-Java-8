package interface_default1;

public class ImplementDefaultMeth implements InterfaceWithDefault {

	@Override
	public double calculate(double radius) 
	{
		return 3.14*radius*radius;
	}
	@Override
	public double area(double a)
	{
		return a*a;
	}
}
