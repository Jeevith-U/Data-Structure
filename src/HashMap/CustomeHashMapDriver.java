package HashMap;

import HashMap.CustomeHashMap.HashMap;

public class CustomeHashMapDriver {
	
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		map.put("India", 140);
		map.put("China", 160);
		map.put("Bangladesh", 180);
		
		System.out.println(map);
		
		System.out.println(map.containsKey("China"));
		
		System.out.println(map.get("India"));
		
		map.remove("Bangladesh");
		
		System.out.println(map);
	}
}
