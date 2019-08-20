package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnhancedForLoop {

	public static void main(String[] args)
	{
		/*
		 * int[] str= {10,20,30,40};
		 * 
		 * for(int anuradha:str) { System.out.println(anuradha); }
		 */
		/*
		 * int[] str= {100}; boolean[] Boolean = {true}; String[] s = {"Anuradha"};
		 * 
		 * for(int a:str) { System.out.println(a); }
		 * 
		 * for(String b:s) { System.out.println(b); }
		 * 
		 * for(boolean c:Boolean) { System.out.println(c); }
		 */
		
		/*
		 * Object[] arr= {100,true,"anu"};
		 * 
		 * for(Object a:arr)
		 * { 
		 * System.out.println(a); 
		 * }
		 */
		
		List list=new ArrayList<>();
		
		list.add(100);
		list.add(true);
		list.add("anu");
		
		for(Object a:list)
		{
			System.out.println(a);
		}
		
		Map<String, List> map =new HashMap<String, List>();
		
		map.put("Vinod",list);
		
		
		

	}

}
