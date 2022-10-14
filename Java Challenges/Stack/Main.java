public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();

        for (int i = 1; i<=4; i++)
        s.push(i);
        System.out.println(s.pop());
        System.out.println(s.pop());

        for (int i = 5; i<= 8; i++)
        s.push(i);
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}

