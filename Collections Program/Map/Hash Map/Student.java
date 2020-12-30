/*
 1.Create with  a Student class  having

studentId(PRN : string),course(enum : SPRING, SPRING_BOOT,MERN,WT,DBT,DEVOPS,REACT),name,marks,birthDate(LocalDate)
constr , toString
Create Student management app for the following
Store student details in a suitable data structure , ensuring constant time performance + powerful methods for CRUD operations.


2. Student Admission
No duplicate admission pls. 
PRN : unique
API : containsKey + put 
OR
putIfAbsent : null or not null

3. Fetch Student Details
I/P : PRN 
O/P student details or error mesg
API : get

4. Display all student details
no inputs
API : toString 

5. Update marks of a particular student.
I/P : PRN & new marks
API : get , in case of valid PRN  : setMarks

6. Cancel Admission
I/P : PRN 
API : remove --> rets null : throw exc or otherwise print the details of the removed student
*/

package student;

import java.time.LocalDate;

public class Student
{

	/*
		studentId(PRN : string),course(enum : SPRING, SPRING_BOOT,MERN,WT,DBT,DEVOPS,REACT),name,marks,birthDate(LocalDate)
		constr , toString
		C
	*/
	private String studentId;
	private Course course;
	private String name;
	private double marks;
	private LocalDate birthDate;
	
	public Student(String studentId, Course course, String name, double marks, LocalDate birthDate) {
		super();
		this.studentId = studentId;
		this.course = course;
		this.name = name;
		this.marks = marks;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", course=" + course + ", name=" + name + ", marks=" + marks
				+ ", birthDate=" + birthDate + "]";
	}
	
	public String getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(String studentId) 
	{
		this.studentId = studentId;
	}

	public Course getCourse() 
	{
		return course;
	}

	public void setCourse(Course course) 
	{
		this.course = course;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getMarks() 
	{
		return marks;
	}

	public void setMarks(double marks) 
	{
		this.marks = marks;
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) 
	{
		this.birthDate = birthDate;
	}

	
	
}
