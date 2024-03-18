public class Car {
    private int year;
    private Model model; //Notice Model is not a type just like int.
    private Color color;
    public Car(int yr, Model m, Color c){
        year = yr;
        model = m;
        color = c;
    }
    public void display(){
        System.out.println("Car is a " + year + " "  + color + " "+ model);
    }
}
