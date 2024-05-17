package classComponents.variables;

public class Demo1 {
    public static void main(String[] args) {
        //how to access static variable --> ClassName.StaticVariableName
        System.out.println(BankAccount.BANK_NAME);

        //how to access instance variables --> referenceName.instanceVariableName
        BankAccount bankAccount = new BankAccount();
        bankAccount.customerId = 101;
        bankAccount.accountNumber = 123;
        bankAccount.customerName = "rohan";
        bankAccount.balance = 1000;
        //bankAccount --> is a reference variable
        //new BankAccount() ---> this is an object
        // to create object we use new keyword and constructor call
        //IQ : how many ways are there to create object?
        System.out.println(bankAccount.customerId);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.customerName);
        System.out.println(bankAccount.balance);
    }
}
