import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {

    public static void main(String[] args) {

        // Create HashMap to store bogie and its capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management System (UC6) ===");

        // Add bogie-capacity mapping
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacities
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }
}