/*6. Create a Tester . Invoke ShapeFactory's generateShape() method , in a for-loop (5 times)
		to display details & area of each shape.
*/
package tester;

import area.DemoShape;
import static randomgenrator.DemoShapeFactory.*;
public class DemoAreaTest {
	public static void main(String[] args)
	{
		DemoShape[] demoShapes = new DemoShape[5];
		for (DemoShape demoShape : demoShapes)
		{
			demoShape = genrateShape();
			System.out.println(demoShape.toString());
		}
		
	}
}
/**Output**
DemoCircle [DemoShape [x=9.0, y=2.0] radius=24.004207034158668 Area=1809.2741397636828]
DemoSqure [DemoShape [x=7.0, y=9.0], side=11, area of Squre=121.0]
DemoSqure [DemoShape [x=13.0, y=5.0], side=93, area of Squre=8649.0]
DemoRectangle [DemoShape [x=18.0, y=8.0]width=13.289888599484145, height=23.48370016400414, Area Rectangle=312.0957590833026]
DemoSqure [DemoShape [x=6.0, y=3.0], side=80, area of Squre=6400.0]
*/