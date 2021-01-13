package tester;

import java.io.IOException;

import runnable_thread.Admission;
import runnable_thread.ShowAdmission;
import utils.Utils;

public class TestThread 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Utils utils=new Utils();
		Admission admission=new Admission(utils);
		ShowAdmission showAdmission=new ShowAdmission(utils);
		Thread thread1=new  Thread(admission,"Admission");
		Thread thread2=new Thread(showAdmission,"Showing Admission");
		thread1.start();
		thread2.start();

		
		System.in.read();
		admission.stop();
		showAdmission.stop();
		thread1.join();
		thread2.join();
	}

}
