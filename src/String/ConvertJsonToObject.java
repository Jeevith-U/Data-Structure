package String;

import java.util.Arrays;

public class ConvertJsonToObject {

	public static void main(String[] args) {
		
		String s = "{"
							+ "name : Jeevith"
							+ " age : 24"
					 + "}";
		
//		System.out.println(s);
		
//		System.out.println(s.trim());
		
		s = s.replace("{", "").replace("}", "").trim();
		
		String[] arr = s.split("[: ]+");
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}
}
