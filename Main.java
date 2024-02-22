import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double[] array1 = new double[20];
        Scanner userinput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number to add to the array:");

        for (int i = 0; i < array1.length; i++) {

            int arrayNum = i+1;
            System.out.println("Number " + arrayNum + ":");
            double current_num = userinput.nextDouble();
            if (current_num == 9999) {
                break;
            } else {
                array1[i] = current_num;
            }
        }
        System.out.println(Arrays.toString(array1));
        }
    }
