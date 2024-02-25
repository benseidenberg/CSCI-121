import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        int number_guests;
        int choices;
        DinnerParty dinnerParty = new DinnerParty();
        Party current_party = new Party();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many guests for the party?: ");
        current_party.setGuest(scanner.nextInt());
        System.out.println("Number of guests: " + current_party.getNumGuests());
        current_party.displayInvitation();

        System.out.println("How many guests for the dinner party?: ");
        dinnerParty.setGuest(scanner.nextInt());
        System.out.println("What item would you like served? Type '1' for BBQ Ribs, or '2' for Chicken Alfredo: ");
        dinnerParty.setDinnerChoice(scanner.nextInt());
        System.out.println("The dinner party has " + dinnerParty.getNumGuests()+ " guests.");
        System.out.println(dinnerParty.getDinnerChoice() + " will be served!");
        dinnerParty.displayInvitation();

    }
}
