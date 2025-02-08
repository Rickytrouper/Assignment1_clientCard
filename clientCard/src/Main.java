import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt Client For Details

        // Using While Loop And Try Catch For Error Handling
        int idNumber=0;
        while (true) {
            try {
                System.out.print("Enter Client ID Number (e.g., 12345): ");
                String idInput = scanner.nextLine();
                idNumber = Integer.parseInt(idInput);

                // Validate ID number Using If Statement
                if (idNumber <= 0 || idInput.length() < 4 || idInput.length() > 5) {
                    throw new IllegalArgumentException("ID number must be positive and 4 to 5 digits long.");
                }
                break; // Exit the loop if valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric ID number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        //Prompt For First Name
        System.out.print("Enter First Name (e.g., John): ");
        String firstName = scanner.nextLine();

        //Prompt For Last Name
        System.out.print("Enter Last Name (e.g., Doe): ");
        String lastName = scanner.nextLine();

        // Prompt For Age
        // Using While Loop And Try Catch For Error Handling

        int age=0;
        while (true) {
            try {
                System.out.print("Enter Age (e.g., 30): ");
                age = Integer.parseInt(scanner.nextLine());

                // Validate Age Using The If Statement
                if (age <= 0) {
                    throw new IllegalArgumentException("Age must be a positive number.");
                }
                break; // Exit the loop if valid
                } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age.");
                } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Prompt For Card Details
        // Using While Loop And Try Catch For Error Handling
        int cardNumber=0;
        while (true) {
            try {
                System.out.print("Enter Your 10 Digit Card Number (e.g., 0123456789): ");
                String cardNumberInput =scanner.nextLine();

                // Validate Card Number Using If Statement
                if (cardNumberInput.length() < 10 ){
                    throw new IllegalArgumentException("Card number must be 10 digits long.");
                }
                // Convert the string input to a int
                cardNumber = Integer.parseInt(cardNumberInput);

                // check if number is positive
                if (cardNumber <=0 ){
                    throw new IllegalArgumentException("Card number must be a positive value.");
                }
                break; // Exit the loop if valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid card number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        // Prompt User For Balance
        // Using While Loop And Try Catch For Error Handling
        double balance = 0;
        while (true) {
            try {
                System.out.print("Enter Balance (e.g., 1500.75): ");
                balance = Double.parseDouble(scanner.nextLine());

                // Validate Balance
                if (balance < 0) {
                    throw new IllegalArgumentException("Balance cannot be negative.");
                }
                break; // Exit the loop if valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric balance.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
            // Prompt User For Pin
            // Using While Loop And Try Catch For Error Handling
        int pin = 0;
        while (true) {
            try {
                System.out.print("Please Enter Your 5 Digit PIN (must be positive): ");
                String pinInput = scanner.nextLine();

                // If Statement Use To Check The Lenght Of Pin
                if (pinInput.length() != 5 ) {
                    throw new IllegalArgumentException("PIN must be 5 digits long.");
                }
                pin = Integer.parseInt(pinInput); // Convert to integer if valid
                if (pin <= 0) {
                    throw new IllegalArgumentException("PIN must be positive.");
                }
                break; // Exit loop if valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid Pin.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Prompt for card Stataus
        String statusInput;
        boolean status = false;
        while (true) {
            System.out.print("Is Your card active? (Y/N, e.g., Y): ");

            // Use trim to remove white space and toUpper for case handling.
            statusInput = scanner.nextLine().trim().toUpperCase();

            if (statusInput.equals("Y")) {
                status = true;  // Active
                break;          // Exit the loop
            } else if (statusInput.equals("N")) {
                status = false; // Inactive
                break;          // Exit the loop
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }

        // Create Card and Client objects
        Card card = new Card(cardNumber, balance, pin, status);
        Client client = new Client(idNumber, firstName, lastName, age, card);

        // Call the display methods from the Client class
        client.displayClientDetails();

        // Modify Card attributes
        card.updateCardStatus(true);
        card.updateCardPin(45678);

        // Display updated Card details
        System.out.println("\nUpdated Card Details:");
        card.displayCardDetails();
        scanner.close();
    }
}