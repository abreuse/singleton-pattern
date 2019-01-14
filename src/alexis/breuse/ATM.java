package alexis.breuse;

public class ATM {

    private static ATM instance;

    private ATM() {}

    public static ATM getInstance() {
        if(instance == null)
            instance = new ATM();

        return instance;
    }
}
