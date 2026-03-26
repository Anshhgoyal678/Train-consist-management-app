import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistUC5 {

    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Consist Management System (UC5) ===");

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // محاولة إضافة عنصر مكرر (duplicate)
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}