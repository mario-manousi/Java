public class Main {

    public static void main(String[] args) {
	Payment p = new Payment(2.5);
    p.print();
    Credit c = new Credit(4.5, "54545445-1221-122", "20/01/2022");
    c.print();
    Check ch = new Check(2.75, 544545, "52222/0111/2222");
    ch.print();
    }
}
