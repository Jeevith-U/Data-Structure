package Numbers;

public class ReverseNumber2 {

    public static int reverse(int x) {

        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();

        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? -res : res;
    }

    public static void main(String[] args) {

        System.out.println(reverse(-320));
    }
}
