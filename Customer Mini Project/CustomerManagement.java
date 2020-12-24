/*
Create CustomerManagement class as a Tester
Create suitable array to store customer details.
Options
1. Register Customer 
I/Ps : email , password , name , registration amount , birth date 
In case of successful registration (i.e no validation errs) , store customer details.
Otherwise , raise custom exc , show error message to the client.


2. Display all customers , born in supplied date range
I/P : begin date & end date

3. Change Phone no
I/P : email, dob , password , new phone no.
In case of success , show a mesg or supply error message via customer exception(in catch block)

4. Display all customer details

5. Un subscribe customer
I/P : email, dob
In case of success , show a success un subscription mesg or supply error message via custom exception(in catch block)

*/
package tester;
import static utils.CustomerValidations.valdateAllInput;
import static utils.CustomerValidations.parseDate;

import java.awt.dnd.Autoscroll;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

import customer.Customer;
import exception.CustomerHandlingException;
public class CustomerManagement 
{
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			int counter=0;
			boolean exit=false;
			System.out.println("Welcome.....");	
			System.out.println("Enter customer range...");
			Customer[] customer=new Customer[sc.nextInt()];
					
			while(!exit)
			{	
				try 
				{
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("Choose Option.."
								+ "\n1.Register New Customer." 
								+ "\n2.Display all customer details DOB in  ."
								+ "\n3.Change Password." 
								+ "\n4.Display all customer details."
								+ "\n5.Un subscribe customer." 
								+ "\n6.Exit.");
					
						switch(sc.nextInt())
						{
							case 1: System.out.println("------------------------------------------------------------------------------------");
									System.out.println("Welcome in registration field.....");
									if(counter<customer.length)
									{
										System.out.println("name, emailId, password, registrationAmount, birthDate, Customer type");
										customer[counter++]=valdateAllInput(customer,sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
									}
									else 
										System.out.println("Sorry customer out of limit...");
									break;
									
							case 2: System.out.println("------------------------------------------------------------------------------------");
									System.out.println("ALL customer info .....");
									System.out.println("Enter begin date and end date of DOB for show record......");
									LocalDate beginDate=parseDate(sc.next());
									LocalDate endDate=parseDate(sc.next());
									for(Customer customer2:customer)
									{
										if(customer2!=null && customer2.getBirthDate().isAfter(beginDate) && customer2.getBirthDate().isBefore(endDate))
											System.out.println(customer2.toString());
									}
									break;
									
							case 3:	System.out.println("------------------------------------------------------------------------------------");	
									System.out.println("Change password.....");	
									System.out.println("Enter EmailId and DOB :");
									Customer customer3=new Customer(sc.next(), parseDate(sc.next()));
									for (Customer customer2 : customer)
									{
										if(customer2 !=null &&  customer2.equals(customer3))
										{
											System.out.println("Enter new Password....");
											customer2.setPassword(sc.next());
										
										}
									}
									break;
									
							case 4: System.out.println("------------------------------------------------------------------------------------");
									System.out.println("Customer Details.....");
									for(Customer customer2:customer)
									{
										if(customer2!=null)
											System.out.println(customer2.toString());
									}
									break;	
									
									/*
									 * 5. Un subscribe customer I/P : email, dob 
									 * In case of success , show a success un subscription mesg or supply error message via custom exception(in catch block)
									 */
							case 5:	System.out.println("------------------------------------------------------------------------------------");
									System.out.println("Un subscribe customer.");
									System.out.println("Enter EmailId and DOB :");
									Customer customer31=new Customer(sc.next(), parseDate(sc.next()));
									for (int i = 0; i < customer.length; i++) 
									{
										if(customer[i] != null && customer31.equals(customer[i]))
										{
											System.out.println("Customer Un subscribed \n" +customer[i]);
											customer[i]=null;
										}
									}
									break;
									
							case 6:	
								System.out.println("------------------------------------------------------------------------------------");System.out.println("Terminating bye !!!!!!!!!!");
									exit=true;	
									break;
									
					} 
				}
				catch (CustomerHandlingException e) 
				{
					e.printStackTrace();
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

}
/*
Welcome.....
Enter customer range...
5
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
rohit  rauti3@gma.com rauti123@# 25000 1992-12-10 silver
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
Samadhan samad563@g.com samadhan1@ 20000 1997-02-19 GOLD
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
1
------------------------------------------------------------------------------------
Welcome in registration field.....
name, emailId, password, registrationAmount, birthDate, Customer type
vinod vinod123@.com vinod123# 500 1995-02-15 PLATINUM
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
4
------------------------------------------------------------------------------------
Customer Details.....
Customer [name=rohit, emailId=rauti3@gma.com, registrationAmount=25000.0, customerType=SILVER, birthDate=1992-12-10]
Customer [name=Samadhan, emailId=samad563@g.com, registrationAmount=20000.0, customerType=GOLD, birthDate=1997-02-19]
Customer [name=vinod, emailId=vinod123@.com, registrationAmount=500.0, customerType=PLATINUM, birthDate=1995-02-15]
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
3
------------------------------------------------------------------------------------
Change password.....
Enter EmailId and DOB :
1980-12-12
1996-12-12
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
2
------------------------------------------------------------------------------------
ALL customer info .....
Enter begin date and end date of DOB for show record......
1980-12-12
1996-12-12
Customer [name=rohit, emailId=rauti3@gma.com, registrationAmount=25000.0, customerType=SILVER, birthDate=1992-12-10]
Customer [name=vinod, emailId=vinod123@.com, registrationAmount=500.0, customerType=PLATINUM, birthDate=1995-02-15]
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
3
------------------------------------------------------------------------------------
Change password.....
Enter EmailId and DOB :
rauti3@gma.com
1992-12-10
Enter new Password....
12345
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
5
------------------------------------------------------------------------------------
Un subscribe customer.
Enter EmailId and DOB :
rauti3@gma.com
1992-12-10
Customer Un subscribed 
Customer [name=rohit, emailId=rauti3@gma.com, registrationAmount=25000.0, customerType=SILVER, birthDate=1992-12-10]
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.

4
------------------------------------------------------------------------------------
Customer Details.....
Customer [name=Samadhan, emailId=samad563@g.com, registrationAmount=20000.0, customerType=GOLD, birthDate=1997-02-19]
Customer [name=vinod, emailId=vinod123@.com, registrationAmount=500.0, customerType=PLATINUM, birthDate=1995-02-15]
------------------------------------------------------------------------------------
Choose Option..
1.Register New Customer.
2.Display all customer details DOB in  .
3.Change Password.
4.Display all customer details.
5.Un subscribe customer.
6.Exit.
6
------------------------------------------------------------------------------------
Terminating bye !!!!!!!!!!
 */
 