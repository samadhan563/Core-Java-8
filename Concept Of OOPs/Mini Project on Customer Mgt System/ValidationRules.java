/*2.3 
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
*/
package utils;

import java.util.Date;

import customer.DemoCustomer;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exception.InvalidInputException;

public class ValidationRules 
{
	/**
	 * 1.Customer email must contain "@" & email should end with ".com" (Use String
	 * class methods contains , endsWith methods) eg : public static String
	 * validateEmail(String email) throws InvalidInputException{...}
	 * @return 
	 * @throws InvalidInputException 
	 */
	public static String validateEmail(String customerEmailId) throws InvalidInputException
	{
		if(customerEmailId.contains("@")&&customerEmailId.endsWith(".com"))
		{
			return customerEmailId;
		}
		else
			throw new InvalidInputException("Invalid Email ID");
	}
	public static String validatEmailExist(String customerEmailId,DemoCustomer[] customers) throws InvalidInputException
	{
		for (DemoCustomer demoCustomer : customers) 
		{
			if(demoCustomer!=null)
			{
				if(customerEmailId.equals(demoCustomer.getCustomerEmailId()))
					throw new InvalidInputException("Email ID Already exist..");
			}
		}
		return customerEmailId;
	}
	public static String validatePassword(String customerPassword) throws InvalidInputException
	{
		if(customerPassword.length()>=8 &&customerPassword.length()<=16)
			return customerPassword;
		else
			throw new InvalidInputException("Password length should be more than 8 or less than 16");
	}
	//2. customer type must be either SILVER or GOLD or PLATUNUM (Use String class contains method)
	public static String validateType(String customerType) throws InvalidInputException
	{
		if(customerType.contains("SILVER"))
			return "SILVER";
		else if(customerType.contentEquals("PLATUNUM") )
			return "PLATUNUM";		
		else if(customerType.contentEquals("GOLD") )	
			return "GOLD";
			throw new InvalidInputException("Invalid Customer type...");
	}
	/*
	 * 3. customer's birth date must be after 1st Jan 1990. (Hint : add a static
	 * method to parse(string--->date) n validate For validation : Use
	 * java.util.Date class : before / after methods.
	 * 
	 */

	public static Date validateCustomerDOB(String customerDOfB) throws  InvalidInputException
	{
		Date customerDOB=null;
		try
		{
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		customerDOB=format.parse(customerDOfB);
		//System.out.println(customerDOB);
		}
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		Date dateAfter=new Date(01/01/1990);
		if(customerDOB.compareTo(dateAfter)>0)
			return customerDOB;
		else
			throw new InvalidInputException("Invalid Customer Birth Date...");
	}
	//sama	sama@563.com	1234	19021997	GOLD	500
	//rohit	rauti3@gmail.com	1234	10121993	GOLD	500
	/*
	 * 4. Reg amount must be in multiples of 500.
	 * 
	 * In case of validation failures , throw your custom exception , which will be
	 * actually handled in main(...) of Tester class. i.e Centralized exc handling
	 * is expected.
	 */
	public static double regAmount(double regAmount)throws InvalidInputException
	{
		if(regAmount%500==0)
			return regAmount;
		else
			throw new InvalidInputException("Invalid Customer Birth Date...");
	}	
}
