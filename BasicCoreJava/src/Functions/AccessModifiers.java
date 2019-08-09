package Functions;

public class AccessModifiers 
{
	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		obj.privatefunction();
		obj.defaultfunction();
		obj.protectedfunction();
	}
	
	public void publicfunction()
	{
		System.out.println("public function");
	}
	
	private void privatefunction()
	{
		System.out.println("private function");
	}
	
	protected void protectedfunction()
	{
		System.out.println("protected function");
	}
	
	 void defaultfunction()// no access modifier
	{
		System.out.println("default function");
	}
}
