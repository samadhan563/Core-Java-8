package bank;

import java.util.Random;

public class DemoHDFC implements DemoBank
{
	Random random=new Random();
	@Override
	public int createAccount(String type, double Balance, String document) 
	{
		System.out.println("Account s created in"+this.getClass().getName());
		return random.nextInt(1000)+1;
	}

	@Override
	public String transferFund(int sourceId, int destAccountId, double amount) 
	{
		return "Found Transfer From "+sourceId+" to "+destAccountId+" Amount= "+amount+" in your "+this.getClass().getName();
	}
	void manageFund()
	{
		System.out.println("managing funds in "+getClass().getName()+" bank");
	}
}
