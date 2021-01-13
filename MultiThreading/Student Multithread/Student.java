package student;

public class Student 
{
	private int rollNo;
	private String name;
	private String address;
	private double marks;
	
	public Student(int rollNo, String name, double marks, String address)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
		this.marks=marks;
	}

	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
}
