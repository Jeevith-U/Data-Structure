package List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeevith
 *
 */

public class Reconstruct_itinerary2 {

	public static void main(String[] args) {

		List<List<String>> tickets = List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
				List.of("LHR", "SFO"));

		findItinerary(tickets);
	}

	public static List<String> findItinerary(List<List<String>> tickets) {
		
		boolean value = tickets.contains("JFK") ;
		
		return null ;

	}
}
