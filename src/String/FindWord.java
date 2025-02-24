package String;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jeevith
 *
 */

public class FindWord {
	
	public static void main(String[] args) {
        // Create an ArrayList to store 100 words
        ArrayList<String> wordList = new ArrayList<>();

        // Add 100 random 5-letter words
        for (int i = 0; i < 100; i++) {
            String randomWord = generateRandomString(5);
            wordList.add(randomWord);
        }

        // Print the list to verify
        System.out.println("Size of wordList: " + wordList.size());
        System.out.println("Contents of wordList: " + wordList);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        
        // Character pool (lowercase a-z)
        String characters = "abcdefghijklmnopqrstuvwxyz";
        
        // Generate random string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        
        return sb.toString();
	}
}


