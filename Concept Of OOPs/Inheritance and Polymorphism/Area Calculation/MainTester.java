package switchcase.programs;

import java.util.Scanner;

public class MainTester {

	public static void main(String[] args) 
	{
		//Shape shape = null;
		Scanner sc=new Scanner(System.in);
		boolean flag=false;	
		int side,ch = 0;
		while(!flag)
		{
			Shape shape =new Shape(15,5);
			System.out.println("Enter Side");
			side=sc.nextInt();
			if(side==4)
				ch=1;
			if(side==3)
				ch=2;
			if(side==5)
				ch=3;
			switch(ch)
			{
				case 1: 
						shape=new AreaOfSqure(15, 4);
						if(shape instanceof AreaOfSqure);
							System.out.println(((AreaOfSqure)shape).calculateShapeArea());
						break;
				case 2: 
						shape=new AreaOfTriangle(12, 3);
						if(shape instanceof AreaOfTriangle);
							System.out.println(((AreaOfTriangle)shape).calculateShapeArea());
						break;
				case 3: 
						System.out.println(shape.calculateShapeArea());
						flag=true;		
						
			}	
		}
	}

}
