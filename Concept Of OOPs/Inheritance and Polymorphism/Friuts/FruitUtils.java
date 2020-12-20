/*
2.Create FruitUtils class.
2.1 Add static method , addFruit to add a fruit to the Fruit Basket.
public static void addFruit(Fruit f,Fruit[] fruits,int counter)
{.....}



2.2 Add static method , to return any random fruit from the basket
public static Fruit fetchAnyFruit()
{
 //gen random no : range : 0 ..... counter or fruits.length
//
}
Hint : random no generator
*/
package utils;
import java.util.Random;

import com.app.org.DemoApple;
import com.app.org.DemoFruit;
public class FruitUtils 
{
	private static Random random=new Random();
	public static void addFruit(DemoFruit f, DemoFruit[] fruits,int counter)
	{
		fruits[counter]=f;
	}
	public static DemoFruit fetchAnyFruit()
	{
		switch (random.nextInt(3))
		{
			case 0:
				return new DemoApple("Apple");
				
			case 1:
				return new DemoApple("Orange");
			case 2:
				return new DemoApple("Cherry");

		default:
			return null;
		
		}
		
	}
	
}
