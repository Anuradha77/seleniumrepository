package exceptionhandling;

//to throw our own exception
public class ThrowKeyword {

	public static void main(String[] args) throws Exception
	{
		eligibility(20);

	}
	public static void eligibility(int age) throws Exception
	{
		if(age >=18 && age <=30)
		{
			System.out.println("you are eligible");
		}else
		{
			throw new Exception ("You are not eligible");
		}
	}

}
