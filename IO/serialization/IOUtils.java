package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Student;

public interface IOUtils 
{
	static void studentDetails(Map<String, Student> map, String fileName) throws IOException
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			oos.writeObject(map);
		}
	}
}
