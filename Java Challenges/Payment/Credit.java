class Credit extends Payment{
    private String number;
    private String expDate;

    public Credit(double amount, String number, String expDate) {
        super(amount);
        this.number = number;
        this.expDate = expDate;
    }
    void print() {
        System.out.println("Credit:    ");
        System.out.println("amount:     " + getAmount());
        System.out.println("number:    " + number);
        System.out.println("Expiration Date:    " + expDate);
    }
}
