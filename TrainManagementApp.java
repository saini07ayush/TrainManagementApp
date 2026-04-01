import java.util.*;

// Bogie class for UC7
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display bogie details
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // =====================================================
        // UC2 - ArrayList
        // =====================================================
        System.out.println("\nUC2 - Passenger Bogie Management (ArrayList)");

        ArrayList<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies: " + passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("After Removal: " + passengerBogies);
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));
        System.out.println("Total Passenger Bogies: " + passengerBogies.size());

        // =====================================================
        // UC3 - HashSet
        // =====================================================
        System.out.println("\nUC3 - Unique Bogie IDs (HashSet)");

        HashSet<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate

        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // =====================================================
        // UC4 - LinkedList
        // =====================================================
        System.out.println("\nUC4 - Ordered Train Consist (LinkedList)");

        List<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Consist: " + trainConsist);

        trainConsist.add(2, "Pantry Car");
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("Final Consist: " + trainConsist);

        // =====================================================
        // UC5 - LinkedHashSet
        // =====================================================
        System.out.println("\nUC5 - Train Formation (LinkedHashSet)");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // Duplicate ignored

        System.out.println("Final Formation: " + trainFormation);

        // =====================================================
        // UC6 - HashMap
        // =====================================================
        System.out.println("\nUC6 - Map Bogie to Capacity (HashMap)");

        HashMap<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // =====================================================
        // UC7 - Sort Bogies by Capacity (Comparator)
        // =====================================================
        System.out.println("\nUC7 - Sort Bogies by Capacity (Comparator)");

        List<Bogie> bogieList = new ArrayList<>();

        // Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        // Sort using Comparator
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies Sorted by Capacity:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}