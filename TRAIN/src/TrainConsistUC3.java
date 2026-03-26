import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistUC3 {

    public static void main(String[] args) {

        // Create a HashSet to store unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System (UC3) ===");
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input Bogie IDs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = scanner.nextLine();

            boolean added = bogieIds.add(id);

            if (added) {
                System.out.println("Bogie " + id + " added successfully.");
            } else {
                System.out.println("Duplicate Bogie ID! " + id + " ignored.");
            }
        }

        // Display unique Bogie IDs
        System.out.println("\n=== Final Unique Bogie IDs ===");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        scanner.close();
    }
}