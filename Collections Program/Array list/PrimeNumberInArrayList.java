//Program to separate the prime and non prime numbers from integer array list 
/*
package list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberInArrayList 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			ArrayList<Integer> list=new ArrayList<>();
			ArrayList<Integer> plist=new ArrayList<>();
			ArrayList<Integer> nlist=new ArrayList<>();
			System.out.println("Enter how many number do  u want to add.");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" many number");
			for (int i = 0; i < n; i++) 
				list.add(sc.nextInt());
			for (int i = 0; i < list.size(); i++) 
			{
				int count=0;
				for (int j = 1; j <= list.get(i); j++) 
				{
						if(list.get(i)%j==0)
							count++;
				}
				if(count==2)
					plist.add(list.get(i));
				else
					nlist.add(list.get(i));	
			}
			System.out.println(plist+ " \n"+ nlist);
		}
	}
}
*/
package list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberInArrayList 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			ArrayList<Integer> list=new ArrayList<>();
			ArrayList<Integer> plist=new ArrayList<>();
			ArrayList<Integer> nlist=new ArrayList<>();
			System.out.println("Enter how many number do  u want to add.");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" many number");
			for (int i = 0; i < n; i++) 
				list.add(sc.nextInt());
			System.out.println("Original array list: "+ list);
			for (int i = 0; i < list.size(); i++) 
			{
				if(isPrime(list.get(i)))
					plist.add(list.get(i));
				else
					nlist.add(list.get(i));
			}
			System.out.println("Prime array list: "+plist+ "\nNon Prime array list: "+ nlist);
		}
	}
	public static boolean isPrime(int num)
	{
		int count=0;
		for (int j = 1; j <= num; j++) 
		{
				if(num%j==0)
					count++;
		}
		if(count==2)
			return true;
		else
			return false;	
	}
}
/*Output::
 * Enter how many number do  u want to add.
10
Enter 10 many number
20
30
54
56
42
17
18
19
51
42
Original array list: [20, 30, 54, 56, 42, 17, 18, 19, 51, 42]
Prime array list: [17, 19]
Non Prime array list: [20, 30, 54, 56, 42, 18, 51, 42]
*/
