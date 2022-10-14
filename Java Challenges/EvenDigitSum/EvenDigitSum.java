public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0) {
            return -1;
        }
        int lastdigit = 0;
        int sum =0;
        while (number > 0){
            lastdigit = number % 10;
           if(number % 2 == 0){
               sum += lastdigit; // sum + lastDigit = sum
               number /=10;
           }
           else{
               number /=10;
               continue;
           }

        }
        return sum;
    }
}
