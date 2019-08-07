package variablesanddatatyps;

public class NestedIfstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		//Login
		if(a>b)
		{
			//compose
			if (a>c)
			{
				System.out.println("a is greatest");
			}
				
		}
		
		//Login
				if(a>b)
				{
					//visibility of inbox
					if (a>c)
					{
						System.out.println("a is greatest");
					}
				}
						
					//visibility of outbox
					else if(a>=c)
					{
						System.out.println("a is greatest");
					}
				
				else
					{
						System.out.println("a is not greatest");
					}
	}
}
		
	


