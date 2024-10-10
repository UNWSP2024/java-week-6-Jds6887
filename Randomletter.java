package mypackage;

import java.util.Random;

public class Randomletter {
    public static void main(String[] args) {
        // Step 1: Generate initial random word
        String initialWord = generateRandomWord();
        System.out.println("Word #1: " + initialWord);

        // Store current word for modification
        String currentWord = initialWord;

        // Step 2: Modify the word 19 times
        for (int i = 0; i < 19; i++) {
            currentWord = modifyRandomCharacter(currentWord);
            System.out.println("Word #" + (i + 2) + ": " + currentWord);
        }
    }

    // Method to generate a random word of length 10
    private static String generateRandomWord() {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + rand.nextInt(26)); // Generates a char from 'a' to 'z'
            sb.append(randomChar);
        }
        
        return sb.toString();
    }

    // Method to modify one random character in the word
    private static String modifyRandomCharacter(String word) {
        Random rand = new Random();
        
        int indexToModify = rand.nextInt(word.length()); // Selects a random index
        char[] chars = word.toCharArray(); // Convert string to char array
        
        // Generate a new random character different from the original one at indexToModify
        char newChar;
        do {
            newChar = (char) ('a' + rand.nextInt(26));
        } while (newChar == chars[indexToModify]); // Ensure it's different
        
        chars[indexToModify] = newChar; // Replace old character with new one
        
        return new String(chars); // Convert back to string
    }
}


