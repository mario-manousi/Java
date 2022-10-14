class Nestedloops {
    public static void  main(String[]args) {
        for(int i=1; i<=10; i++) {
            int j;
            for(j=1; j<=10; j++)
            System.out.println(i + "*" + j +"=" + i * j);
        }
        System.out.println("==========");
    }
}
