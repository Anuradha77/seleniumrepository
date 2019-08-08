package Functions;

public class StaticAndNonStatic2 {
	
	public static void main(String[] args)
	{
		//static variable and function calling from second class
		System.out.println(StaticAndNonStatic.name);
		StaticAndNonStatic.fun1();
		
		//non static variable and function calling from second class
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.surname);
		obj.fun2();
}	
}