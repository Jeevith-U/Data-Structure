package DSA;

public class p1 {

	public static void main(String[] args) {
		String s = "(ed(et(oc))el)";
		while (s.contains("(") || s.contains(")")) {
			int x1 = s.lastIndexOf("(");
			int x2 = s.indexOf(")");
			String s1 = s.substring(x1, x2 + 1);
			StringBuffer s2 = new StringBuffer(s1);
			s2.reverse();
			s = s.replace(s1, s2.reverse().substring(1, s2.length() - 1));
			System.out.println(s);
		
		}
	}
}
