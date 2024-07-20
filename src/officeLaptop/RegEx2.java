package DSA;

public class RegEx2 {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        if (strs == null || strs.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
        	
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}

