/*
	1. Create a Student class  with following
	studentId(int),course(string),name,marks,birthDate(LocalDate)
	constr , toString
	
	2. Create a Tester to store Student details in a suitable HashSet
	Add 5 student details ( 4 with different ids & 5th with existing)
	
	2.1 What will happen, if equals n hashCode is not overridden?
	Will it detect dups ? : 
	
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

package student;
import java.time.LocalDate;

public class Student 
{
	/*studentId(int),course(string),name,marks,birthDate(LocalDate)
	 *constr , toString
	 */
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
		System.out.println("In equals method");
		if(o instanceof Student)
			return studentId==((Student)o).studentId;
		return false;
		
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("In hashCode met.");
		return studentId;	
	}
	
}
