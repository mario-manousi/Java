import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int StandardFee = 12;
        int FreeCallSeconds = 60000;
        double CostPerSecond = 0.02;
        double CostPerSms = 0.08;
        double SubscriberFee = 0.05;
        double Vat = 0.24;
        double[] gain = new double[5];

        int TotalTimeUsedInSeconds;
        int TotalSmsUsed;

        double AmountToPayInSubscription;
        double AmountToPayFree;

        double TimeCostInSubscription = 0;
        double SmsCost;

        double TimeCostInFree;

        double CostDifference;


        for (int i = 0; i < gain.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter total time used in seconds and total number of sms sent, one after each other: ");
            TotalTimeUsedInSeconds = input.nextInt();
            TotalSmsUsed = input.nextInt();


            if (TotalTimeUsedInSeconds > FreeCallSeconds) {
                TimeCostInSubscription = (TotalTimeUsedInSeconds - FreeCallSeconds) * CostPerSecond;
            } else {
                TimeCostInSubscription = StandardFee;
            }double min = -1;
            double largest = 0;
            double secondLargest = 0;
            double positionOfLargest = 0;
            double positionOfSecondLargest = 0;
            double positionOfMin = 0;


            for (int i = 0; i < gain.length; i++) {
                if (largest < gain[i]) {
                    secondLargest = largest;
                    largest = gain[i];
                } else if (secondLargest < gain[i]) {
                    secondLargest = gain[i];
                }

                if (gain[i] < min) {
                    min = gain[i];
                    positionOfMin = i + 1;
                }
            }


            for (int i = 0; i < gain.length; i++) {
                if (largest == gain[i]) {
                    positionOfLargest = i;
                }
                if (secondLargest == gain[i]) {
                    positionOfSecondLargest = i;
                }
            }
            System.out.println("The largest number is: " + largest + " and it was at position: " + positionOfLargest);
            System.out.println("The second largest number is: " + secondLargest + " and it was at position: " + positionOfSecondLargest);

            SmsCost = TotalSmsUsed * CostPerSms;

            AmountToPayInSubscription = TimeCostInSubscription + SmsCost;
            AmountToPayInSubscription = AmountToPayInSubscription + (AmountToPayInSubscription * SubscriberFee);
            AmountToPayInSubscription = AmountToPayInSubscription + (AmountToPayInSubscription * Vat);

            TimeCostInFree = TotalTimeUsedInSeconds * CostPerSecond;
            AmountToPayFree = TimeCostInFree + SmsCost;
            AmountToPayFree = AmountToPayFree + (AmountToPayFree * SubscriberFee);
            AmountToPayFree = AmountToPayFree + (AmountToPayFree * Vat);

            CostDifference = AmountToPayFree - AmountToPayInSubscription;

            gain[i] = Math.abs(CostDifference);
        }


    }
}
