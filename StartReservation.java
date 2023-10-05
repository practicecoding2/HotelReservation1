import java.io.*;
import java.util.*;

class StartReservation {
    public void StartUserReservation() {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> accounts = new HashMap<>();

        while (true) {
            System.out.println("1. Start Reservation");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Check for Existing Account
                    System.out.print("Do you have an account? (yes/no): ");
                    String hasAccount = scanner.nextLine().toLowerCase();

                    if (hasAccount.equals("yes")) {
                        System.out.print("Enter your account number: ");
                        String accountNumber = scanner.nextLine();

                        if (!accounts.containsKey(accountNumber)) {
                            System.out.println("Invalid account number.");
                            break;
                        }
                    } else if (!hasAccount.equals("no")) {
                        System.out.println("Invalid choice.");
                        break;
                    }

                    // Choose Preference
                    System.out.println("Choose your preference:");
                    System.out.println("1. Hotel");
                    System.out.println("2. Villa");
                    System.out.println("3. Apartment");
                    System.out.print("Enter your choice: ");
                    int preferenceChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    // Provide Reservation Details
                    System.out.print("How many members: ");
                    int members = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("How many days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Any preference for food (veg/non-veg): ");
                    String foodPreference = scanner.nextLine();

                    System.out.print("Any special arrangements: ");
                    String specialArrangements = scanner.nextLine();


                    // Create a Reservation File
                    String reservationNumber = "rs_" + UUID.randomUUID().toString();
                    createReservationFile(reservationNumber, members, days, foodPreference, specialArrangements);


                    // Update User's Account
                    if (hasAccount.equals("yes")) {
                        String accountNumber = null;
                        accounts.get(accountNumber).add(reservationNumber);
                    }

                    System.out.println("Reservation completed. Your reservation number is: " + reservationNumber);
                    break;

                case 2:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createReservationFile(String reservationNumber, int members, int days, String foodPreference, String specialArrangements) {
        try (PrintWriter writer = new PrintWriter(reservationNumber + ".json")) {
            writer.println("Reservation Number: " + reservationNumber);
            writer.println("Number of Members: " + members);
            writer.println("Number of Days: " + days);
            writer.println("Food Preference: " + foodPreference);
            writer.println("Special Arrangements: " + specialArrangements);
        } catch (FileNotFoundException e) {
            System.err.println("Error creating reservation file.");
        }
    }


}


