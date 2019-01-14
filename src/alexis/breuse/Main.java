package alexis.breuse;

public class Main {

    public static void main(String[] args) {
	    ATM atm = ATM.getInstance();
	    atm.withdraw(20);

	    ATM atm2 = ATM.getInstance();
	    atm.withdraw(30);

	    //atm & atm2 = same instance
	    atm.printTotalAmountWithdrawn();
	    atm2.printTotalAmountWithdrawn();
    }
}
