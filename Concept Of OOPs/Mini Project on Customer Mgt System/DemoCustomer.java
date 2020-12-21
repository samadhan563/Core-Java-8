/**
1. Refer to the sequence
Revise all the topics : protected keyword , equals , string handling , date time handling & nested classes in java.

Mini project (assignment based on all of earlier topics)
2.Create a customer management application along with validations. 
2.1 Customer class
state --name,email,password,dateOfBirth(java.util.Date),custType(string),reg amount(double)
Add constructor n toString.
Unique ID : email
Override equals method correctly.

2.2 Create custom exception class(eg : InvalidInputException) , as a checked exception

2.3 
Add I/P Validation rules in utils package : ValidationRules.java 
Add them using different public static methods(eg : validateEmail, validatePassword etc)
Must use exception delegation (throws)

1.Customer email must contain "@"  &  email  should end with ".com" (Use String class methods
contains , endsWith methods)
eg : public static String validateEmail(String email) throws InvalidInputException{...}
  
2. customer type must be either SILVER or GOLD or PLATUNUM (Use String class contains method)
3. customer's birth date must be after 1st Jan 1990.
(Hint : add a static method to parse(string--->date) n validate
For validation : Use java.util.Date class : before / after methods.

4. Reg amount must be in multiples of 500.

In case of validation failures , throw your custom exception , which will be actually handled in main(...)
 of Tester class.
i.e Centralized exc handling is expected.

Tester

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

6. Exit
*/
package customer;

import java.util.Date;

public class DemoCustomer 
{
	String customerName;
	String customerEmailId;
	String customerPassword;
	Date customerDOfB;
	String customerType;
	double regAmount;
	public DemoCustomer(String customerName,String customerEmailId,String customerPassword,Date customerDOfB,String customerType, double regAmount)
	{
		this.customerName=customerName;
		this.customerEmailId=customerEmailId;
		this.customerPassword=customerPassword;
		this.customerDOfB=customerDOfB;
		this.customerType=customerType;
		this.regAmount=regAmount;		
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public Date getCustomerDOfB() {
		return customerDOfB;
	}
	public String getCustomerType() {
		return customerType;
	}
	public double getRegAmount() {
		return regAmount;
	}
	@Override
	public String toString() 
	{
		return "DemoCustomer [customerName=" + customerName + ", customerEmailId=" + customerEmailId
				+ ", customerPassword=" + customerPassword + ", customerDOfB=" + customerDOfB + ", customerType="
				+ customerType + ", regAmount=" + regAmount + "]";
	}
	@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public void setCustomerPassword(String customerPassword)
	{
		this.customerPassword = customerPassword;
		
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
}
