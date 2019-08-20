package mapinterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapinterface {

	public static void main(String[] args) 
	{
		Map<String, String> map= new HashMap<String, String>();
		map.put("name1", "anuradha");
		map.put("name2", "vinod");
		map.put("name3", "gauri");
		/*
		 * System.out.println(map.get("name1")); System.out.println(map.get("name2"));
		 * System.out.println(map.get("name3"));
		 */
		
		/*
		 * Map<String, String> map= new Hashtable<String, String>(); map.put("name1",
		 * "anuradha"); map.put("name2", "vinod"); map.put("name3", "gauri");
		 * System.out.println(map.get("name1"));
		 */
		
		Set<String> keys=map.keySet();
		/*for(String s: keys)
		{
			System.out.println(map.get(s);
		}*/
		
		Iterator<String> it= keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
	}

}
