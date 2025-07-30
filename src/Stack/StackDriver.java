package Stack;

public class StackDriver {

	public static void main(String[] args) {

		/*
		 * ImplementingOurOwnStack.push(10); ImplementingOurOwnStack.push(20);
		 * ImplementingOurOwnStack.push(30); ImplementingOurOwnStack.push(40);
		 * 
		 * ImplementingOurOwnStack.showStack();
		 * 
		 * ImplementingOurOwnStack.pop(); System.out.println("After Poping");
		 * ImplementingOurOwnStack.showStack();
		 */

		/*
		 * StackImplementation_Array obj = new StackImplementation_Array(4) ;
		 * 
		 * obj.push(20); obj.push(50); obj.push(30);
		 * 
		 * obj.display();
		 * 
		 * obj.pop() ;
		 * 
		 * System.out.println(); obj.display();
		 * 
		 * System.out.println(); obj.push(120); obj.push(80); obj.display();
		 * 
		 * System.out.println(); System.out.println(obj.peek());
		 * System.out.println(obj.pop()); System.out.println(obj.peek());
		 */

		var obj = new StackImplementation_Array(4);

		obj.push(90);
		obj.push(20);
		obj.push(45);
		
		System.out.println(obj.peek());
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());

	}
}
