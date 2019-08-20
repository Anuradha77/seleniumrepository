package mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Percentage {

	public static void main(String[] args)
	{
		
		Map<String, Map<String, Integer>> map= new HashMap<String, Map<String, Integer>> ();
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("sub1", 90);
		m1.put("sub2", 60);
		m1.put("sub3", 50);
		m1.put("sub4", 40);
		m1.put("sub5", 70);
		
		Map<String, Integer> m2= new HashMap<String, Integer>();
		m2.put("sub1", 75);
		m2.put("sub2", 61);
		m2.put("sub3", 70);
		m2.put("sub4", 45);
		m2.put("sub5", 50);
		
		
		/* map.put("anu",m1); */
		map.put("radha", m2); 
		
		Map<String, Integer> result=getPercentage(map);
		
		Set<String> keys=result.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(keys);
			System.out.println(result.get(it.next()));
		}
		
		
	
	}
	public static Map<String, Integer> getPercentage(Map<String, Map<String, Integer>> map)
	{
		Map<String, Integer>  map3= new HashMap<String, Integer>();
		Set<String> stds=map.keySet();
		
		for(String std:stds)
		{
			Map<String, Integer> sub=map.get(std);
			Set<String> s= sub.keySet();
			

			int count=0;
			int total=0;
			
			for(String s1:s)
			{
				total=total+sub.get(s1);
				count++;
			}
			
			int perct=total/count;
			map3.put(std,perct);
			}
		return map3;
			
	}
}
