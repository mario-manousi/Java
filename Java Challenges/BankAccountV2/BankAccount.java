public class BankAccount {
    private String fullName;
    private String BankAccountNo;
    private double balance;
    private int yearsActive;

    BankAccount(String fullName, String bankAccountNo, double balance, int yearsActive) {
        this.fullName = fullName;
        this.BankAccountNo = bankAccountNo;
        this.balance = balance;
        this.yearsActive = yearsActive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }
    public  void print() {
        System.out.println("Full name:         " + fullName);
        System.out.println("Bank account no:   " + getBankAccountNo());
        System.out.println("Balance:           " + balance);
        System.out.println("Years actove:      " + yearsActive);


    }
}
