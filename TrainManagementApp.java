import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // =====================================================
        // UC2 - Passenger Bogie Management (ArrayList)
        // =====================================================
        System.out.println("\nUC2 - Passenger Bogie Management (ArrayList)");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));
        System.out.println("Total Passenger Bogies: " + passengerBogies.size());

        System.out.println("Final Passenger Bogie List: " + passengerBogies);

        // =====================================================
        // UC3 - Track Unique Bogie IDs (HashSet)
        // =====================================================
        System.out.println("\nUC3 - Track Unique Bogie IDs (HashSet)");

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG104");

        System.out.println("Unique Bogie IDs: " + bogieIDs);
        System.out.println("Contains BG101: " + bogieIDs.contains("BG101"));
        System.out.println("Total Unique Bogies: " + bogieIDs.size());

        // =====================================================
        // UC4 - Maintain Ordered Bogie Consist (LinkedList)
        // =====================================================
        System.out.println("\nUC4 - Maintain Ordered Bogie Consist (LinkedList)");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        ((LinkedList<String>) trainConsist).removeFirst();
        System.out.println("After removing first bogie: " + trainConsist);

        ((LinkedList<String>) trainConsist).removeLast();
        System.out.println("After removing last bogie: " + trainConsist);

        System.out.println("Final Ordered Train Consist: " + trainConsist);

        // =====================================================
        // UC5 - Preserve Insertion Order (LinkedHashSet)
        // =====================================================
        System.out.println("\nUC5 - Preserve Insertion Order of Bogies (LinkedHashSet)");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // Duplicate ignored

        System.out.println("Final Train Formation: " + trainFormation);

        // =====================================================
        // UC6 - Map Bogie to Capacity (HashMap)
        // =====================================================
        System.out.println("\nUC6 - Map Bogie to Capacity (HashMap)");

        HashMap<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);
        capacityMap.put("Cargo", 100);

        // Display bogie and capacity using entrySet()
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}