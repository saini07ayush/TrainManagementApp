import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Removing a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Checking existence
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Bogie List: " + passengerBogies);
    }
}