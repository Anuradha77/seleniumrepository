package variablesanddatatyps;

public class ElseStatement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		a=b;
		
		if(a>b)
		{
			System.out.println("Execute 1st statement");
			
		}
		else if(a==b)
		{
			System.out.println("Execute 2nd statement");
		}
		else
		{
			System.out.println("Execute 3rd statement");
		}
	}

}
