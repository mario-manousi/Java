public class SharedDigit {
    public static void main(String[] args) {
        boolean num = hasSharedDigit(9, 99);
        System.out.println(num);
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        //variables
        int lastDigit1 = 0; //last digit of first number
        int lastDigit2 = 0; //last digit of second number
        int value = num2; // original

        //range
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            while (num1 > 0) {
                lastDigit1 = num1 % 10;
                System.out.println("Number 1 last digit :" + lastDigit1);

                do {
                    lastDigit2 = num2 % 10;
                    System.out.println("Number 2 last digit: " + lastDigit2);

                    if (lastDigit1 == lastDigit2) {
                        return true;
                    } else {
                        num2 /= 10;
                    }
                } while (num2 > 0);
                num2 = value;
                num1 /= 10;
            }

        }
        return false;
    }
}

//    public static boolean hasSharedDigit(int x,int y) {
//        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
//            return false;
//        }else {
//            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
//        }
//    }
//
//    When we break it down, it looks like this:
//
//        [x / 10] = [first digit of x]
//
//        [y / 10] = [first digit of y]
//
//        - when we divide a number by 10, it removes the last digit and we are left with only the first digit. eg. 45 / 10 = 4.
//
//
//
//        [x % 10] = [last digit of x]
//
//        [y % 10] = [last digit of y]
//
//        - when we take the modulo of a number using 10, it extracts the last digit. eg. 68 % 10 = 8.
//
//
//
//        So when we put it all together, we get:
//
//        return(([first digit of x] == [first digit of y]) ||
//        ([first digit of x] == [last digit of y]) ||
//        ([first digit of y] == [last digit of x]) ||
//        ([last digit of x] == [last digit of y]));
//
//
//        eg. x = 23, y = 13
//
//        return((2 == 1) || (2 == 3) || (1 == 3) || (3 == 3));
//
//
//        And the if statement is just checking whether x and y are in the range of 10 and 99.
//
//
//
//
//
//        [EDIT]
//
//        note that the explanation above only works if y and x only have 2 digits.
