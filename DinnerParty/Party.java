//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Party {
    int number_guests;

    public void setGuest(int num){
        number_guests = num;
    }
    public int getNumGuests(){
        return number_guests;
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }
}