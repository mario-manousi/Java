class Exercise_07 {
    public static void main(String[] args) {
        int hour, minutes, seconds;
        hour = 1;
        minutes = 3;
        seconds = 9;

        if (!(hour >= 0 && hour <= 23))
            System.out.println("Invalid value");
        else if (!(minutes <= 0 && minutes >= 59))
            System.out.println("Invalid value");
        else if(!(seconds <= 0 && seconds >= 59))
            System.out.println("Invalid value");
        else
            if(hour>=0 && hour<=9)
                System.out.print("0");
            System.out.print(hour + ":");
            if(minutes >=0 && minutes <=9)
                System.out.print("0");
            System.out.print(minutes + ":");
            if(seconds >=0 && seconds <=9)
                System.out.print("0");
            System.out.print(seconds);

    }
}