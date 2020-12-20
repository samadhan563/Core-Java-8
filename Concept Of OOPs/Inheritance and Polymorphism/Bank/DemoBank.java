package bank;

public interface DemoBank 
{
	int createAccount(String type,double Balance, String document);
	String transferFund(int sourceId,int destAccountId,double amount);
	
}
