package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		try {
			
			//step 1
			System.out.println(10/10);
			
			//step 2
			String str="anu";
			System.out.println(str.charAt(7));
			
			//step 3
			System.out.println("step 3");
			
		}catch(Exception e)//if exception occure then only catch excecuted with try n finally
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally //with and without exception finally get executed{
		{
			System.out.println("finally block excuted");
		}

	}

}
