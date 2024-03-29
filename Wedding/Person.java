//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Person {
    public String firstName;
    public String lastName;

    // Constructor that requires arguments for first and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get method for the first name
    public String getFirstName() {
        return firstName;
    }

    // Get method for the last name
    public String getLastName() {
        return lastName;
    }
}
