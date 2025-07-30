package Stack;

/**
 *
 */

public class StackImplementation_Array {

	private int size;
	private int top;
	private int arr[];

	public StackImplementation_Array(int size) {

		this.size = size;
		top = -1;
		arr = new int[size];
	}

	public void push(int data) {

		if (top == size - 1)
			throw new RuntimeException("Stack is full");

		arr[++top] = data;

	}

	public int peek() {

		if (top == -1)
			throw new RuntimeException("Stack is Empty");

		else return arr[top];
	}

	public int pop() {

		if (top == -1)
			throw new RuntimeException("Stack is Empty can't retrive the value.");

		else 
			return arr[top--];
	}
	
	public void display() {
		
		for(int temp = top ; temp >= 0 ; temp--) {
			System.out.println(arr[temp]);
		}
	}

}
