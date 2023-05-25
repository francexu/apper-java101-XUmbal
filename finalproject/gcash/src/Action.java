import java.util.*;

public class Action {
    // TODO: Create HashMap
    private static Map<String, User> users;

    public Action() {
        this.users = new HashMap<String, User>();
    }

    // TODO: Validate user
    public void registerUser(String mobileNumber, String name, double balance) {
        try {
            if (users.containsKey(mobileNumber)) {
                throw new Exception("Number already exists.");
            } else if (name.isEmpty()) {
                throw new Exception("Name cannot be blank.");
            } else {
                users.put(mobileNumber, new User(mobileNumber, name, balance));
            }
        } catch (Exception e) {
            System.out.println("Error registering user. " + e.getMessage());
        }
    }

    // TODO: Send load
    public void sendLoad(String senderMobileNumber, String recipientMobileNumber, double amount) {
        User sender = users.get(senderMobileNumber);
        User recipient = users.get(recipientMobileNumber);
        // TODO: check if sender balance is greater than or equal amount
        try {
            if (!users.containsKey(senderMobileNumber)) {
                throw new Exception("Sender is not registered.");
            } else if (!users.containsKey(recipientMobileNumber)) {
                throw new Exception("Recipient is not registered.");
            } else if (senderMobileNumber.equals(recipientMobileNumber)) {
                throw new Exception("Sender and recipient should not be the same.");
            } else if (sender.getBalance() < amount) {
                throw new Exception("Insufficient balance.");
            } else if (senderMobileNumber.isEmpty()) {
                throw new Exception("Sender's mobile number cannot be blank.");
            } else if (recipientMobileNumber.isEmpty()) {
                throw new Exception("Recipient's mobile number cannot be blank.");
            }
            else {
                double newSenderBalance = sender.getBalance() - amount;
                double newRecipientBalance = recipient.getBalance() + amount;
                System.out.println(sender.getName() + " " + newSenderBalance);
                System.out.println(recipient.getName() + " " + newRecipientBalance);
                System.out.println("Amount of " + amount + " was SUCCESSFULLY loaded to " + recipientMobileNumber + " (" + recipient.getName() + ")" + " from " + senderMobileNumber + " (" + sender.getName() + ").");
            }
        } catch (Exception e) {
            System.out.println("Unable to send load. " + e.getMessage());
        }
    }

    public void displayUsers() {
        System.out.println("CURRENT BALANCE");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
