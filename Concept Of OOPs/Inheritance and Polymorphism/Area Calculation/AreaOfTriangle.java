package switchcase.programs;

public class AreaOfTriangle extends Shape 
{

	public AreaOfTriangle(double sideLength, int side)
	{
		super(sideLength, side);
	}
	
	String calculateShapeArea()
	{
		double sides=(side*sideLength)/2;
		return "The Area of Triangle is "+Math.sqrt(sides*(sides-sideLength)*(sides-sideLength)*(sides-sideLength));
	}

}
