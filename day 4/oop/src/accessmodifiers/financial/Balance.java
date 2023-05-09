package accessmodifiers.financial;

public class Balance {
    int balance; // walang access modifier - accessible lang sa same package
    public int amount; // pag may public, accessible na siya sa lahat

    // pag private, accessible lang siya within the class
    private int getBalance() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 900) {
            this.amount = 900;
        } else {
            this.amount = amount;
        }
    }
}
