package Queue;

public class QueueDriver {
	
	public static void main(String[] args) {
		
		ImplementingOurOwnQueue queue = new ImplementingOurOwnQueue() ;
		
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.push(50);
		
		queue.show();
		
//		System.out.println("The Peeked Element"+queue.peek());
		
		System.out.println();
		
		queue.pop();
		
		queue.show();
		
		System.out.println("The Peeked Element"+queue.peek());
		
	}
}
