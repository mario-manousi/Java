public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int) (num1 * 1000d);
        num2 = (int) (num2 * 1000d);
        if (Math.round(num1) == Math.round(num2)) {
            return true;
        } else {

            return false;
        }
    }
}


