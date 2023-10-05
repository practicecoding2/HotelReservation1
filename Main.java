import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to hotel reservation system");
        System.out.println("1:create an account");
        System.out.println("2:Start your reservation");
        System.out.println("3.Cancel Reservation");
        System.out.println("4.Display all my reservations");
        System.out.println("5.please print my total bill");
        System.out.println("Please choose your Option:");
        int Option = sc.nextInt();


        switch (Option) {
            case 1 -> createAccount(sc);
            case 2 -> StartReservation(sc);
            case 3 -> CancelReservation(sc);
            case 4 -> DisplayAllReservation(sc);
            case 5 -> PrintTotalBill(sc);
            default -> System.out.println("Invalid option selected.");
        }


    }

    private static void StartReservation(Scanner sc) {
        System.out.println("start Reservation");
        StartReservation sr = new StartReservation();
        sr.StartUserReservation();



    }

    private static void PrintTotalBill(Scanner sc) {
    }

    private static void DisplayAllReservation(Scanner sc) {
    }

    private static void CancelReservation(Scanner sc) {
    }

    public static void createAccount(Scanner sc) {

        System.out.println("Enter your email: ");
        String userEmail = sc.nextLine();
        sc.nextLine();


        System.out.println("Enter your phone number: ");
        int userPhoneNumber = sc.nextInt();
        if (userPhoneNumber <= 0) {
            System.out.println("invalid phonenumber");
            return;
        }

        sc.nextLine();

        System.out.println("Enter your location: ");
        String userLocation = sc.nextLine();
    }
}

