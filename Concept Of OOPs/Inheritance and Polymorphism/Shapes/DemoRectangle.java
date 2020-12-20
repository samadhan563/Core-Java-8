/*3. Rectangle -- x,y,w,h
		Concrete overriding Method --public double area() : ret area of rectangle
		public String toString() : ret x, y , width & height
*/
package area;

public class DemoRectangle extends DemoShape
{
	private double width,height; 
	public DemoRectangle(double x, double y, double width, double height) 
	{
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() 
	{
		return width*height;
	}
	@Override
	public String toString()
	{
		return "DemoRectangle [" +super.toString()+"width=" + width + ", height=" + height +", Area Rectangle="+area()+"]";
	}
	

}
