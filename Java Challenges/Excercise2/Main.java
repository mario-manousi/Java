public class Main {

    public static void main(String[] args) {
        BankAccount[] array = {
                new BankAccount("Mario M", "1213-131313-1334", 100, 5),
                new BankAccount("M  M", "1213-123313-1334", 245, 5),
                new BankAccount("Ma o M", "123233-131313-1334", 4100, 5),
                new BankAccount("Ma  io M", "1213-132232313-1334", 400, 5),
        };
        double max = -1;
        BankAccount m = null;
        for (var account : array) {
            if (account.getBalance() > max) {
                max = account.getBalance();
                m = account;
        }
    }m.print();
    }
}
