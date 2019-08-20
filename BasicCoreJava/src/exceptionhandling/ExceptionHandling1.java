package exceptionhandling;

public class ExceptionHandling1 {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		try {
			
		System.out.println(a/b);
				
		}catch(Exception e)
		{
			System.out.println("Exception occured");
			System.out.println(e.getMessage()); //to print the exception
			e.printStackTrace();// to trace where error occurred
		}
		System.out.println("anu");

	}

}
