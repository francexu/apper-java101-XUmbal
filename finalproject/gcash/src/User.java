public class User {
    private static String mobileNumber;
    private static String name;
    private static double balance;

    // TODO: constructor
    public User(String mobileNumber, String name, double balance) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.balance = balance;
    }

    // TODO: Getters and Setters

    public static String getMobileNumber() {
        return mobileNumber;
    }

    public static void setMobileNumber(String mobileNumber) {
        User.mobileNumber = mobileNumber;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        User.balance = balance;
    }

    @Override
    public String toString() {
        return mobileNumber + ": " + name + " " + balance;
    }
}
