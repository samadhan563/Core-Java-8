/**3. Write a FruitBasket to create basket of fruits.
(populate basket based on user choice)
Menu 
1. Add Apple
2. Add Orange
3. Add Cherry
4. Display taste of all fruits in the basket (for-each)
5. Display taste of any random fruit in the basket.
10 : Exit : terminate the application.
*/

package tester;

import java.util.Scanner;
import static utils.FruitUtils.*;

import com.app.org.DemoApple;
import com.app.org.DemoCherry;
import com.app.org.DemoFruit;
import com.app.org.DemoOrange;

public class FruitBasket {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean exit=false;
		int counter=0;
		System.out.println("Enter Capacity....");
		DemoFruit[] fruit=new DemoFruit[sc.nextInt()];
		while(!exit)
		{
			System.out.println("Choose Option::"
					+ "\n1.Add Apple."
					+ "\n2.Add Orange."
					+ "\n3.Add Cherry."
					+ "\n4.Display teste of all fruits in set"
					+ "\n5.Display taste of any random fruits in set"
					+ "\n6.Exit");
			switch (sc.nextInt()) 
			{
				case 1:
					System.out.println("Enter Apple's Name::");
					addFruit(new DemoApple(sc.next()), fruit, counter);
					counter++;
					break;
				case 2:
					System.out.println("Enter Orange Name::");
					addFruit(new DemoOrange(sc.next()), fruit, counter);
					counter++;
	
					break;
				case 3:
					System.out.println("Enter Cherry Name::");
					addFruit(new DemoCherry(sc.next()), fruit, counter);
					counter++;
	
					break;
				case 4:
					for (DemoFruit demoFruit : fruit) 
					{
						if (demoFruit != null) 
							demoFruit.teste();
					}
					break;
				case 5:
					DemoFruit demoFruit=fetchAnyFruit();
					demoFruit.teste();
					if(demoFruit instanceof DemoApple)
						((DemoApple)demoFruit).jam();
					else if(demoFruit instanceof DemoOrange)
						((DemoOrange)demoFruit).juice();
					else 
						((DemoCherry)demoFruit).squash();
					break;
				case 6:
						exit=true;
					break;
	
				default:
					break;
			}
		}
		sc.close();
	}

}
