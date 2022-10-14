public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number <0) {
            return -1;
        }

        int firstDigit = number % 10;
        int sum = 0;
        while(number > 9) {
            number /= 10;
            int lastDigit = number;
            sum = firstDigit + lastDigit;

        }
        return  sum;
    }

}
