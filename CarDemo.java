public class CarDemo {
    public static void main(String[] args){
        Car firstcar = new Car(2021, Model.MINIVAN, Color.BLUE);
        Car secondcar = new Car(2024, Model.CONVERTIBLE, Color.RED);
        firstcar.display();
        secondcar.display();
    }
}
