package tester;
import static utils.IOUtils.restoreStudentDetails;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

public class TestDeSerialization {

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name to restore details");	
			Map<String, Student> map=(Map<String, Student>) restoreStudentDetails(sc.next());
			System.out.println("Restored details...........");
			map.forEach((k,v)->System.out.println(v));
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
