import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt For Client Input details
        System.out.print("Enter Client ID Number: ");
        int idNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        // Prompt For Card Input details
        System.out.print("Enter Card Number: ");
        int cardNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter PIN: ");
        int pin = Integer.parseInt(scanner.nextLine());

        System.out.print("Is the card active? (true/false): ");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        // Create Card and Client objects
        Card card = new Card(cardNumber, balance, pin, status);
        Client client = new Client(idNumber, firstName, lastName, age, card);

        // Display Client details
        client.displayClientDetails();

        // Modify Card Information
        card.updateCardStatus(true);
        card.updateCardPin(45678);

        // Display updated Card details
        System.out.println("\nUpdated Card Details:");
        card.displayCardDetails();

        scanner.close();
    }
}