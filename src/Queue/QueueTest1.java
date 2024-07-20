package Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareStringLength implements Comparator<String> {

	public int compare(String o1, String o2) {
		
		return Integer.compare(o1.length(), o2.length()) ;
		
//		if(o1.length() < o2.length()) return 1 ;
//		else if(o1.length() == o2.length()) return 0 ;
//		else return -1 ;
	}
	
}
public class QueueTest1 {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>(new CompareStringLength()) ;
		
		queue.addAll(List.of("Apple","cactus", "pinapple", "Banana", "Mango")) ;
		
		System.out.println(queue);
		
	}
}
