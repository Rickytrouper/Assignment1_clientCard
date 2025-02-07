import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = null;


        try{
        // Prompt For Client Input details
        System.out.print("Enter Client ID Number: ");
        int idNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative.");

        // Prompt For Card Input details
        System.out.print("Enter Card Number: ");
        int cardNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");

        System.out.print("Enter PIN: ");
        int pin = Integer.parseInt(scanner.nextLine());
        if (pin < 1000 || pin > 99999) throw new IllegalArgumentException("PIN must be a 4 or 5-digit number.");

        System.out.print("Is the card active? (true/false): ");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        // Create Card and Client objects
        Card card = new Card(cardNumber, balance, pin, status);
        client = new Client(idNumber, firstName, lastName, age, card);

        // Display Client details
        client.displayClientDetails();

        // Modify Card Information
        card.updateCardStatus(true);
        card.updateCardPin(45678);

        // Display updated Card details
        System.out.println("\nUpdated Card Details:");
        card.displayCardDetails();

        scanner.close();

} catch (NumberFormatException e) {
        System.out.println("Error: Invalid number format. Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
        System.out.println("Program execution completed.");
            scanner.close();
        }
                }

// Method to get valid integer input with error handling
private static int getValidInteger(Scanner scanner) {
    while (true) {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. Please enter a valid number: ");
        }
    }
}

// Method to get valid double input with error handling
private static double getValidDouble(Scanner scanner) {
    while (true) {
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. Please enter a valid decimal number: ");
        }
    }
}
}