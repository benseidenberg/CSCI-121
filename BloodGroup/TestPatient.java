import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient1, patient2, patient3;
        patient1 = new Patient();

        System.out.println("Enter details for the second Patient:");
        System.out.print("Enter ID number: ");
        int idNumber2 = scanner.nextInt();
        System.out.print("Enter age: ");
        int age2 = scanner.nextInt();
        System.out.println("Enter blood type (O, A, B, AB): ");
        scanner.nextLine();
        BloodData.BloodType bloodType2 = BloodData.BloodType.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor2 = scanner.nextLine();
        BloodData bloodData2 = new BloodData(bloodType2, rhFactor2);
        patient2 = new Patient(idNumber2, age2, bloodData2);

        System.out.println("Enter details for the third Patient (default BloodData values will be used):");
        System.out.print("Enter ID number: ");
        int idNumber3 = scanner.nextInt();
        System.out.print("Enter age: ");
        int age3 = scanner.nextInt();
        patient3 = new Patient(idNumber3, age3, new BloodData());

        System.out.println("Details of the first Patient (default values):");
        displayPatientDetails(patient1);
        System.out.println("Details of the second Patient:");
        displayPatientDetails(patient2);
        System.out.println("Details of the third Patient (default BloodData values):");
        displayPatientDetails(patient3);

        scanner.close();
    }

    private static void displayPatientDetails(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data: " + patient.getBloodData().getBloodType() + patient.getBloodData().getRhFactor());
    }
}
