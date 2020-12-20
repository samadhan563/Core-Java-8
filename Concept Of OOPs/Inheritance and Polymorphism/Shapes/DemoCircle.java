/* 2.Circle -- x,y,radius
		Concrete overriding Method --public double area() : ret area of circle
		public String toString() : ret x, y & radius*/
package area;

public class DemoCircle extends DemoShape 
{
	
	private double radius;
	public DemoCircle(double x, double y, double radius) 
	{
		super(x, y);
		this.radius = radius;
	}
	@Override
	public double area()
	{
		return 3.14*radius*radius;
		//return super.toString()+radius;
	}
	@Override
	public String toString() {
		return "DemoCircle [" +super.toString()+" radius=" + radius +" Area="+this.area()+"]";
	}

}
