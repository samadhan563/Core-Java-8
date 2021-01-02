package interface_default;

public class ImplementDefaultMeth implements InterfaceWithDefault {

	@Override
	public double calculate(double radius) 
	{
		return 3.14*radius*radius;
	}

}
