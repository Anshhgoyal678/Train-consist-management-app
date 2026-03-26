import java.util.*;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistUC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management System (UC7) ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort bogies by capacity (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Optional: Sort in descending order
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting (By Capacity - Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}