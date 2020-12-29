package studentvalidation;

import java.time.LocalDate;
import java.util.ArrayList;

import student.CourseName;
import student.Student;
import student_exception.InvalidCredentialDetails;
import static java.time.LocalDate.parse;

public class StudentValidation 
{
	public static ArrayList<Student> record()
	{
		ArrayList<Student> students=new ArrayList<Student>();
		//OS,CORE_JAVA,J2EE,WT,MEAN,RDBMS;
		students.add(new Student(101,"Samadhan", parse("1997-02-19"),CourseName.valueOf("CORE_JAVA"), 70));
		students.add(new Student(102,"Vinod", parse("1994-08-18"),CourseName.valueOf("RDBMS"), 65));
		students.add(new Student(103,"Rohit", parse("1992-12-10"),CourseName.valueOf("WT"),65 ));
		students.add(new Student(104,"Arjun", parse("1992-10-15"),CourseName.valueOf("J2EE"), 99.99));
		return students;
	}
	
	public static Student addStudent(ArrayList<Student> students, int studId, String studentName, LocalDate birthDate, String courseName, double marks) throws InvalidCredentialDetails
	{
		validateIdDuplication(students, studId);
		CourseName courseName1=CourseName.valueOf(courseName.toUpperCase());
		return new Student(studId, studentName, birthDate, courseName1, marks);	
	}

	public static void validateIdDuplication(ArrayList<Student> students, int studentId) throws InvalidCredentialDetails 
	{
		Student s=new Student(studentId);
		System.out.println(students.contains(s));
		if(!students.contains(s))
			return;
			throw new InvalidCredentialDetails("Student id already exist....");		
	}
}
