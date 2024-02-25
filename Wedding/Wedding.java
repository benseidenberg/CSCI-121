import java.time.LocalDate;

public class Wedding {
    // Fields for the wedding date, Couple, and location
    public LocalDate weddingDate;
    public Couple couple;
    public String location;

    // Constructor that requires a Couple, a LocalDate, and a String for the location
    public Wedding(Couple couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    // Get method to return the Couple
    public Couple getCouple() {
        return couple;
    }

    // Get method to return the wedding date
    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    // Get method to return the location
    public String getLocation() {
        return location;
    }
}
