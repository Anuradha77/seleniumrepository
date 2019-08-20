package mapinterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) 
	{
		Set<String>set=new HashSet<>();
		
		set.add("anand");
		set.add("pooja");
		set.add("akshay");
		set.add("vijay");
		
		
		for(String pooja:set)
		{
			System.out.println(pooja);
		}
	}

}
