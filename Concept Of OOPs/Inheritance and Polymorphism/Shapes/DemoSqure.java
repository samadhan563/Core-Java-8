package area;

public class DemoSqure extends DemoShape 
{
	private int side;
	public DemoSqure(double x, double y, int side)
	{
		super(x, y);
		this.side = side;
	}
	@Override
	double area() 
	{
		return side*side;
	}
	@Override
	public String toString() {
		return "DemoSqure ["+super.toString() +", side=" + side + ", area of Squre=" + area() +"]";
	}
	

}
