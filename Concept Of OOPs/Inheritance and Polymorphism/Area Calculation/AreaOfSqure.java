package switchcase.programs;

public class AreaOfSqure extends Shape 
{

	public AreaOfSqure(double sideLength, int side)
	{
		super(sideLength, side);
	}
	
	String calculateShapeArea()
	{
		return "The Area of Squre is "+(sideLength*sideLength);
	}

}
