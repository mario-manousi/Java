


public class SecondsAndMinutesChallenge{
    private static final String Invalid_Value_Message = "Invalid value";
    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return Invalid_Value_Message;
        }

        long hours = minutes / 60;
        long remainingMin = minutes / 60;
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = hours + "m";
        if (remainingMin < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;


    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return Invalid_Value_Message;
        }

        long minutes = seconds / 60;
        long remainingSecond = seconds % 60;

        return getDurationString(minutes, remainingSecond);

    }
}

