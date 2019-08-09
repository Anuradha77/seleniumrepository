package Functions;

public class TestAccessModWithinPkg {

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		obj.defaultfunction();
		obj.protectedfunction();
	}

}
