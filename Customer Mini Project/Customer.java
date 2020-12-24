/*Revision Assignment (Do complete!)

Create java application for Customer Management 

Design 
1. Create a Customer class : email , password , name , registration amount , customer type(enum :
	SILVER,GOLD,PLATINUM), birth date(Date).
	Provide suitable constructor to accept all i/ps ,
	Supply a toString
	Unique ID of customer class : email & birth date
	Override equals method based upon the same.

2. Create custom exception class : CustomerHandlingException , as a checked exception

3. Add following validation rules , in a separate class CustomerValidations, using static validation methods
Don't use method level exception handling , instead delegate exception handling to the caller(main class)
3.1 email must be minimum 8 to max 15 chars long
It should contain "@" n must end in ".com"
Hint : Use String class methods : contains , endsWith

3.2 Password minimum length 6 to 20 & must contain atleast one of the special characters : $ or @
or# or * n must be alpha numeric.

Help : If needed
Use this regular expression : "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})"
& use String class method : matches

3.3 reg amount must be in the multiples of 500

3.4 Customer dob must be before 1st Jan 2020.
(Can hardcode currently , later will be replaced by LocalDate API, to find the age of customer)

3.5 Customer type must be either : SILVER OR GOLD OR PLATINUM


3.6 Duplicate customer checking , based on email & birth date.
(Hint : Use equals method of Customer class)

4. Create CustomerManagement class as a Tester
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

package customer;

import java.time.LocalDate;
import java.util.Date;

public class Customer 
{
	/*
	 * Create a Customer class : email , password , name , registration amount , customer type(enum :
	 * SILVER,GOLD,PLATINUM), birth date(Date).
	 */
	String name;
	String emailId;
	String password;
	double registrationAmount;
	CustomerType customerType;
	LocalDate birthDate;
	
	/*
	 * Provide suitable constructor to accept all i/ps ,
	 */
	public Customer(String name, String emailId, String password, double registrationAmount, CustomerType customerType,
			LocalDate birthDate) 
	{
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.customerType = customerType;
		this.birthDate = birthDate;
	}
	
	public Customer(String emailId, LocalDate birthDate) 
	{
		super();
		this.emailId = emailId;
		this.birthDate = birthDate;
	}

	/*
	 * Supply a toString
	 */
	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", emailId=" + emailId + ", registrationAmount=" + registrationAmount
				+ ", customerType=" + customerType + ", birthDate=" + birthDate + "]";
	}
	
	/*
	 * Override equals method based upon the same.
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Customer)
		{
			Customer customer=(Customer)obj;
			return birthDate.isEqual(customer.birthDate)&& emailId.equals(customer.emailId);
		}
		return false;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public double getRegistrationAmount() 
	{
		return registrationAmount;
	}
	
	public LocalDate getBirthDate() 
	{
		return birthDate;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	
	
}
