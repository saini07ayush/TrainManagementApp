import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // =====================================================
        // UC2 - Passenger Bogie Management (ArrayList)
        // =====================================================
        System.out.println("\nUC2 - Passenger Bogie Management (ArrayList)");

        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Removing a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Checking if bogie exists
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));

        // Total bogies
        System.out.println("Total Passenger Bogies: " + passengerBogies.size());

        System.out.println("Final Passenger Bogie List: " + passengerBogies);

        // =====================================================
        // UC3 - Track Unique Bogie IDs (HashSet)
        // =====================================================
        System.out.println("\nUC3 - Track Unique Bogie IDs (HashSet)");

        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG104");
        bogieIDs.add("BG102"); // Duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // Check if bogie exists
        System.out.println("Contains BG101: " + bogieIDs.contains("BG101"));

        // Total unique bogies
        System.out.println("Total Unique Bogies: " + bogieIDs.size());

        // =====================================================
        // UC4 - Maintain Ordered Bogie Consist (LinkedList)
        // =====================================================
        System.out.println("\nUC4 - Maintain Ordered Bogie Consist (LinkedList)");

        List<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        // Remove first bogie
        ((LinkedList<String>) trainConsist).removeFirst();
        System.out.println("After removing first bogie: " + trainConsist);

        // Remove last bogie
        ((LinkedList<String>) trainConsist).removeLast();
        System.out.println("After removing last bogie: " + trainConsist);

        // Display final consist
        System.out.println("Final Ordered Train Consist: " + trainConsist);

        // =====================================================
        // UC5 - Preserve Insertion Order of Bogies (LinkedHashSet)
        // =====================================================
        System.out.println("\nUC5 - Preserve Insertion Order of Bogies (LinkedHashSet)");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate ignored

        // Display final formation
        System.out.println("Final Train Formation: " + trainFormation);
    }
}