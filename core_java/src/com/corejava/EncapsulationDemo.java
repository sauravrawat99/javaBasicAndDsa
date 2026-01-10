package core_java.src.com.corejava;

public class EncapsulationDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolderName("Rahul");
        account.setBalance(5000);

        System.out.println(account.getAccountHolderName());
        System.out.println(account.getBalance());
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    // Setter
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    // Getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
