package Functions;

public class FunctionClass {

	//access modifier-public,private,protected,default/no acc modi
	//static/non static(no keyword)
	//void-return type
	//main-function
	//( )-parameter/arguments
	
	public static void main(String[] args) //
	{
		/*
		 * myFirstFunction(); 
		 * sum(10,30); 
		 * sum(40,30);
		 */
		 int i=sum2(20,30);
		 System.out.println(i);
	}
	//Function with no return type and no arguments
		public static void myFirstFunction()
		{
			System.out.println("Testing");
		}
		
	//function with no return type and 2 arguments	
		public static void sum(int a,int b)
		{
						
			System.out.println(a+b);
			
		}
		
		//function with integer return type and 2 arguments		
		public static int sum2(int a,int b)
		{
			return a+b;
			
		}
}
