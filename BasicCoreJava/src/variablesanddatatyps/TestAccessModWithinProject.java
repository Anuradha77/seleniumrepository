package variablesanddatatyps;

import Functions.AccessModifiers;

public class TestAccessModWithinProject extends AccessModifiers {

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		
		TestAccessModWithinProject obj2=new TestAccessModWithinProject();
		obj2.protectedfunction();
		
		
	}

}
