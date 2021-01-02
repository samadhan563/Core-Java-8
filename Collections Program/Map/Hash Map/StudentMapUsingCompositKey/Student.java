/*
   	Create a Student class  having
	studentId(PRN : string),courseName(string),name,marks,birthDate(LocalDate)
	constr , toString
	Unique ID : PRN & courseName (composite PK)
	Create a suitable HashMap to store at least 5 student details.
	Try to retrive details supplying PK.
	Display all student details

 */

package student;

import java.time.LocalDate;

public class Student 
{
	private String PRN;
	private String courseName;
	private String studName;
	private double marks;
	private LocalDate birthDate;
	
	public Student(String PRN, String courseName, String studName, double marks, LocalDate birthDate) 
	{
		this.PRN = PRN;
		this.courseName = courseName;
		this.studName = studName;
		this.marks = marks;
		this.birthDate = birthDate;
	}

	public Student(String PRN, String courseName) 
	{
		this.PRN = PRN;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", courseName=" + courseName + ", studName=" + studName + ", marks=" + marks
				+ ", birthDate=" + birthDate + "]";
	}
	
	
	public String toStringForKeys()
	{
		return "Student [PRN=" + PRN + ", courseName=" + courseName + "]";
	}
	
	@Override 
	public boolean equals(Object obj) 
	{	
		Student s=(Student) obj;
		return PRN.equals(s.PRN)&&courseName.equals(courseName);
	}
	
	@Override 
	public int hashCode()
	{
		return 17*PRN.hashCode()+courseName.hashCode();	
	}

	public String getPRN() 
	{
		return PRN;
	}

	public void setPRN(String pRN) 
	{
		PRN = pRN;
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
}
