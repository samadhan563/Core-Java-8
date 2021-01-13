package utils;

import student.Student;

public class Utils 
{
	private Student student;
	private boolean dataReady;
	public synchronized void wirteData(Student student) throws InterruptedException
	{
		while(dataReady)
			wait();
		System.out.println("Writing student........."+Thread.currentThread().getName());
		this.student=student;
		System.out.println("Info of "+student);
		dataReady=false;
		notify();
		System.out.println("Exiting from student addmisson......."+Thread.currentThread().getName());	
	}
	
	public synchronized void readData() throws InterruptedException
	{
		while(!dataReady)
			wait();
		System.out.println("Reading Student info... "+Thread.currentThread().getName());
		System.out.println("Information....."+student);
		dataReady=true;
		notify();
		System.out.println("Exiting from reading "+Thread.currentThread().getName());
	}
}
