import classes.Action;

import java.util.Scanner;

public class App {
    private static Action action = new Action();
    private static double DEFAULT_BALANCE = 100.00;
    private static boolean isRunning = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO: add existing users
        addExistingUsers();

        // TODO: display welcome message
        System.out.println("Welcome to GCash Share-A-Load!");

        while(isRunning) {
            System.out.println("Press (R) if you want to register a new user, (S) to share a load, and (Q) to quit.");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("r")) {
                // TODO: Enter credentials to register
                System.out.println("Enter mobile number: ");
                String mobileNumber = scanner.nextLine();
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                action.registerUser(mobileNumber, name, DEFAULT_BALANCE);
            } else if (choice.equals("s")) {
                // TODO: Enter credentials to share load
                System.out.println("Enter sender's mobile number: ");
                String senderNumber = scanner.nextLine();
                System.out.println("Enter recipient's mobile number: ");
                String recipientNumber = scanner.nextLine();
                System.out.println("Enter amount: ");
                double amount = scanner.nextDouble();
                action.sendLoad(senderNumber, recipientNumber, amount);
                action.displayUsers();
                isRunning = false;
            } else if (choice.equals("q")) {
                System.out.println("Thank you for using GCash Share-A-Load!");
                System.out.println("Exiting program...");
                isRunning = false;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // TODO: add existing users
    private static void addExistingUsers() {
        action.registerUser("09175861661", "Bob", DEFAULT_BALANCE);
        action.registerUser("09175861662", "Marley", DEFAULT_BALANCE);
        action.registerUser("09175861663", "Seth", DEFAULT_BALANCE);
        action.registerUser("09175861664", "Ryan", DEFAULT_BALANCE);
        action.registerUser("09175861665", "Fritz", DEFAULT_BALANCE);
    }
}
