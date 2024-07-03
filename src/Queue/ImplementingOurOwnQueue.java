package Queue;

import java.util.ArrayList;
import java.util.List;

public class ImplementingOurOwnQueue {
	
	static List<Integer> qlist = new ArrayList<Integer>() ;
	
	public void push(int num) {
		
		qlist.add(num) ;
	}
	
	public void pop() {
		
		for(int i = 0 ; i < qlist.size()-1 ; i++) {
			qlist.remove(i) ;
			break ;
		}
	}
	
	public  int peek() {
		int num = 0 ;
		for(int i = 0 ; i < qlist.size()-1 ; i++) {
			num = qlist.get(i) ;
			break ;
		}
		return num ;
	}
	
	public void show() {
		
		for(int i = 0 ; i < qlist.size()-1 ; i++) {
			System.out.println(qlist.get(i));
		}
	}
}
