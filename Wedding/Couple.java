public class Couple {
    public Person bride;
    public Person groom;

    // Constructor that requires two Person objects
    public Couple(String brideFirstname, String brideLastname, String groomFirstname, String groomLastname) {
        this.bride = new Person(brideFirstname, brideLastname);

        this.groom = new Person (groomFirstname, groomLastname);
    }

    // Get method to return the Person object representing the bride
    public Person getBride() {
        return bride;
    }

    // Get method to return the Person object representing the groom
    public Person getGroom() {
        return groom;
    }
}
