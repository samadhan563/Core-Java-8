package thread;

import utils.JointAccount;

public class UpdateBalanceThread implements Runnable 
{
	JointAccount a;
	public UpdateBalanceThread(JointAccount a) 
	{
		super();
		this.a=a;
	}
	@Override
	public void run() 
	{
		
		boolean flag=false;
		while(!flag)
		{
			try {
				a.checkBalance();
				
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
