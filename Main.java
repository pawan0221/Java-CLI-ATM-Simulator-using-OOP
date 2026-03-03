public class Main {

    public static void main(String[] args) {

        Account account = new Account("Pawan", 10000, 1234);
        ATM atm = new ATM(account);

        atm.start();
    }
}