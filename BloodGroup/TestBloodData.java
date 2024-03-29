import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BloodData bloodData1, bloodData2;

        System.out.println("Enter details for the first BloodData object:");
        System.out.print("Enter blood type (O, A, B, AB): ");
        BloodData.BloodType bloodType = BloodData.BloodType.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();
        bloodData1 = new BloodData(bloodType, rhFactor);
        bloodData2 = new BloodData();

        System.out.println("Details of the first BloodData object:");
        displayBloodDataDetails(bloodData1);
        System.out.println("Details of the second BloodData object (default values):");
        displayBloodDataDetails(bloodData2);

        bloodData2.setBloodType(bloodType);
        bloodData2.setRhFactor(rhFactor);

        System.out.println("After changing values in the default object:");
        displayBloodDataDetails(bloodData2);

        scanner.close();
    }
    private static void displayBloodDataDetails(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType() + ", Rh Factor: " + bloodData.getRhFactor());
    }
}
