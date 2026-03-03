public class Account {
    private String accountHolder;
    private double balance;
    private int pin ;

    public Account (String accountHolder , double balance , int pin){
        this.accountHolder = accountHolder;
        this.balance = balance; //'this.id' refers to the instance variable
        this.pin = pin;

    }
    public boolean verifyPin (int inputPin){
        return this.pin == inputPin ;

    }
       public void deposit (double amount){
        if (amount>0){
            balance += amount ;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        
     }
      public void withdraw (double amount){
        if(amount > balance){
            System.out.println("Insufficient balance for withdrawal.");

        } else if (amount > 0){
            balance -= amount;
            System.out.println("Withdrawal succesful balance remaining:" + balance);

        }else {
            System.out.println("Invalid withdrawal amount."); 
        }
      }
         public void checkBalance(){
            System.out.println(" Current balance:"+ balance );
         }
        



}