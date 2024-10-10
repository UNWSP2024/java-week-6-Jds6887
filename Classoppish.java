package mypackage;

import java.util.Scanner;

public class Classoppish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an English sentence:");
        String input = scanner.nextLine();
        
        // Convert the input string to Oppish
        convertToOppish(input);
        
        scanner.close();
    }

    private static void convertToOppish(String s) {
        // Define vowels including 'y'
        String vowels = "aeiouyAEIOUY";
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if the character is a consonant
            if (Character.isLetter(currentChar) && vowels.indexOf(currentChar) == -1) {
                // Print the consonant followed by "opp"
                System.out.print(currentChar + "opp");
            } else {
                // Print the vowel or underscore as it is
                System.out.print(currentChar);
            }
            
            // Avoid adding "opp" after the last consonant in a word
            if (i < s.length() - 1 && Character.isLetter(s.charAt(i + 1)) && 
                vowels.indexOf(s.charAt(i + 1)) == -1) {
                continue;
            }
        }
    }
}