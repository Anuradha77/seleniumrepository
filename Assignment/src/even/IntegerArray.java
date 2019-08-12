package even;

public class IntegerArray {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		
		System.out.println("Array");
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.println("Reverse Array");
		
		for (int i = 5-1; i >= 0; i--) 
		{
		System.out.print(arr[i]);	
		}
		
		
		

	}

}
