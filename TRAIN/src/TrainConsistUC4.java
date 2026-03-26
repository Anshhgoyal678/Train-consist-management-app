import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        // Create LinkedList to maintain train order
        LinkedList<String> train = new LinkedList<>();

        System.out.println("=== Train Consist Management System (UC4) ===");

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Display final ordered consist
        System.out.println("\n=== Final Train Consist ===");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}