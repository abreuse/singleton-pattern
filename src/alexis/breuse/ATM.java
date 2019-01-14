package alexis.breuse;

public class ATM {

    private int totalAmountWithdrawn;

    private static ATM instance;

    private ATM() {
        this.totalAmountWithdrawn = 0;
    }

    public static ATM getInstance() {
        if(instance == null)
            instance = new ATM();

        return instance;
    }

    public void withdraw(int amount) {
        this.totalAmountWithdrawn += amount;
    }

    public void printTotalAmountWithdrawn() {
        System.out.println(this.totalAmountWithdrawn);
    }
}
