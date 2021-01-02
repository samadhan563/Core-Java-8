package interface_default;

public interface InterfaceWithDefault 
{
	default double area(double a)
	{
		return (a+a);
	}

	double calculate(double radius);
	
}
