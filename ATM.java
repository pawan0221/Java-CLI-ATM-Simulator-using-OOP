import java.util.*;
 public class ATM {
    private Account account;
    private Scanner sc ;
     public ATM(Account account){
        this.account = account;
        sc = new Scanner(System.in);

     }
     public  void start(){
        System.out.println("Welcone  to the ATM");

        System.out.println(" enter your pin");
        int inputPin = sc.nextInt();
        if (!account.verifyPin(inputPin)){
            System.out.println("invalid pin. cannot access the account");
            return;
        }
              int choice;

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);
    }
}