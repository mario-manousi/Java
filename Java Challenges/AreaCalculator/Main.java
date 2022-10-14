public class Main {
    public static void main(String[] args) {

    double area = AreaCalculator.area(-1);
    if(area < 0){
        System.out.println("-1");
    }
    double rectangular = AreaCalculator.area(-1,4.0);
    if(rectangular < 0){
        System.out.println("-1");
    }
    }
}

