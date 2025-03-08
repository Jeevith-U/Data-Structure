package Test;

/**
 * @author Jeevith
 *
 */

public class Employee implements Cloneable {
	
	String name ;
	int age ;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Employee name=" + name + ", age=" + age );
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
}


