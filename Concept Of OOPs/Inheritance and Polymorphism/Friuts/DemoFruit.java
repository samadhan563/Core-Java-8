/*Example of Inheritanace hierarchy n method overriding

1. Fruit,Apple,Orange,Cherry
Fruit HAS-A name
parametrized constr
Add taste() method to display its taste.
Fruit : has no specific taste
Apple : sweet in taste
Orange : Sour in taste
Cherry : sweet n sour



3. Write a FruitBasket to create basket of fruits.
(populate basket based on user choice)
Menu 
1. Add Apple
2. Add Orange
3. Add Cherry
4. Display taste of all fruits in the basket (for-each)
5. Display taste of any random fruit in the basket.
10 : Exit : terminate the application.


Objective : Can you add new functionality specific to the subclasses  of Fruit?
eg : 
Apple : make jam 

Orange : squeeze juice

Cherry : make squash

Set up Simple example , to test newly added functionality (simple tester)

Any problems ? 
Run time error : java.lang.ClassCastException
Trigger : invalid casting (eg : in trying to cast Apple ---> Cherry)


Solutions ? 
1. instanceof : keyword (refer to readme)
2. reflection

Apply : 
Add New option 6
Choose any random fruit from the basket & invoke it's specifically added finctionality

*/

/** 1. Fruit,Apple,Orange,Cherry
Fruit HAS-A name
parametrized constr
Add taste() method to display its taste.
Fruit : has no specific taste
Apple : sweet in taste
Orange : Sour in taste
Cherry : sweet n sour
*/
package com.app.org;

public class DemoFruit
{
	private String name;
	public DemoFruit(String name) 
	{
		super();
		this.name = name;
	}
	public String toString()
	{
		return "DemoFruit [name=" + name + "]";
	}
	public void teste() 
	{
		System.out.println("Unkown teste");
	}

	public String getName() {
		return name;
	}
}
