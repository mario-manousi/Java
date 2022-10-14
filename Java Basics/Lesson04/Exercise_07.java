class Exercise_07 {
    public static void main(String[]args) {

        for (int k = 10; k <= 20; k+=2) {
            System.out.print(k + " ");
        }
        System.out.println("");

        for(int i=19; i>=11; i-=2) {
        System.out.print(i + " ");
        }
        System.out.println("");

        for(int i=1; i<=99; i++)
            if(i%2==1 && i%3==0)
                System.out.print(i + " ");
            System.out.println();
    }
}

