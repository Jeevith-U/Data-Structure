package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 *
 * This program demonstrates how to count the occurrence of each word from a list of sentences
 * using Java 8 Stream API.
 *
 * Approach:
 * 1. Convert each sentence to lowercase and remove punctuation using regex.
 * 2. Split each sentence into words and flatten the list into a stream of words.
 * 3. Group words using `Collectors.groupingBy` and count their occurrences using `Collectors.counting`.
 * 4. Print the resulting word-frequency map.
 */
public class CountOccaranceOfWordsFromList {

    public static void main(String[] args) {
        
        // Step 1: List of sentences
        List<String> sentences = Arrays.asList(
            "Java is awesome",
            "Java is powerful and awesome",
            "Streams are powerful"
        );
        
        // Step 2: Count word occurrences
        Map<String, Long> res = sentences.stream()
            // Convert each sentence into a stream of words
            .flatMap(s -> Arrays.stream(
                
                // Clean the sentence: convert to lowercase and remove punctuation
                s.toLowerCase()
                 .replaceAll("[^a-z ]", "") // keep only alphabets and spaces
                 .split(" ")                // split into words using space
            ))
            // Step 3: Group words and count their occurrences
            .collect(Collectors.groupingBy(
                Function.identity(),        // key: the word itself
                Collectors.counting()       // value: count of how many times it appears
            ));
        
        // Step 4: Print the result (word => frequency)
        res.entrySet().stream()
            .forEach(e -> System.out.println(e));
    }
}



