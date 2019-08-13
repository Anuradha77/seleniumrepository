package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args)
	{
		//Hash set
		/*
		 * Set<String> set= new HashSet<>();
		 * 
		 * set.add("Pooja"); 
		 * set.add("akshay"); 
		 * set.add("Daya"); 
		 * set.add("Gauri");
		 * set.add("Gauri");
		 * 
		 * for(String s:set) { System.out.println(s); }
		 * 
		 * output:
		 * Gauri 
		 * Daya 
		 * akshay 
		 * Pooja
		 */
		
		//Linked Hash set
		/*
		 * Set<String> set= new LinkedHashSet<>();
		 * 
		 * set.add("Pooja"); 
		 * set.add("akshay"); 
		 * set.add("Daya"); 
		 * set.add("Gauri");
		 * set.add("Gauri");
		 * 
		 * for(String s:set) { System.out.println(s); }
		 */
		
		//Outpot: 
		//Pooja
		//akshay
		//Daya
		//Gauri
		
		Set<String> set= new TreeSet<>();
		
		set.add("Pooja");
		set.add("Akshay");
		set.add("Daya");
		set.add("Gauri");
		set.add("Gauri");
		
		for(String s:set)
		{
			System.out.println(s);
		}

	}

}
