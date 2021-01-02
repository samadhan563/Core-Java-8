/*
 	4. Display all product names of a particular category , exceeding specific price.
	I/P category name & price.
	(stream,filter,forEach)
 */
package example_intstream;

import java.util.ArrayList;
import java.util.Scanner;

import product.Product;
public class StreamForProduct 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> products=populatedProduct(); 
		System.out.println(" Enter cat name&price ");
		String name=sc.next();
		double price=sc.nextDouble();
		
		products.stream()
		.filter(p->p.getProductCategory().equals(name) && p.getProductPrice()==price)
		.forEach(p->System.out.println("Product Name : "+p.getProductName()));
		sc.close();
	}

	private static ArrayList<Product> populatedProduct() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(101, "Pen", "Natraj", 25.20));
		products.add(new Product(102, "Paper", "Classmate", 30.20));
		products.add(new Product(103, "Pencil", "Satctionary", 250.20));
		products.add(new Product(104, "Book", "Classmate", 225.20));
		products.add(new Product(105, "Eraser", "Platinum", 35.20));
		return products;
	}

}

/* Output::
Enter cat name&price 
Classmate 30.20
Product Name : Paper
*/
