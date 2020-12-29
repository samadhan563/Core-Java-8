package collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.set.linkedhashset.Employee;

public class DemoCollection23 {

	public static void main(String[] args)
	{
		HashSet<Employee> lhs=new HashSet<Employee>();
		lhs.add(new Employee(101, "Samadhan"));
		lhs.add(new Employee(102, "Rohit"));
		lhs.add(new Employee(103, "Vinod"));
		
		Iterator<Employee> itr=lhs.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.id==103)
				itr.remove();			
		}
		for(Employee e: lhs)
			System.out.println(e.id+"   "+e.name);
	}

}
