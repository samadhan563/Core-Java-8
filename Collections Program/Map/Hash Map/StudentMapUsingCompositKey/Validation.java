package utils;

import java.util.HashMap;
import static java.time.LocalDate.parse;
import student.Student;

public class Validation 
{
	public static HashMap<Student,Student> populatedMap()
	{
		HashMap<Student,Student> map=new HashMap<Student, Student>();
		map.putIfAbsent((new Student("101", "J2SE")),(new Student("101", "J2SE",  "Samadhan", 90.20, parse("1997-02-19"))));
		map.putIfAbsent((new Student("102", "J2EE")),(new Student("102", "J2EE",  "Rohit", 90.20, parse("1993-12-10"))));
		map.putIfAbsent((new Student("105", "DT")),(new Student("105", "DT",  "Vinod", 90.20, parse("1995-08-19"))));
		map.putIfAbsent((new Student("103", "PYTHON")),(new Student("103", "PYTHON",  "Mahesh", 90.20, parse("1995-02-19"))));
		map.putIfAbsent((new Student("101", "J2SE")),(new Student("101", "J2SE",  "Samadhan", 90.20, parse("1997-02-19"))));
		map.putIfAbsent((new Student("104", "PYTHON")),(new Student("104", "C##",  "Arjun", 90.20, parse("1992-02-19"))));
		map.putIfAbsent((new Student("103", "PYTHON")),(new Student("103", "PYTHON",  "Mahesh", 90.20, parse("1995-02-19"))));
		return map;
		
	}

}
