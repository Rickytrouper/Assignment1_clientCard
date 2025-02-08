public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;


    // Constructor
    public Card(int cardNumber, double balance, int pin, boolean status) {

        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    // Getters
    public int getCardNumber() { return cardNumber; }
    public double getBalance() { return balance; }
    public int getPin() { return pin; }
    public boolean getStatus() { return status; }

    // Setters
    public void setCardNumber(int cardNumber){this.cardNumber=cardNumber; }
    public void setBalance(double balance){this.balance=balance; }
    public void setStatus(boolean status) { this.status = status; }
    public void setPin(int pin) { this.pin = pin; }

    // Method to display card details
    public void displayCardDetails() {
        System.out.println("\nCard Details:");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Card Number", "Balance", "PIN", "Status");
        System.out.printf("%-15d %-15.2f %-15d %-15s%n",
                getCardNumber(),
                getBalance(),
                getPin(),
                (getStatus() ? "Active" : "Inactive"));}

    // Method to update card status
    public void updateCardStatus(boolean newStatus) {
        this.status = newStatus;
    }

    // Method to update card PIN
    public void updateCardPin(int newPin) {
        this.pin = newPin;
    }
}