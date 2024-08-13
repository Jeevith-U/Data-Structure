package List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeevith
 *
 */

public class Reconstruct_itinerary {

	public static void main(String[] args) {

		List<List<String>> tickets = List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
				List.of("LHR", "SFO"));

		findItinerary(tickets);
	}

	public static List<String> findItinerary(List<List<String>> tickets) {

		String start = "JFK";

		List<String> iti = new ArrayList<String>();
		
		for (int j = 0; j < tickets.size(); j++) {

			for (int i = 0; i < tickets.size(); i++) {

				List<String> list = tickets.get(i);

				for(int li = 0 ; li < list.size() ; li++) {
					int idx = 0 ;
				if (list.get(idx).equals(start)) {
					iti.add(start);
					start = list.get(++idx);
				} else
					break;
				}
			}
		}
		iti.add(start) ;
		return iti;

	}
}
