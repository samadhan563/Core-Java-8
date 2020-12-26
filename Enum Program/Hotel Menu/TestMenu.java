package enummenu;

import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double totalBill=0;
		try
		{
			while(true)
			{
				System.out.println("Menu");
				for(Menu m: Menu.values())
					System.out.println(" "+m);
				System.out.println("Enter menu and qty or quitfor exit :");
				Menu m=Menu.valueOf(sc.next().toUpperCase());
				totalBill+=(m.getPrice()*sc.nextInt());
			}
		}
		catch (IllegalArgumentException e) 
		{
			System.out.println("Not avialble \n Your Bill ::"+totalBill);
		}
	}

}
