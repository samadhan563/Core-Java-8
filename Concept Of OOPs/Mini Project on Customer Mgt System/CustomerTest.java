/*
Supply following options
1. Register new customer
Accept customer details : name,email,password,dateOfBirth(dd-MM-yyyy pattern),custType,reg amount
Invoke validation rules.
In case of errors , show error message & application should continue.
In case of no erros , display "Customer registration successful" message.
Validation rule : Should not allow new registration with duplicate email
(Hint : use equals method)


2. Display all customer details (for-each)

3. Customer Login
I/P : email & password
In case of success , Display "Login Successful message" + Customer details
In case of failure : raise custom exception . Error mesg : Invalid email or Password.
(Hint : use equals method)

4. Change Password
I/P : email , old password , new password
In case of success , Display "Password changed for " customer name.
In case of failure : raise custom exception . Error mesg : "Password updation failed " : Invalid email or Password.

5 .Display sorted customers as per their email ids.

6. Exit*/
package tester;
import java.util.Scanner;
import customer.DemoCustomer;
import exception.InvalidInputException;
import static utils.ValidationRules.*;
public class CustomerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int counter = 0;
		System.out.println("Enter Range of customer......");
		DemoCustomer[] demoCustomer = new DemoCustomer[sc.nextInt()];
		do 
		{
			System.out.println("Choose Option.." + "\n1.Register New Customer." + "\n2.Display All Customer Details."
					+ "\n3.Customer Login." + "\n4.Change Password."
					+ "\n5.Display Sorted customer as per their email ids." + "\n6.Exit.");
			switch (sc.nextInt()) {
			case 1:
				try {
					if (counter < demoCustomer.length) {
						System.out.println(
								"Enter Details of Customer...Customer Name, Customer EmailId, Customer Password, Customer DOB, Customer Type, Registration Amount");
						demoCustomer[counter++] = new DemoCustomer(sc.next(),
								validatEmailExist(validateEmail(sc.next()), demoCustomer), validatePassword(sc.next()),
								validateCustomerDOB(sc.next()), validateType(sc.next()), sc.nextDouble());
					} else
						System.out.println("Limit Crossed....");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					for (DemoCustomer demoCustomer2 : demoCustomer) {
						if (demoCustomer2 != null)
							System.out.println(demoCustomer2.toString());
					}
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				/**
				 * 3. Customer Login I/P : email & password In case of success , Display "Login
				 * Successful message" + Customer details In case of failure : raise custom
				 * exception . Error mesg : Invalid email or Password. (Hint : use equals
				 * method)
				 */
				try {
					System.out.println("Enter email & password");
					String email = sc.next();
					String passwd = sc.next();
					boolean flag = false;
					for (DemoCustomer demoCustomer2 : demoCustomer) {
						if (demoCustomer2 != null) {
							if (demoCustomer2.getCustomerEmailId().equals(email)
									&& demoCustomer2.getCustomerPassword().equals(passwd)) {
								System.out.println("Login Successful......\n" + demoCustomer2.toString());
								break;
							}
						} else
							flag = true;
					}
					if (flag)
						throw new InvalidInputException("Invalid Email Id or Password");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					boolean flag = false;
					System.out.println("Enter email & password to updating Password..");
					String email = sc.next();
					String passwd = sc.next();
					for (DemoCustomer demoCustomer2 : demoCustomer) {
						if (demoCustomer2 != null) {
							if (demoCustomer2.getCustomerEmailId().equals(email)
									&& demoCustomer2.getCustomerPassword().equals(passwd)) {
								System.out.println("Updating......\nEnter new password...");
								demoCustomer2.setCustomerPassword(validatePassword(sc.next()));
								System.out.println("Updated Successful......");
								break;
							}
						} else
							flag = true;
					}
					if (flag)
						throw new InvalidInputException("Invalid Email Id or Password");
					break;
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			case 5:
				// Display Sorted customer as per their email ids.
				for (int i = 0; i < demoCustomer.length; i++) {
					if (demoCustomer[i] != null) {
						for (int j = 0; j < demoCustomer.length; j++) {
							if (demoCustomer[j] != null) {
								if (demoCustomer[i].getCustomerEmailId()
										.compareTo(demoCustomer[j].getCustomerEmailId()) < 0) {
									DemoCustomer tmp;
									tmp = demoCustomer[i];
									demoCustomer[i] = demoCustomer[j];
									demoCustomer[j] = tmp;
								}
							}
						}
					}
				}
				for (DemoCustomer demoCustomer2 : demoCustomer) 
				{
					if (demoCustomer2 != null)
						System.out.println(demoCustomer2.toString());
				}
				break;
			case 6:
				System.out.println("Application Terminating!!!! bye!!!");
				exit = true;
				break;

			default:
				System.out.println("Invalid option!!!");
				break;
			}
		} while (!exit);
		sc.close();
	}
}
/*
Enter Range of customer......
1000
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
1
Enter Details of Customer...Customer Name, Customer EmailId, Customer Password, Customer DOB, Customer Type, Registration Amount
Samadhan samadhan563@gmail.com sama1234 19/02/1997 GOLD 2000
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
1
Enter Details of Customer...Customer Name, Customer EmailId, Customer Password, Customer DOB, Customer Type, Registration Amount
Rohit rauti3@gmail.com rohit1234 10/12/1993 PLATUNUM 5000
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
1
Enter Details of Customer...Customer Name, Customer EmailId, Customer Password, Customer DOB, Customer Type, Registration Amount
Vinod vbnavle8585@gmail.com vinod1234 14/05/1994 SILVER 500
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
2
DemoCustomer [customerName=Samadhan, customerEmailId=samadhan563@gmail.com, customerPassword=sama1234, customerDOfB=Wed Feb 19 00:00:00 IST 1997, customerType=GOLD, regAmount=2000.0]
DemoCustomer [customerName=Rohit, customerEmailId=rauti3@gmail.com, customerPassword=rohit1234, customerDOfB=Fri Dec 10 00:00:00 IST 1993, customerType=GOLD, regAmount=5000.0]
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod1234, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
3
Enter email & password
vbnavle8585@gmail.com vinod1234
Login Successful......
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod1234, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
4
Enter email & password to updating Password..
vbnavle8585@gmail.com vinod1234
Updating......
Enter new password...
vinod4321
Updated Successful......
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
2
DemoCustomer [customerName=Samadhan, customerEmailId=samadhan563@gmail.com, customerPassword=sama1234, customerDOfB=Wed Feb 19 00:00:00 IST 1997, customerType=GOLD, regAmount=2000.0]
DemoCustomer [customerName=Rohit, customerEmailId=rauti3@gmail.com, customerPassword=rohit1234, customerDOfB=Fri Dec 10 00:00:00 IST 1993, customerType=GOLD, regAmount=5000.0]
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod4321, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.

5
DemoCustomer [customerName=Rohit, customerEmailId=rauti3@gmail.com, customerPassword=rohit1234, customerDOfB=Fri Dec 10 00:00:00 IST 1993, customerType=GOLD, regAmount=5000.0]
DemoCustomer [customerName=Samadhan, customerEmailId=samadhan563@gmail.com, customerPassword=sama1234, customerDOfB=Wed Feb 19 00:00:00 IST 1997, customerType=GOLD, regAmount=2000.0]
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod4321, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
1
Enter Details of Customer...Customer Name, Customer EmailId, Customer Password, Customer DOB, Customer Type, Registration Amount
Arjun arjun@12gmail.com arjun1234 23/12/1992 GOLD 500
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
2
DemoCustomer [customerName=Rohit, customerEmailId=rauti3@gmail.com, customerPassword=rohit1234, customerDOfB=Fri Dec 10 00:00:00 IST 1993, customerType=GOLD, regAmount=5000.0]
DemoCustomer [customerName=Samadhan, customerEmailId=samadhan563@gmail.com, customerPassword=sama1234, customerDOfB=Wed Feb 19 00:00:00 IST 1997, customerType=GOLD, regAmount=2000.0]
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod4321, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
DemoCustomer [customerName=Arjun, customerEmailId=arjun@12gmail.com, customerPassword=arjun1234, customerDOfB=Wed Dec 23 00:00:00 IST 1992, customerType=GOLD, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
5
DemoCustomer [customerName=Arjun, customerEmailId=arjun@12gmail.com, customerPassword=arjun1234, customerDOfB=Wed Dec 23 00:00:00 IST 1992, customerType=GOLD, regAmount=500.0]
DemoCustomer [customerName=Rohit, customerEmailId=rauti3@gmail.com, customerPassword=rohit1234, customerDOfB=Fri Dec 10 00:00:00 IST 1993, customerType=GOLD, regAmount=5000.0]
DemoCustomer [customerName=Samadhan, customerEmailId=samadhan563@gmail.com, customerPassword=sama1234, customerDOfB=Wed Feb 19 00:00:00 IST 1997, customerType=GOLD, regAmount=2000.0]
DemoCustomer [customerName=Vinod, customerEmailId=vbnavle8585@gmail.com, customerPassword=vinod4321, customerDOfB=Sat May 14 00:00:00 IST 1994, customerType=SILVER, regAmount=500.0]
Choose Option..
1.Register New Customer.
2.Display All Customer Details.
3.Customer Login.
4.Change Password.
5.Display Sorted customer as per their email ids.
6.Exit.
6
Application Terminating!!!! bye!!!
 */
