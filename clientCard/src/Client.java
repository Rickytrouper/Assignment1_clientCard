// Client Class
public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    // Constructor
    public Client(int idNumber, String firstName, String lastName, int age, Card card) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
    }

    // Getters
    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Card getCard() {
        return card;
    }

    // toString method to display client information
    @Override
    public String toString() {
        return "Client ID: " + idNumber + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Card: [" + card.toString() + "]";
    }
}