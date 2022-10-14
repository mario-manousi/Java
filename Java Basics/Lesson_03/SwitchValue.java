 class SwitchValue {
    public static void main(String[] args)
    {
        int x=3;
        String s;
        switch(x) {
            case 1:
                s="one";
                break;
            case 2:
                s="two";
                break;
            case 3:
                s="three";
                break;
            default:
                s="Invalid value..";
        }
        System.out.println("Value in text: " + s);
    }
}
