package Functions;

public class Car 
{

	static int wheels=4;
	String colour="white";
	String model="VDI";
	
	public void specification()
	{
		System.out.println(colour+" "+model+ " car is having " +wheels+ " wheels");
	}
	
	//constructor-to initialize instance variable
	//Default constructor
	
	public Car()
	{
		
	}
	
	//parametrized constructor
	public Car(String colour1, String model1)
	{
		colour=colour1;
		model=model1;
	}
}
