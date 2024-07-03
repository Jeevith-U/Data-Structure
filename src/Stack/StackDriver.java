package Stack;

public class StackDriver {
	
	public static void main(String[] args) {
		
		
		ImplementingOurOwnStack.push(10);
		ImplementingOurOwnStack.push(20);
		ImplementingOurOwnStack.push(30);
		ImplementingOurOwnStack.push(40);
		
		ImplementingOurOwnStack.showStack();
		
		ImplementingOurOwnStack.pop();
		System.out.println("After Poping");
		ImplementingOurOwnStack.showStack();
	}
}
