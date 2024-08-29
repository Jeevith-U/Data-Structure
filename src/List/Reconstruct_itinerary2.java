package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Jeevith
 *
 */

public class Reconstruct_itinerary2 {

	public static void main(String[] args) {

		List<List<String>> tickets = List.of(List.of("JFK","SFO"), List.of("JFK","ATL"), List.of("SFO","ATL"),
				List.of("ATL","JFK"), List.of("ATL","SFO"));

		findItinerary(tickets);
	}

	public static List<String> findItinerary(List<List<String>> tickets) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		for(List<String> tic : tickets) {
			if(map.containsKey(tic.get(0)))
			 map.put(tic.get(0), map.getOrDefault(tic.get(0), 1)+1 ) ;
			else map.put(tic.get(0), 1) ;
		}
//		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet() ;
		
		ArrayList<List<String>> list = new ArrayList<List<String>>() ;
		
		for( Entry<String, Integer> s : set) {
			
			if(s.getValue() > 1) {
				String key = s.getKey() ;
				
				for(List<String> t : tickets) {
					
					if(t.get(0).equals(key)) list.add(t) ;
				}
			}
			
			System.out.println(list);
			
			findLexicalOrder(list) ;
		}
		
		return null ;
	}

	private static void findLexicalOrder(ArrayList<List<String>> list) {
		// TODO Auto-generated method stub
		
	}
}
