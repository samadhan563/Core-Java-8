package bank;

public class Tester {

	public static void main(String[] args) 
	{
			DemoBank[] banks= {new DemoHDFC(),new DemoBoB()};
			for (DemoBank demoBank : banks) 
			{
				System.out.println("Created Account no.  "+demoBank.createAccount("Saving", 20000,"Adhar Card"));
				System.out.println("Transfer Found="+demoBank.transferFund(10000, 10001,5000));
				if(demoBank instanceof DemoHDFC)
					((DemoHDFC) demoBank).manageFund();
				else
					System.out.println("Invalid Bank!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}

	}

}
