package interface_default1;

public class Test 
{
	public static void main(String[] args) 
	{
		InterfaceWithDefault i1=new ImplementDefaultMeth();
		System.out.println("Area of circle : "+i1.calculate(5.12));
		System.out.println("Area of Default : "+i1.area(5));
		System.out.println("Area with default meth : "+InterfaceWithDefault.name(10));
	}
}

