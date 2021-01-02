package example_intstream;

import java.util.stream.IntStream;

public class IntStreamExample 
{
	public static void main(String[] args) 
	{
		IntStream.range(1, 101).filter(i->i%2==0).forEach(i->System.out.println(i+" "));
		System.out.println(IntStream.range(1,101).filter(i->i%2!=0).sum());
	}

}
