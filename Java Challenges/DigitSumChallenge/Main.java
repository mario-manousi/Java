public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is  " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is  " + sumDigits(-125));
        System.out.println("The sum of digits in number 4 is  " + sumDigits(4));
        System.out.println("The sum of digits in number 32123 is  " + sumDigits(32123));
    }
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
//        125 / 10 = 12 -> 12 * 10 = 120 - 125 = 5
        while (number > 0) {
//            extract the least-significat digit
            int digit = number % 10;
            sum += digit;
//            drop the least-significant digit
            number /= 10; // same as number = number / 10;
        }
        return sum;

    }
}


