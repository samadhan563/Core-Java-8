/*
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

 */
package utils;

import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import customer.Customer;
import customer.CustomerType;
import exception.CustomerHandlingException;

public class CustomerValidations
{
	static final int MIN_LENGTH; 
	static final int MAX_LENGTH;
	static final LocalDate currentDate;
	static 
	{
		MIN_LENGTH=5;
		MAX_LENGTH=15;
		currentDate=now();
	}
	
	public static Customer valdateAllInput(ArrayList<Customer> customer, String name, String emailId, String password, double registrationAmount, 
			String birthDate, String customerTypes) throws CustomerHandlingException, ParseException
	{
		emailIdValidation(emailId);
		LocalDate dob=customerDOB(birthDate);
		emailIdDuplication(customer, emailId, dob);
		passwordValidation(password);
		regAmountValidation(registrationAmount);
		CustomerType customer2= customerTypes(customerTypes);
		return new Customer(name, emailId, password, registrationAmount, customer2, dob);
	}
	
	/*
	 *  email must be minimum 8 to max 15 chars long It should contain "@" n must end in ".com" Hint : Use String class methods : contains , endsWith
	 */	
	public static void emailIdValidation(String emailId) throws CustomerHandlingException
	{
		if(!emailId.contains("@") || !emailId.endsWith(".com") || emailId.length()<MIN_LENGTH || emailId.length()>MAX_LENGTH ) 
			throw new CustomerHandlingException("Invalid EmailId....");	
			
	}
	
	/*
	 *  Customer dob must be before age>21.
	 *  (Can hardcode currently , later will be replaced by LocalDate API, to find the age of customer)
	 */
	public static LocalDate customerDOB(String customerDOB) throws CustomerHandlingException, ParseException
	{
		LocalDate dob=parse(customerDOB);
		if(Period.between(dob, currentDate).getYears()<21)
			throw new CustomerHandlingException("Invalid Age");
		return dob;
	}
	
	/*
	 * Duplicate customer checking , based on email & birth date.(Hint : Use equals method of Customer class)
	 */
	public static void emailIdDuplication(ArrayList<Customer> customers, String emailId, LocalDate birthDate) throws CustomerHandlingException
	{
		Customer cust=new Customer(emailId, birthDate);
		if(customers.contains(cust))
			throw new CustomerHandlingException("EmailId already exist....");
		/*
		 * for(Customer customer:customers) { //if(customer != null ) //{
		 * if(cust.equals(customer)) throw new
		 * CustomerHandlingException("EmailId already exist...."); //} }
		 */				
	}
	
	/*
	 * Password minimum length 6 to 20 & must contain atleast one of the special characters : $ or @ or# or * n must be alpha numeric.
	 */	
	public static void passwordValidation(String password) throws CustomerHandlingException
	{
		String regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})";
		if(!password.matches(regexp))
			throw new CustomerHandlingException("Password length should be more than 8 or less than 16 and contais Special charactor");
	}
	
	/*
	 * reg amount must be in the multiples of 500
	 */
	public static void regAmountValidation(double registrationAmount) throws CustomerHandlingException
	{
		if(registrationAmount%500!=0)
			throw new CustomerHandlingException("Enter despence amount 500,1000,1500,2000...");
	}
	/*
	 * Customer type must be either : SILVER OR GOLD OR PLATINUM.
	 */
	public static CustomerType customerTypes(String customerTypes) 
	{
		return CustomerType.valueOf(customerTypes.toUpperCase());
	}
	
	public static Customer validateCustomerIndex(ArrayList<Customer> customer, String emailId, LocalDate date) throws CustomerHandlingException
	{
		Customer customer3=new Customer(emailId,date);
		int index =customer.indexOf(customer3);
		if(index<0)				
			throw new CustomerHandlingException("No Record found..");
		return customer.get(index);		
	}
	
	public static LocalDate parseDate(String date)
	{
		return parse(date);		
	}
}
