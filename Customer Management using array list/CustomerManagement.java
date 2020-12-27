/*
Create CustomerManagement class as a Tester

2. Copy Day6 project into day8_lab  & solve this
	(You can continue with same core classes n custom exceptions. You will have to modify some validation rules & re write the tester)
	Write a tester java application for the following
	Create empty ArrayList to store customer details.
	
		2.1 Customer Registration 
		I/P : email , password , name , registration amount , dob , customer type
		In case of no dup found add , customer details
		API Hint :  contains & add
		
		2.2 Display all customer details
		for-each
		
		2.3 Fetch Customer Details
		I/P : email , dob
		Return customer details , if found , otherwise display error mesg , via custom exception & catch block
		API : indexOf , get
*/
package tester;
import static utils.CustomerValidations.valdateAllInput;
import static utils.CustomerValidations.parseDate;
import static utils.CustomerValidations.validateCustomerIndex;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import exception.CustomerHandlingException;
public class CustomerManagement 
{
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			System.out.println("Welcome.....");	
			ArrayList<Customer> customer =new ArrayList<Customer>();
					
			while(!exit)
			{	
				try 
				{
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("Choose Option.."
								+ "\n1.Customer Registration." 
								+ "\n2.Display all customer details."
								+ "\n3.Fetch Customer Details." 
								+ "\n4.Exit.");
					
						switch(sc.nextInt())
						{
							case 1: System.out.println("------------------------------------------------------------------------------------");
									System.out.println("Welcome in registration field.....");
									System.out.println("name, emailId, password, registrationAmount, birthDate, Customer type");
									customer.add(valdateAllInput(customer,sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next()));
									break;
									
							case 2: System.out.println("------------------------------------------------------------------------------------");
									System.out.println("ALL customer info .....");
									for(Customer customer2:customer)
											System.out.println(customer2);
									break;
									
									/*
									 * 2.3 Fetch Customer Details
									 * I/P : email , dob
									 * Return customer details , if found , otherwise display error mesg , via custom exception & catch block
								     * API : indexOf , get
									 */
							case 3:
									System.out.println("------------------------------------------------------------------------------------");
									System.out.println("Enter EmailId and DOB :");
									System.out.println("Customer Details.....\n"+validateCustomerIndex(customer,sc.next(), parseDate(sc.next())));
									
										/*
										 * int i=-1; Iterator<Customer> itr=customer.iterator(); while(itr.hasNext()) {
										 * Customer c=itr.next(); if(c.equals(customer3)) { i= customer.indexOf(c);
										 * flag=true; } } if ( i != -1 )
										 * System.out.println(customer.get(i).toString()+"\n found at index: "+i);
										 * if(!flag) throw new CustomerHandlingException("No Record found..");
										 */
									break;
						case 4:	
								System.out.println("------------------------------------------------------------------------------------");
								System.out.println("Terminating bye !!!!!!!!!!");
									exit=true;	
									break;
									
					} 
				}
				catch (CustomerHandlingException e) 
				{
					System.out.println(e.getMessage());
							
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

}
/*OutPut::
Welcome.....
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
rohit  rauti3@gma.com rauti123@# 25000 1992-12-10 silver
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
Samadhan samad563@g.com samadhan1@ 20000 1997-02-19 GOLD
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
vinod vinod123@.com vinod123# 500 1995-02-15 PLATINUM
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
2
------------------------------------------------------------------------------------
ALL customer info .....
Customer [name=rohit, emailId=rauti3@gma.com, registrationAmount=25000.0, customerType=SILVER, birthDate=1992-12-10]
Customer [name=Samadhan, emailId=samad563@g.com, registrationAmount=20000.0, customerType=GOLD, birthDate=1997-02-19]
Customer [name=vinod, emailId=vinod123@.com, registrationAmount=500.0, customerType=PLATINUM, birthDate=1995-02-15]
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
3
------------------------------------------------------------------------------------
Enter EmailId and DOB :
samad563@g.com 1997-02-19
Customer Details.....
Customer [name=Samadhan, emailId=samad563@g.com, registrationAmount=20000.0, customerType=GOLD, birthDate=1997-02-19]
 found at index: 1
------------------------------------------------------------------------------------
Choose Option..
1.Customer Registration.
2.Display all customer details.
3.Fetch Customer Details.
4.Exit.
4
------------------------------------------------------------------------------------
Terminating bye !!!!!!!!!!
 */
 
