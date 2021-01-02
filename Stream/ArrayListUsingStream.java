/*
 * 2. Create AL<Integer> , populate it.
	Convert it to seq stream & display elems
	Convert it to parallel stream & display elems
 */

package example_intstream;

import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListUsingStream 
{
	
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{
				ArrayList<Integer> list=populatedList();
				Stream<Integer> stream=null;
				System.out.println("\nOptions"
						+ "\n1.Convert it to seq stream & display elems."
						+ "\n2.Convert it to parallel stream & display elems."
						+ "\n4.exit");
				switch (sc.nextInt())
				{
					case 1:
						list.stream().forEach(i->System.out.print(i+" "));
						break;
		
					case 2:
						list.parallelStream().forEach(i->System.out.print(i+" "));							
						break;
						
					case 4:
						exit=true;							
						break;
						
					default:
					break;
				}
			}
			
		}
		
	}

	private static ArrayList<Integer> populatedList() 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(40);
		list.add(50);
		list.add(30);
		return list;
	}

}
/*
 OutPut::
 Options
1.Convert it to seq stream & display elems.
2.Convert it to parallel stream & display elems.
4.exit
1
10 20 60 40 50 30 
Options
1.Convert it to seq stream & display elems.
2.Convert it to parallel stream & display elems.
4.exit
2
40 30 50 10 60 20 
Options
1.Convert it to seq stream & display elems.
2.Convert it to parallel stream & display elems.
4.exit
4
*/
