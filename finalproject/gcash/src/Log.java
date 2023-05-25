public class Log {
    private static User sender;
    private static User recipient;
    private static double balance;

    public Log(User sender, User recipient, double balance) {
        this.sender = sender;
        this.recipient = recipient;
        this.balance = balance;
    }

    public static User getSender() {
        return sender;
    }

    public static User getRecipient() {
        return recipient;
    }

    public static double getBalance() {
        return balance;
    }
}
