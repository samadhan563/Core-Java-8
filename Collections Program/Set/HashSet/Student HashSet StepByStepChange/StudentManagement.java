/*
	2. Create a Tester to store Student details in a suitable HashSet
	Add 5 student details ( 4 with different ids & 5th with existing)
	
	2.1 What will happen, if equals n hashCode is not overridden?
	Will it detect dups ? : 
	No, duplicate also added.
	
	true
	true
	true
	true
	true
	Student [studentId=101, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
	Student [studentId=102, name=Rohit, course=DAC, marks=65.0, birthDate=1995-08-17]
	Student [studentId=101, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
	Student [studentId=104, name=Samadhan, course=DSIT, marks=65.0, birthDate=1998-02-19]
	Student [studentId=103, name=Vinod, course=DBDA, marks=65.0, birthDate=1992-12-19]
	
	
	2.2 What will happen, if only equals is  overridden?
	Will it detect dups ?  
	Why ?  : 
	
	2.3 What will happen, if  equals  n hashCode is  overridden? (BUT only mandary part of the contract)
	Equal objects producing SAME hashcode
	Will it detect dups ? 
	What about performance ? O(1) or O(n) : 
	
	2.4 What will happen, if  equals  n hashCode is  overridden? (With mandatory n optional part of the contract)
	Equal objects producing SAME hashcode & un equal ocjects producing DISTINCT hashcodes.
	Will it detect dups ? 
	What about performance ?  : O(1) or O(n) : 
	
	
	2.5 Copy this project into another project n make the changes.
	PK : student id , course & dob
	How will you solve it to detect dups & manage constant performance?
	Create enough test cases , by adding all possible combinations of id , course & dob n observe n conclude.

*/
package tester;

import java.time.LocalDate;
import java.util.HashSet;

import student.Student;

public class StudentManagement 
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
	//studentId(int),course(string),name,marks,birthDate(LocalDate)
	//constr , toString
	 
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
}
*/
