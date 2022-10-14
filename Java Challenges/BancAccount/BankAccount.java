public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(123125, 2.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public BankAccount(String customerName, String email, String phoneNumber){
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Not a sufficient amount ");
        } else {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
        }
    }

    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of : " + amount + " processed. Remaining balance= " + this.balance);
        }
    }
}



