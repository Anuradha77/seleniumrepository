package even;

public class GreatestNumArr {

	public static void main(String[] args) 
	{
		int a[]= {10,65,20,90,11};
		int max=a[0];
		int i;

		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * if(i>=max.length-2) { System.out.println("this number is greatest "+max[i]);
		 * }
		 * 
		 * }
		 */
		
		for( i=0;i<5;i++)
		{
			
			
			if(a[i]>=max)
			{
				max=a[i];
				
			 } 
		}System.out.print(max);
		
		
		
		

	}

}
