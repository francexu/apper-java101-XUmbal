package classes;

public class User {
    private String mobileNumber;
    private String name;
    private double balance;

    // TODO: constructor
    public User(String mobileNumber, String name, double balance) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.balance = balance;
    }

    // TODO: Getters and Setters

    public String getMobileNumber() {

        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    // TODO: override toString method for printing HashMap
    @Override
    public String toString() {

        return mobileNumber + ": " + name + " " + balance;
    }
}
