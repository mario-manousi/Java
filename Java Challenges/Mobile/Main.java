import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        class Mobile {
            double time;
            String kind;
            int sms;
            double Sub_Fixed;
            double Sub_Free;
            double payment;
            Mobile time = new Mobile();
            Mobile kind = new Mobile();
            Mobile sms = new Mobile();

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter time: ");
    time =keyboard.nextDouble();
    System.out.print("Enter number of sms:");
    sms =keyboard.nextInt();
    System.out.println("Free time = "+time);
    System.out.println("Sms cost = "+sms);


    if(time <=60000)
            payment =0;
            else if(time >60000);
            payment =time *0.02;
            break;
        return payment;
            if(sms >=0);
            sms =sms *0.08;
        break;
        return sms;
        case"free":
        if(time >=1)
            payment =time *0.02;
        break;
        return payment;
        }
    }
}