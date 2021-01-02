package interface_default;

public class Test {

	public static void main(String[] args) 
	{
		InterfaceWithDefault i1=new ImplementDefaultMeth();
		System.out.println("Area of circle : "+i1.calculate(5.12));
		System.out.println("Area of Default : "+i1.area(5));

	}

}
