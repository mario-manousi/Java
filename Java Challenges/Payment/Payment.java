public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    void print(){
        System.out.println("Payment:    ");
        System.out.println("amount:     " + amount);
    }
}
