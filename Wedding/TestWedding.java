import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for data
        System.out.println("Enter details for the first person:");
        System.out.print("First Name: ");
        String brideFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String brideLastName = scanner.nextLine();

        System.out.println("\nEnter details for the second person:");
        System.out.print("First Name: ");
        String groomFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String groomLastName = scanner.nextLine();

        System.out.print("\nEnter the wedding date (YYYY-MM-DD): ");
        String weddingDateString = scanner.nextLine();
        LocalDate weddingDate = LocalDate.parse(weddingDateString);

        System.out.print("Enter the location: ");
        String location = scanner.nextLine();

        // Create a Couple object
        Couple couple = new Couple(brideFirstName, brideLastName, groomFirstName, groomLastName);

        // Create a Wedding object
        Wedding wedding = new Wedding(couple, weddingDate, location);

        // Display details
        System.out.println("\nWedding Details:");
        System.out.println("Bride: " + couple.getBride().getFirstName() + " " + couple.getBride().getLastName());
        System.out.println("Groom: " + couple.getGroom().getFirstName() + " " + couple.getGroom().getLastName());
        System.out.println("Wedding Date: " + wedding.getWeddingDate().getMonth()+" "+wedding.getWeddingDate().getDayOfMonth()+" "+wedding.getWeddingDate().getYear());
        System.out.println("Location: " + wedding.getLocation());

        scanner.close();
    }
}
