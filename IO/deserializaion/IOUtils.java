package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

	static Object restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException
	{
		File file=new File(fileName);
		if(file.canRead() && file.exists() && file.isFile())
		{ 
			//JavaApp <--- OIS <---- FIS + students.ser
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(file)))
			{
				return in.readObject();
			}		
		}
		return null;	
	}
}
