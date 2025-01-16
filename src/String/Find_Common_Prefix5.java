package String;

public class Find_Common_Prefix5 {

	public static void main(String[] args) {

		String[] strs = {"flower", "flow", "flight"};

		if (strs == null || strs.length == 0) {
			System.out.println("The Array is Empty");
			return;
		}

		// Start with the first string as the prefix
		String prefix = strs[0];

		// Compare with each string in the array
		for (int i = 1; i < strs.length; i++) {
			// Update the prefix by comparing with the current string
			while (strs[i].indexOf(prefix) != 0) {
				// Remove one character from the end of the prefix
				prefix = prefix.substring(0, prefix.length() - 1);
				// If prefix becomes empty, no common prefix exists
				if (prefix.isEmpty()) {
					System.out.println("No common prefix");
					return;
				}
			}
		}

		// If we reach here, we have the longest common prefix
		System.out.println("The longest common prefix is: " + prefix);
	}
}
