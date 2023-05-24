import java.util.Scanner;

public class App {
    private bool isLoading = true;

    public static void main(String[] args) {
        // TODO: add existing users

        // TODO: display landing page
        System.out.println("Welcome to GCash Share-a-Load!");

        while(isLoading) {
            // TODO accept user input
            System.out.println("Press 'R' to register an account and 'S' to share a load.");
            Scanner scanner = new Scanner(System.in);
            String stateChoice = scanner.next();

            // TODO handle user input if stateChoice is 'r'
            if (stateChoice.toLowerCase().equals('r')) {
                System.out.println("Enter mobile number:");
            }
        }

    }
}