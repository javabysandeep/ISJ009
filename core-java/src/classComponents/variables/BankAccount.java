package classComponents.variables;

public class BankAccount {

    //instance variables
    int customerId;
    int accountNumber;
    String customerName;
    float balance;
    //static variable
    static String BANK_NAME = "SBI";

    void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static String getBankName() {
        return BANK_NAME;
    }

    public static void setBankName(String bankName) {
        BANK_NAME = bankName;
    }
}
