/*
	2. Create a Tester to store Student details in a suitable HashSet
	Add 5 student details ( 4 with different ids & 5th with existing)
	
	2.1 What will happen, if equals n hashCode is not overridden?
	Will it detect dups ? : 
	No, duplicate also added.
	
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