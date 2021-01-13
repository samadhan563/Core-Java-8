package task_runable;

import java.util.List;
import com.app.core.Student;
import static utils.IoUtils.writeDataOnFile;
import static utils.StudentCollectionUtils.*;

public class SortByGPA implements Runnable 
{
	private List<Student> populateList;
	private String fileName;
	public SortByGPA(List<Student> populateList, String fileName)
	{
		this.populateList = populateList;
		this.fileName=fileName;
	}

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName() + " Started...");
			try 
			{
				synchronized (populateList) 
				{	
					writeDataOnFile(sortListGPA(populateList), fileName);
				}
			} 
			catch (Exception e)
			{
				System.out.println(Thread.currentThread().getName() +" "+e);
			}
			System.out.println(Thread.currentThread().getName() + " Over");
	}

}
