class Check extends Payment{
    private int number;
    private String bankCode;

    public Check(double amount, int number, String bankCode) {
        super(amount);
        this.number = number;
        this.bankCode = bankCode;
    }

    void print() {
        System.out.println("Check:    ");
        System.out.println("amount:     " + getAmount());
        System.out.println("number:    " + number);
        System.out.println("Bank Code:    " + bankCode);
    }
}
