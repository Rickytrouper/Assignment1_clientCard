// Card Class
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
    public int getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public boolean getStatus() {
        return status;
    }

    // Setters
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // toString method to display card information
    @Override
    public String toString() {
        return "Card Number: " + cardNumber + ", Balance: " + balance + ", PIN: " + pin + ", Status: " + status;
    }
}