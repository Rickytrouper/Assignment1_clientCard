public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card; // Association with Card class

    // Constructor
    public Client(int idNumber, String firstName, String lastName, int age, Card card) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
    }

    // Getters
    public int getIdNumber() { return idNumber; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public Card getCard() { return card; }

    // Setters
    public void setIdNumber(int idNumber) { this.idNumber = idNumber; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }

    // Method to display client details
    public void displayClientDetails() {
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Client ID", "First Name", "Last Name", "Age");
        System.out.printf("%-15d %-15s %-15s %-15d%n", idNumber, firstName, lastName, age);
        System.out.println("\nCard Details:");
        card.displayCardDetails();
    }
}