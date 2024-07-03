package Queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	private ImplementingOurOwnQueue queue ;
	
	@Before
	public void setUp() {
		
		queue = new ImplementingOurOwnQueue() ;
	}
	
	@Test
	public void testPush() {
		queue.push(10);
		queue.push(20);
		queue.push(30);
		assertEquals(10, queue.peek());
	}
	@Test
	public void testPush2() {
		queue.push(10);
		queue.push(20);
		queue.push(30);
		assertNotEquals(20, queue.peek());
	}
	
	
}
