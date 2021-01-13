package tester;

import static com.app.core.Category.FRUITS;
import static java.time.LocalDate.parse;
import static utils.IoUtils.populateData;

import java.io.IOException;
import java.util.Scanner;

import com.app.core.Product;

import utils.IoUtils;

import static utils.IoUtils.*;

public class ProductManagement 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Product product=new Product(100, "mango", FRUITS, parse("2019-01-01"), 500);
			//System.out.println("Enter File name::");
			//populateData(product, sc.next());
			
			System.out.println("Enter File name::");
			System.out.println(IoUtils.restoreData(sc.next()));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
