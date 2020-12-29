package student_exception;

@SuppressWarnings("serial")
public class InvalidCredentialDetails extends Exception 
{
	public InvalidCredentialDetails(String msg) 
	{
		super(msg);
	}
}
