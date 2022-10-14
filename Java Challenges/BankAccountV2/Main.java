public class Main {

    public static void main(String[] args) {
    BankAccount [] array = {
   new BankAccount("A","11212-2-121", 121,3),
   new BankAccount("B","32-2323-2323",555, 2),
   new BankAccount("C,","1212-12123-11", 222,3),
   new BankAccount("D", "1212-121212-121", 100, 2),
   new BankAccount("E", "1212-121212-121", 100, 2),
        };
    double max = -1;
    BankAccount m = null;
    for (var account: array) {
        if (account.getBalance() > max) {
            max = account.getBalance();
            m = account;
        }
    }

    m.print();
    }
}