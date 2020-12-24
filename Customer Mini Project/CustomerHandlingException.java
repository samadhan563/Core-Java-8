/*
 * 2. Create custom exception class : CustomerHandlingException , as a checked exception
 */

package exception;

public class CustomerHandlingException extends Exception 
{
	public CustomerHandlingException(String message)
	{
		super(message);
	}

}
