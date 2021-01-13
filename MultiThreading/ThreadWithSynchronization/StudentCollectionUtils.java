package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.time.LocalDate.*;
import static com.app.core.Subject.*;

import com.app.core.Address;
import com.app.core.Student;

public class StudentCollectionUtils {
	private static int index=0;
	public static List<Student> populateList() {
		 List<Student> students = Arrays.asList(
				new Student("dbda-001", "ravi",parse("1990-12-13"), DBT, 7),
				new Student("dbda-009", "riya",parse("1992-12-13"), ML, 6.9),
				new Student("dbda-004", "shekhar",parse("1991-12-13"), DBT, 8.9),
				new Student("dbda-002", "priya",parse("1990-02-23"), JAVA, 4),
				new Student("dbda-007", "kiran",parse("1993-02-13"), R, 4.1),
				new Student("dbda-003", "meeta",parse("1993-12-13"), R, 5.9),
				new Student("dbda-008", "sameer",parse("1991-12-06"), DBT, 5)
				);
		 List<Address> adrs=Arrays.asList(new Address("pune", "MH", "452446"),
				 new Address("pune", "MH", "652446"),
				 new Address("nagpur", "MH", "852446"),
				 new Address("indore", "MP", "752446"),
				 new Address("mumbai", "MH", "672446"),
				 new Address("pune", "MH", "692446"),
				 new Address("chennai", "TN", "862446"));
		 
		 students.forEach(s->s.assignAddress(adrs.get(index++)));
		 return students;
	}
	public static List<Student> sortListDOB(List<Student> populateList) 
	{
		/*
			Collections.sort(populateList, new Comparator<Student>() {
				@Override
				public int compare(Student stud1, Student stud2) {
					return (stud1.getDob()).compareTo(stud2.getDob());
				}
			});
		*/
		Collections.sort(populateList,(s1,s2)->s1.getDob().compareTo(s2.getDob()));
		return populateList;
		
	}
	
	public static List<Student> sortListGPA(List<Student> list) 
	{
		/*
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student stud1, Student stud2) {
				return ((Double)stud1.getGpa()).compareTo(stud2.getGpa());
			}
		});
		*/
		Collections.sort(list,(s1,s2)->((Double)s1.getGpa()).compareTo(s2.getGpa()));
		return list;
	}
}
