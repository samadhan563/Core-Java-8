package tester;

import java.util.HashMap;
import java.util.Scanner;

import student.Student;
import utils.Validation;

public class Tester {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			HashMap<Student,Student> map=Validation.populatedMap();	
			System.out.println("Display Keys: ");
			for(Student s : map.keySet())
				System.out.println(s.toStringForKeys());
			
			System.out.println("\nDisplay values Using For Each : ");
			map.values().forEach(p->System.out.println(p));
			
		}
	}
}
