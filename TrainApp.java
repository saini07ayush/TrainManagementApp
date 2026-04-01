import java.util.ArrayList;
import java.util.HashSet;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // -------------------------------
        // UC2: Passenger Bogies using ArrayList
        // -------------------------------
        System.out.println("\nUC2: Passenger Bogie Management (ArrayList)");

        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check if bogie exists
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));

        // Total number of bogies
        System.out.println("Total Passenger Bogies: " + passengerBogies.size());

        System.out.println("Final Passenger Bogie List: " + passengerBogies);

        // -------------------------------
        // UC3: Unique Bogie IDs using HashSet
        // -------------------------------
        System.out.println("\nUC3: Track Unique Bogie IDs (HashSet)");

        HashSet<String> bogieIDs = new HashSet<>();

        // Adding Bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG104");
        bogieIDs.add("BG102"); // Duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // Check if a bogie ID exists
        System.out.println("Contains BG101: " + bogieIDs.contains("BG101"));

        // Total unique bogies
        System.out.println("Total Unique Bogies: " + bogieIDs.size());
    }
}