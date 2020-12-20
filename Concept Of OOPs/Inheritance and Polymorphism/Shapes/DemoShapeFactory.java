/*	5. Create a ShapeFactory class 
		Add a static method(generateShape)  to return randomly generated shape.
		Hint : random no generator
*/
package randomgenrator;

import java.util.Random;
import java.util.Scanner;

import area.DemoCircle;
import area.DemoRectangle;
import area.DemoShape;
import area.DemoSqure;

public class DemoShapeFactory 
{
	//static Scanner sc=new Scanner(System.in);
	static Random random=new Random();
	public static void addShape(DemoShape demoShape,DemoShape[] demoShapes,int counter)
	{
		demoShapes[counter]=demoShape;
	}
	public static DemoShape genrateShape()
	{
		switch (random.nextInt(3)) {
		case 0:
				return new DemoCircle(random.nextInt(20),random.nextInt(20),1+(100-1)*random.nextDouble()) ;
		
		case 1:
			return new DemoRectangle(random.nextInt(20),random.nextInt(20),1+(100-1)*random.nextDouble(),1+(100-1)*random.nextDouble());
	
		case 2:
			return new DemoSqure(random.nextInt(20), random.nextInt(20), random.nextInt(100));
		

		default:
			return null;
		
		}

	}
	
}
