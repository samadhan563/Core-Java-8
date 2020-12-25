package list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListIntegr 
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			//declared and initialized the collection with default capacity and default size=-1
			ArrayList<Integer> aList=new ArrayList<>();
			//input array size from user
			System.out.println("Enter array size :: ");
			int arr[]=new int[sc.nextInt()];
			//Accept element from user in array
			System.out.println("Enter "+arr.length+" array elements:: ");
			for (int i=0;i<arr.length;i++) 
				arr[i]=sc.nextInt();
				
			//Add array element  into collection
			for(int num : arr)
				aList.add(Integer.valueOf(num));//autoBoxing performed by compiler
			
			//display array list using toString method
			System.out.println(aList);
			
			//print element of index
			System.out.println("Enter index to get elements  ");
			System.out.println( Integer.valueOf(aList.get(sc.nextInt())));
			//show the index element
			System.out.println("Enter element to check index ");
			System.out.println(aList.indexOf(sc.nextInt()));	
			
			//checking element contains in array list or not
			System.out.println("Enter element to search ");
			System.out.println((aList.contains(sc.nextInt()))?"Found ":"Not Found");
			
			//print collection using iterator method
			Iterator<Integer> itr=aList.iterator();
			System.out.println("Collection elements using iterator :: ");
			while(itr.hasNext())
				System.out.print((itr.next())+" ");
			
			//reverse collection using listIterator
			ListIterator<Integer> litr=aList.listIterator(aList.size());
			System.out.println("\nCollection elements using LisIiterator :: ");
			while(litr.hasPrevious())
				System.out.print(litr.previous()+" ");
 			
			//System.out.println("Sorted array list: "+aList.sort());
			
			//check is array list is empty
			System.out.println("\n"+((aList.isEmpty())?"Array list is empty":"Array list having some elements."));
			
			//getting last index of element
			System.out.println("Enter element for finding last index.");
			System.out.println("Last index is "+aList.lastIndexOf(sc.nextInt()));
			
			//replace element entered by user
			System.out.println("Enter index and element for replacing.");
			System.out.println("replaced "+aList.set(sc.nextInt(),sc.nextInt()));
			
			//remove element entered by user
			System.out.println("Enter index of element for remove.");
			System.out.println("removed "+aList.remove(sc.nextInt()));
			
			//remove element of entered index by user
			System.out.println("Enter element for remove.");
			System.out.println("removed "+aList.remove((Integer)sc.nextInt()));
			
			//clone array list into another list
			@SuppressWarnings("unchecked")
			ArrayList<Integer> list=(ArrayList<Integer>) aList.clone();
			System.out.println("\nList after clone "+list);//displaying list using toString which are clone(duplicate the object)		
		}
	}
}
/*OUTPUT::
	Enter array size :: 
	10
	Enter 10 array elements:: 
	20 10 30 40 50 20 10 30 50 60
	[20, 10, 30, 40, 50, 20, 10, 30, 50, 60]
	Enter index to get elements  
	2
	30
	Enter element to check index 
	30
	2
	Enter element to search 
	50
	Found 
	Collection elements using iterator :: 
	20 10 30 40 50 20 10 30 50 60 
	Collection elements using LisIiterator :: 
	60 50 30 10 20 50 40 30 10 20 
	Array list having some elements.
	Enter element for finding last index.
	50
	Last index is 8
	Enter index and element for replacing.
	7 80
	replaced 30
	Enter index of element for remove.
	1
	removed 10
	Enter element for remove.
	50
	removed true
	
	List after clone [20, 30, 40, 20, 10, 80, 50, 60]
*/
