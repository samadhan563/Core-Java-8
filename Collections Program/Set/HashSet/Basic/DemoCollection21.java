package collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DemoCollection21 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Samadhan");
		hs.add("Rohit");
		hs.add("Vinod");
		hs.add("Samadhan");
		hs.add("Arjun");
		hs.add("Durgesh");
		System.out.println(hs);
		System.out.println();
		System.out.println(hs.add("Mahesh"));
		System.out.println(hs.add("Mahesh"));
		System.out.println();
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
	}

}
