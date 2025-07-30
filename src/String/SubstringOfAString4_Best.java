package String;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfAString4_Best {

	public static void main(String[] args) {

		String s = "tracxn", substr = "cxn";

		int res = findSubString(s, substr);

		System.out.println(res);
	}

	public static int findSubString(String mainStr, String substr) {

		int ml = mainStr.length();

		int sl = substr.length();

		if (sl > ml)
			return -1;

		for (int i = 0; i <= ml - sl; i++) {

			int j;

			for (j = 0; j < sl; j++) {

				if (mainStr.charAt(i + j) != substr.charAt(j))
					break;
			}

			if (j == sl)
				return 1;

		}

		return -1;

	}

}
