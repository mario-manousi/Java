public class Main {
    public static void main(String[] args) {
//        int value = 3;
//        if(value==1){
//            System.out.println("Value was 1");
//        }else if(value==2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue =6;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3 or 5");
                break;
        }

//      Challenge
        char var= 'D';
        switch(var){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(var + " was found");
                break;
            default:
                System.out.println("Value not found");
                break;
        }
        String month = "JuNE";
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
