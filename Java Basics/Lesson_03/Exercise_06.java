class Exercise_06 {
    public static void main(String[] args)

    {
        int x = 3;
        String s;

        if (x >= 0 && x <= 5)
            s = "Less or equal than 5";
        else if (x > 5 && x <= 10)
            s = "Greater than 6 and less or equal than 10";
        else
            s = "Invalid value";
        System.out.println(s);
    }
}