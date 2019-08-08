package Functions;

public class StaticAndNonStatic {
	
	public static String name="Anuradha";//class variable iff we used static
	public String surname="Kandekar";//instance variable(obj) if we do not use static
	
	public static void fun1()//
	{
		System.out.println(name);
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.surname);
	}
	
	public void fun2()//non static fun/variable u need to create object in static method
	{
		System.out.println(name);
		System.out.println(surname);
	}
	
	public static void main(String[] args)
	{
		System.out.println(name);
		fun1();
		
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.surname);
		obj.fun2();

	}
}