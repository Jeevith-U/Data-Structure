package String;

import java.util.LinkedHashSet;

public class longest_substring_without_repeating_characters3_Abilash_Sir {
	
	public static void main(String[] args) {
		String s = "abcabcbb";

		int maxcount = 0, count = 0, index = 0;

		LinkedHashSet<Character> h = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {

			if (h.add(s.charAt(i))) {
				count++;
				continue;
			} else {
				System.out.println(h);
				h.clear();
				i = index++;
			}
			if (count > maxcount) {
				maxcount = count;

			}

			count = 0;
		}
		if (maxcount < count) {
			maxcount = count;
		}

		System.out.println(maxcount);
	}
}
