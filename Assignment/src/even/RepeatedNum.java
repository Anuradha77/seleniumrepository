package even;

public class RepeatedNum {

	public static void main(String[] args) 
	{
		int arr[]= {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(i);
			
			if(arr[i]==3 )
			{
				System.out.print(arr[i]+" repeated 3 times");
			}
			
			if(arr[i]==6 )
			{
				System.out.print(arr[i]+" repeated 6 times");
			}System.out.println();
		}

	}

}
