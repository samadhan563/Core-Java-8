package task_runable;

import java.util.List;
import com.app.core.Student;
import static utils.IoUtils.writeDataOnFile;
import static utils.StudentCollectionUtils.*;

public class SortByDOB implements Runnable {
	private List<Student> populateList;
	private String fileName;
	public SortByDOB(List<Student> populateList, String fileName) 
	{
		this.populateList = populateList;
		this.fileName=fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started...");
		try 
		{
			synchronized (populateList) 
			{
				writeDataOnFile(sortListDOB(populateList), fileName);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " " + e);
		}
		System.out.println(Thread.currentThread().getName() + " Over");
	}

}
