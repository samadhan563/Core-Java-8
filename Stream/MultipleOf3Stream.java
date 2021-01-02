/*
  	3. Create stream of ints between the range supplied by user & display all multiples of 3
	(Hint : IntStream methods --range,filter,forEach)
 */
package example_intstream;

import java.util.Scanner;
import java.util.stream.IntStream;


public class MultipleOf3Stream 
{
	public static void main(String[] args) 
	{
		Scanner sc= new  Scanner(System.in);
		System.out.println("Start and end range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		IntStream.rangeClosed(start,end)
		.filter(i->(i%3)==0)
		.forEach(i->System.out.print(i+" "));
		sc.close();
	}

}
/*
 OutPut::
Start and end range
10 50
12 15 18 21 24 27 30 33 36 39 42 45 48 
*/
