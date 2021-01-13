package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public class IoUtils {

	public static void writeDataOnFile(List<Student> list, String file) throws IOException
	{
		try (PrintWriter pw = new PrintWriter(new FileWriter(file)))
		{
			list.forEach(pw::println);
		}
		
		}

}
