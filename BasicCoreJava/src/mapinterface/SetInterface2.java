package mapinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		/*
		 * for(Integer a:set) { System.out.println(a); }
		 */
		
	Iterator<Integer> it= set.iterator(); 
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}

}
