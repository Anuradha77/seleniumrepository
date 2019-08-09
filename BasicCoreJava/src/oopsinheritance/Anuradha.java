package oopsinheritance;

import oops.polymorphism.MethodOverloading;

public class Anuradha {

	public static void main(String[] args)
	{
		Telephone phone=new Telephone();
		phone.calling();
		
		Mobile mob=new Mobile();
		mob.texting();
		mob.calling();
		
		Smartphone smart=new Smartphone();
		smart.internet();
		smart.calling();
		smart.texting();
		
		
		

	}

}
