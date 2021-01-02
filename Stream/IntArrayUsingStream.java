/*
	2. Solve : Using latest Java 8 API
	1.Create int[] ---> IntStream & display its contents.
	2. Create AL<Integer> , populate it.
	Convert it to seq stream & display elems
	Convert it to parallel stream & display elems
	
	3. Create stream of ints between the range supplied by user & display all multiples of 3
	(Hint : IntStream methods --range,filter,forEach)
	
	4. Display all product names of a particular category , exceeding specific price.
	I/P category name & price.
	(stream,filter,forEach)
	
	5.Create IntStream having ints in the range of 10...50
	& Print its sum.(specialized reduction operation)
	Hint( rangeClosed , sum)
	
	6.Print avg of 10-50 numbers(if strm is empty print -100 or else print avg)
	(rangeClosed,average & optional)
	
	7.Print avg of square of odd nums between 10 & 50 
	(filter,map,reduce)
*/

/*
 	2. Solve : Using latest Java 8 API
	1.Create int[] ---> IntStream & display its contents.
 */
package example_intstream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IntArrayUsingStream 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter array size and element ");
			int[] arr=new int[sc.nextInt()];
			System.out.println("Enter "+ arr.length+" array element ::");
			for (int i = 0; i < arr.length; i++) 
				arr[i]=sc.nextInt();
			System.out.println("Array elements : "+Arrays.toString(arr));
			System.out.print("Stream of Array elements : ");
			IntStream ints=Arrays.stream(arr);
			ints.forEach(i->System.out.print(i+" "));
		}
	}
}
/*
 * Output::
Enter array size and element 
10
Enter 10 array element ::
80 90 70 20 30 10 60 50 40 100 
Array elements : [80, 90, 70, 20, 30, 10, 60, 50, 40, 100]
Stream of Array elements : 80 90 70 20 30 10 60 50 40 100 
*/
