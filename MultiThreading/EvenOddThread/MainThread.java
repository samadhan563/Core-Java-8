package thread;

import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) 
	{
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter start and end..");
			int start=sc.nextInt();
			int end=sc.nextInt();
			EvenPrinterTask evenPrinterTask=new EvenPrinterTask("Even", start, end);
			OddPrinterTask oddPrinterTask=new OddPrinterTask("Odd", start, end);
		}
	}
}
/* OutPut::
Enter start and end..
1 50
Executing thread Even
Even thread 2
Executing thread Odd
Odd thread 1
Even thread 4
Odd thread 3
Even thread 6
Odd thread 5
Even thread 8
Odd thread 7
Even thread 10
Odd thread 9
Even thread 12
Odd thread 11
Even thread 14
Odd thread 13
Even thread 16
Odd thread 15
Even thread 18
Odd thread 17
Even thread 20
Odd thread 19
Even thread 22
Odd thread 21
Even thread 24
Odd thread 23
Even thread 26
Odd thread 25
Even thread 28
Odd thread 27
Even thread 30
Odd thread 29
Even thread 32
Odd thread 31
Even thread 34
Odd thread 33
Even thread 36
Odd thread 35
Even thread 38
Odd thread 37
Even thread 40
Odd thread 39
Even thread 42
Odd thread 41
Even thread 44
Odd thread 43
Even thread 46
Odd thread 45
Even thread 48
Odd thread 47
Even thread 50
Odd thread 49
Execution of thread over Even
Execution of thread over Odd
*/
