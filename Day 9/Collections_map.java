package Day9;

import java.util.HashMap;
import java.util.Map;

public class Collections_map {

	public static void main(String[] args) {
		Map<String,Integer> mapdata = new HashMap<String,Integer>();
		mapdata.put("A", 78);
		mapdata.put("B", 90);
		mapdata.put("C", 60);
		mapdata.put("D", 30);
		mapdata.put("E", 50);
		
		System.out.println(mapdata.keySet());
		System.out.println(mapdata.values());
		for(String key:mapdata.keySet())
		{
			System.out.println(key+":"+mapdata.get(key));
		}
		
		
	}

}
