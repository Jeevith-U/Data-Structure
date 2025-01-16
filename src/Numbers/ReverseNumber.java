package Numbers;

public class ReverseNumber {

    public static int reverse(int x) {

        if (x == 0) {
            return 0;
        }

        boolean isNegative = x < 0;

        x = Math.abs(x);

        String reversedStr = new StringBuilder(String.valueOf(x)).reverse().toString();

        long reversed ;

        try{
            reversed = Long.parseLong(reversedStr);
        }catch(NumberFormatException e){
            return 0 ;
        }


        if (isNegative) {
            reversed = -reversed;
        }


        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }


        return (int) reversed;
    }

    public static void main(String[] args) {

        System.out.println(reverse(327));
    }
}
