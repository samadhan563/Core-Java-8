/*3. Solve assignment (to understand abstraction)
		1. Create abstract class Shape --state :  x,y 
		Abstract Method --public double area();
		public String toString() : to ret x & y
		
		Why will area() be abstract in Shape class ?????????
			-->no implementation only declaration.
		
		2. Circle -- x,y,radius
		Concrete overriding Method --public double area() : ret area of circle
		public String toString() : ret x, y & radius
		
		3. Rectangle -- x,y,w,h
		Concrete overriding Method --public double area() : ret area of rectangle
		public String toString() : ret x, y , width & height
		
		4. Square-- x,y,side
		Concrete overriding Method --public double area() : ret area of square
		public String toString() : ret x, y , side
		
		
		
		5. Create a ShapeFactory class 
		Add a static method(generateShape)  to return randomly generated shape.
		Hint : random no generator
		
		6. Create a Tester . Invoke ShapeFactory's generateShape() method , in a for-loop (5 times)
		to display details & area of each shape.

*/

package area;

public abstract class DemoShape 
{
	private double x,y;

	public DemoShape(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}
	abstract double area();
	@Override
	public String toString() 
	{
		return "DemoShape [x=" + x + ", y=" + y + "]";
	}
	
}
