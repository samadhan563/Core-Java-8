package runnable_thread;

import student.Student;
import utils.Utils;

public class Admission implements Runnable  
{
	Utils utils;
	boolean exit;
	public Admission(Utils utils) 
	{
		this.utils=utils;
	}
	@Override
	public void run() 
	{
		System.out.println("Started thread...."+Thread.currentThread().getName());
		while(!exit)
			try {
				utils.wirteData(new Student(101, "Mahesh",101, "Shirdi"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Over thread...."+Thread.currentThread().getName());
	}
	
	public void stop()
	{
		exit=true;
	}

}
