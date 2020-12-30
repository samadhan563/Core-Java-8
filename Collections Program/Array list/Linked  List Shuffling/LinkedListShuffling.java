/*
2. Create a linked list of integers , containg the elements (i.e references) : 1,2,3,4,....100
Display it. 
Shuffle the list randomely n display the contents.
(Hint : Collections class API : shuffle)
Can you use the same method to shuffle list of strings or fruits or emps?
 */


package listshuffling;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListShuffling {

	public static void main(String[] args) 
	{
		//shuffle integer
		LinkedList<Integer> linkedList=new LinkedList<>();
		for (int i = 1; i <=100; i++) 
			linkedList.add(i);
		System.out.println(linkedList);
		System.out.println("Integer Shuffled ");
		Collections.shuffle(linkedList);
		System.out.println(linkedList);
		
		//shuffle String 
		
		LinkedList<String> linkedList2=new LinkedList<String>();
		linkedList2.add("Samadhan");
		linkedList2.add("Rohit");
		linkedList2.add("Vinod");
		System.out.println("String Shuffled ");
		Collections.shuffle(linkedList2);
		System.out.println(linkedList2);
		
		LinkedList<Student> students=new LinkedList<Student>();
		System.out.println(students.add(new Student(101, "Samadhan", "DAC",65, LocalDate.parse("1997-02-19"))));
		System.out.println(students.add(new Student(102, "Rohit", "DAC",65, LocalDate.parse("1995-08-17"))));
		System.out.println(students.add(new Student(103, "Vinod", "DBDA",65, LocalDate.parse("1992-12-19"))));
		System.out.println(students.add(new Student(104, "Samadhan", "DSIT",65, LocalDate.parse("1998-02-19"))));
		System.out.println(students.add(new Student(105, "Samadhan", "DAC",65, LocalDate.parse("1997-02-19"))));
		for (Student student : students)
			System.out.println(student);
		System.out.println("Student Shuffled ");
		Collections.shuffle(students);
		for (Student student : students)
			System.out.println(student);
		
	}

}
/*
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
Integer Shuffled 
[54, 63, 62, 76, 55, 80, 6, 4, 73, 12, 71, 27, 92, 57, 64, 86, 20, 46, 23, 8, 99, 82, 18, 96, 70, 3, 88, 26, 91, 60, 7, 69, 42, 10, 9, 98, 30, 84, 39, 90, 48, 29, 52, 19, 68, 67, 77, 44, 28, 11, 94, 58, 75, 24, 78, 97, 100, 33, 45, 40, 83, 1, 74, 17, 79, 53, 51, 61, 35, 43, 87, 36, 95, 85, 89, 81, 49, 13, 41, 56, 59, 32, 16, 25, 31, 2, 34, 21, 37, 66, 38, 15, 93, 22, 72, 5, 47, 50, 14, 65]
String Shuffled 
[Rohit, Samadhan, Vinod]
true
true
true
true
true
Student [studentId=101, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
Student [studentId=102, name=Rohit, course=DAC, marks=65.0, birthDate=1995-08-17]
Student [studentId=103, name=Vinod, course=DBDA, marks=65.0, birthDate=1992-12-19]
Student [studentId=104, name=Samadhan, course=DSIT, marks=65.0, birthDate=1998-02-19]
Student [studentId=105, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
Student Shuffled 
Student [studentId=105, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
Student [studentId=102, name=Rohit, course=DAC, marks=65.0, birthDate=1995-08-17]
Student [studentId=101, name=Samadhan, course=DAC, marks=65.0, birthDate=1997-02-19]
Student [studentId=104, name=Samadhan, course=DSIT, marks=65.0, birthDate=1998-02-19]
Student [studentId=103, name=Vinod, course=DBDA, marks=65.0, birthDate=1992-12-19]
*/
