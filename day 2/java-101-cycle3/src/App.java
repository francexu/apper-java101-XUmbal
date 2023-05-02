public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        // numeric whole number datatypes: short (16 bits), int (32 bits), long (64 bits)
        // numeric decimal datatypes: double (64 bits), float (32 bits)

        float discount = 9.25f; // kailangan may f lagi
        double price = 4.45;
        int age = 20;

        allAboutNumbers(discount, price, age);

        // Strings
        String myName = "Xenia";

        loops();
    }

    public static void allAboutNumbers(float discount, double price, int age) {
        float ans = discount + age;
        System.out.println(ans);

        double newAns = discount + price;
        System.out.println(newAns);
    }

    public static void loops() {
        // while loop - prints numbers 0-9
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------");

        // do while loop - runs once before checking the condition
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        System.out.println("--------------");

        // for loop
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
    }
}
