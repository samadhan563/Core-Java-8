/*
 	5.Create IntStream having ints in the range of 10...50
	& Print its sum.(specialized reduction operation)
	Hint( rangeClosed , sum)
	
		
	6.Print avg of 10-50 numbers(if strm is empty print -100 or else print avg)
	(rangeClosed,average & optional)
	
	7.Print avg of square of odd nums between 10 & 50 
	(filter,map,reduce)
	
 */

package example_intstream;

import java.util.stream.IntStream;

public class IntStreamFor10_50Range 
{

	public static void main(String[] args) 
	{
		System.out.println("Sum of 10 to 50 : "+IntStream.rangeClosed(10,50).sum());
	
		System.out.println("Avg of 10 to 50 : "+IntStream.rangeClosed(10,50)
														.average()
														.orElse(-100));
	
		System.out.println("Avg of square of odd nums of 10 to 50 : "+IntStream.rangeClosed(10,50)
																				.filter(i->i%2!=0)
																				.map(i->i*i)
																				.average());
	}
}
/*
Output:
Sum of 10 to 50 : 1230
Avg of 10 to 50 : 30.0
Avg of square of odd nums of 10 to 50 : OptionalDouble[1033.0]
*/