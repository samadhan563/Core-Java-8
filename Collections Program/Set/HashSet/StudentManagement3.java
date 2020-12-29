/*
	2. Create a Tester to store Student details in a suitable HashSet
	Add 5 student details ( 4 with different ids & 5th with existing)
	

	2.3 What will happen, if  equals  n hashCode is  overridden? (BUT only mandary part of the contract)
	Equal objects producing SAME hashcode
	Will it detect dups ? no duplicates
	What about performance ? O(1) or O(n) : o(n)
	
*/
package tester;

import java.time.LocalDate;
import java.util.HashSet;

import student.Student;

public class StudentManagement3 
{

	public static void main(String[] args) 
	{
		HashSet<Student> students=new HashSet<Student>();
		System.out.println(students.add(new Student(101, "Samadhan", "DAC",65, LocalDate.parse("1997-02-19"))));
		System.out.println(students.add(new Student(102, "Rohit", "DAC",65, LocalDate.parse("1995-08-17"))));
		System.out.println(students.add(new Student(103, "Vinod", "DBDA",65, LocalDate.parse("1992-12-19"))));
		System.out.println(students.add(new Student(104, "Samadhan", "DSIT",65, LocalDate.parse("1998-02-19"))));
		System.out.println(students.add(new Student(101, "Samadhan", "DAC",65, LocalDate.parse("1997-02-19"))));
		for (Student student : students)
			System.out.println(student);
	}

}
/*
package student;
import java.time.LocalDate;

public class Student 
{
	/*studentId(int),course(string),name,marks,birthDate(LocalDate)
	 *constr , toString
	 
	private int studentId;
	private String name;
	private String course;
	private double marks;
	private LocalDate birthDate;
	
	public Student(int studentId, String name, String course, double marks, LocalDate birthDate) 
	{
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.marks = marks;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", name=" + name + ", course=" + course + ", marks=" + marks
				+ ", birthDate=" + birthDate + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Student)
			return studentId==((Student)o).studentId;
		return false;
		
	}
	
	@Override
	public int hashCode()
	{
		return 904;
		
	}
	

*/
