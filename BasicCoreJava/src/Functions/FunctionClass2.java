package Functions;

public class FunctionClass2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str=name("a","b");
		System.out.println(str);
		boolean result=eligible(40);
		if(result)
		{
			System.out.println("you are eligible");
		}else
		{
			System.out.println("You are not eligible");
		}
		
	}
	public static String name(String a, String b)
	{
		return "Your name is= "+a+" "+b;		
	}
	
	public static boolean eligible(int age)
	{
		if(age>=18 && age<=30)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
