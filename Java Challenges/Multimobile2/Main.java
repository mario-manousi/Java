import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        class Multimobile2 {
            double[] gain;

            public Multimobile2() {
                this.gain = new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            }

            public int read_time() {
                System.out.println("Please enter the current time in seconds: ");
                Scanner input = new Scanner(System.in);
                int currentTimeInSeconds = input.nextInt();
                return currentTimeInSeconds;
            }

            public int read_messages() {
                System.out.println("Please enter the number of messages: ");
                Scanner input = new Scanner(System.in);
                int ammountOfSms = input.nextInt();
                return ammountOfSms;
            }

            public double calculate_invoice(int speakTime, int smsCount) {
                double timeCost;
                if (speakTime > 60000) {
                    timeCost = (60000 - speakTime) * 0.2;
                } else {
                    timeCost = 12;
                }
                return timeCost + (smsCount * 0.08);
            }

            public double calculate_invoice_free(int speakTime, int smsCount) {
                double timeCost;
                double smsCost;
                timeCost = speakTime * 0.02;
                smsCost = smsCount * 0.08;
                return timeCost + smsCost;
            }

            public void calc_largest(double[] gain) {
                double min = -1;
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
            }
        }


        Multimobile2 mb2 = new Multimobile2();
            int time;
            int messages;
            double invoice;
            double invoiceFree;
            for (int i = 0; i < 5; i++) {
                time = mb2.read_time();
                messages = mb2.read_messages();
                invoice = mb2.calculate_invoice(time, messages);
                invoiceFree = mb2.calculate_invoice_free(time, messages);
                mb2.gain[i] = Math.round(invoice - invoiceFree);
            }
            mb2.calc_largest(mb2.gain);
        }
    }



