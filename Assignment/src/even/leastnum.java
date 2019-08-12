package even;

public class leastnum {

	public static void main(String[] args) 
	
	{
		int a[]= {10,30,20,50,4,90};
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) 
		
		{
		if(a[i]<=min)	
		{
			min=a[i];
		}
		}System.out.println(min+ " is the minimum number");

	}

}
