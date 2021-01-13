package tester;

import java.io.IOException;
import java.util.Scanner;

import utils.IOUtils;
import utils.StudentCollectionUtils;

public class TestSerialization 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the file name ");
			IOUtils.studentDetails(StudentCollectionUtils.populateMap(StudentCollectionUtils.populateList()),sc.next());
			System.out.println("Serialization done");
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
