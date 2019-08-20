package exceptionhandling;

import java.io.FileInputStream;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
		
		try {
			
		
		//step 1
		System.out.println(10/10);
		
		//step 2
		String str="anu";
		System.out.println(str.charAt(2));
		
		//step 3
		System.out.println("step 3");
		
		//step 4
		FileInputStream file=new FileInputStream("");
		
		//step 5
		
		int[] arr= {};
		System.out.println(arr[0]);
		
		
		}catch(ArithmeticException e)
		{
			System.out.println("Handle ArithmaticException exception");
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handle StringIndexOutOfBound exception");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
