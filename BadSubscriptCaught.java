import javax.naming.NameNotFoundException;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BadSubscriptCaught {

    public static void main(String[ ] args) {
        String[] names = {"Bob", "Jeff", "Alex", "Dave", "Carl", "Joe", "Alan", "Paul", "George", "Michael"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple or Challenging? (S/C)?: ");
        String ans = scanner.nextLine();
        if (Objects.equals(ans, "S")) {
            System.out.println("What number name?: ");
            int num = scanner.nextInt();
            try {
                System.out.println(names[num]);
            } catch (Exception e) {
                System.out.println("Number must be between 0-9.");
            }
        } else {
            System.out.println("What number do you want to find the square root of?: ");
            float number = scanner.nextFloat();
            if (number>=0){
                System.out.println(Math.sqrt(number));
            } else {
                throw new ArithmeticException("Cannot choose a negative number.");
            }
        }

    }
}