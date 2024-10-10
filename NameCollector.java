package mypackage;
import java.util.Scanner;
public class NameCollector {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Declare variables for first, middle, and last names
        String firstName;
        String middleName;
        String lastName;

        // Step 3: Prompt user for their first name
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        // Prompt user for their middle name
        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine();

        // Prompt user for their last name
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        // Step 4: Create a full name variable by concatenating names with spaces
        String fullName = firstName + " " + middleName + " " + lastName;

        // Step 5: Print out the full name
        System.out.println("Your full name is: " + fullName);

        // Close the scanner
        scanner.close();
    }}

