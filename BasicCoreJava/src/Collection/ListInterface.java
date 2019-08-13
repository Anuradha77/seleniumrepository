package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args)
	{	//Array list
		/*
		 * List<String> list =new ArrayList<>(); list.add("Pooja"); list.add("Akshay");
		 * list.add("Daya"); list.add("Gauri");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		//Linked list
		/*
		 * List<String> list =new LinkedList<>(); list.add("Pooja"); list.add("Akshay");
		 * list.add("Daya"); list.add("Gauri");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
		//Vector
		List<String> list =new Vector<>();
		list.add("Pooja");
		list.add("Akshay");
		list.add("Daya");
		list.add("Gauri");
		list.add("Gauri");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	}

}
