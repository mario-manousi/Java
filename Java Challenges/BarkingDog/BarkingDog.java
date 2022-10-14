public class BarkingDog {
    private static final String Invalid_Value_Message = "False";

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {


        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;

        } else{
            return false;
        }
    }
}



