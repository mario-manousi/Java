import java.util.Scanner;
class Example22 {
    public static void main(String[] args) {
        int num1, num2;
        DoubleOp myObj = new DoubleOp();
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("enter 1st integer:");
        num1 = keyboard.nextInt();
        System.out.print("enter 2nd integer:");
        num2 = keyboard.nextInt();
        System.out.print("Sum= " + myObj.addDouble(num1, num2));
        System.out.print("Div= " + myobj.divDouble(num1, num2));
    }
}