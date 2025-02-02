import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt For Client Details
        System.out.print("Enter Client ID Number: ");
        int idNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        // Prompt For Card Details
        System.out.print("Enter Card Number: ");
        int cardNumber = scanner.nextInt();

        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        System.out.print("Is the Card Active (true/false): ");
        boolean status = scanner.nextBoolean();

        // Create Objects For Card and Client
        Card card = new Card(cardNumber, balance, pin, status);
        Client client = new Client(idNumber, firstName, lastName, age, card);

        // Calling The Display Client and Card details Method
        displayClientDetails(client);

        scanner.close();
    }

    // Display Client Details Method
    public static void displayClientDetails(Client client) {
        System.out.println(client.toString());
    }
}