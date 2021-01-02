package interface_default1;

public interface InterfaceWithDefault 
{
	default double area(double a)
	{
		return (a+a);
	}
	static double name(double a)
	{
		return a+a+a;
	}		
	double calculate(double radius);
	
}
