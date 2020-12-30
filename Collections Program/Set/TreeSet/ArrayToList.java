package array_to_list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayToList 
{
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter array size..");
			String[] arr=new String[sc.nextInt()];
			System.out.println("Enter "+arr.length+" string array element ");
			for (int i = 0; i < arr.length; i++) 
				arr[i]=sc.next();
			List<String> list= Arrays.asList(arr);
			System.out.println("List: "+list);
			
			HashSet<String> hashSet=new HashSet<String>(list);
			System.out.println("Hash Set: "+hashSet);
			
			LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>(list);
			System.out.println("Linked Hash Set: "+linkedHashSet);
			
			TreeSet<String> treeSet=new TreeSet<String>(list);
			System.out.println("Tree Set: "+treeSet);
		}
	}
}
/*
	Enter array size..
	8
	Enter 8 string array element 
	gggg aaaaa ddddd wwwww mmmm bbbbb hhhhh ddddd
	List: [gggg, aaaaa, ddddd, wwwww, mmmm, bbbbb, hhhhh, ddddd]
	Hash Set: [gggg, bbbbb, hhhhh, wwwww, mmmm, ddddd, aaaaa]
	Linked Hash Set: [gggg, aaaaa, ddddd, wwwww, mmmm, bbbbb, hhhhh]
	Tree Set: [aaaaa, bbbbb, ddddd, gggg, hhhhh, mmmm, wwwww]
*/