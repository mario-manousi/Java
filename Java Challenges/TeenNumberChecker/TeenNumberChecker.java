public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
       if (isTeen(num1) || isTeen(num2) || isTeen(num3)){
           return true;
       } return false;
    }

    public static boolean isTeen(int num1){
        return (num1 >=13 && num1 <=19);
        }
    }

