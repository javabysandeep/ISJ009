package classObject;

public class BankAccount {
    int customerId;
    int accountNumber;
    String accountHolderName;
    float balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
       if(balance> amount){
           balance -= amount;
       }
    }

    public float getBalance(){
        return balance;
    }
}
