/*
	 Create a Student class to hold following information
	studentId(int : UNIQUE ), course name(enum : OS,CORE_JAVA,J2EE,WT,MEAN,RDBMS) , student name , birth date , marks
	Add necessary methods for storing the information in an ArrayList
	Student HAS-A Address
	Address : city,state,country,zipCode
	Use aggregation .
	No validation constraints are expected.
	
	Create suitable UI , for the following
	1. Store Student information in the ArrayList
	2. Accept 4 student details ,n confirm no duplications.
	3. Display all of them using list iterator , in a reverse mannner
	4. Display student details , sorted as per id (use Natural ordering)
	5. Display student details , sorted as per birth date n marks (use Custom ordering & anonymous inner class)

 */

package student;

import java.time.LocalDate;

public class Student implements Comparable<Student>
{
	private int studentId;
	private String studentName;
	private LocalDate birthDate;
	private CourseName courseName;
	private double marks;
	private Address address;
	
	public Student(int studentId, String studentName, LocalDate birthDate, CourseName courseName, double marks) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.birthDate = birthDate;
		this.courseName = courseName;
		this.marks = marks;
	}

	public Student(int studentId) 
	{
		this.studentId=studentId;
	}

	@Override
	public boolean equals(Object obj) 
	{
	//	if (obj instanceof Student)
		//{
			//Student s=(Student)obj;
			return (obj instanceof Student)?studentId==((Student)obj).studentId:false;
		//}
		//return false;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress( String city, String state, String country, int zipCode)
	{
		this.address = new Address(city, state, country, zipCode);
	}

	@Override
	public String toString() 
	{
		StringBuilder sb=new StringBuilder("");
		if(address != null)
			sb.append(address);
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", birthDate=" + birthDate
				+ ", courseName=" + courseName + ", marks=" + marks + sb + "]";
	}
	
	@Override
	public int compareTo(Student s)
	{
		if(studentId>s.studentId)
			return  1;
		if(studentId==s.studentId)
			return 0;
		else 
			return -1;
		
	//	return ((Integer)studentId).compareTo(s.studentId);			
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public CourseName getCourseName() {
		return courseName;
	}

	public void setCourseName(CourseName courseName) {
		this.courseName = courseName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
}
