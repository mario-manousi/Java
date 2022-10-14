package com.company;

public class Main {

    public static void main(String[] args) {


      int count =6;
//    while(count!=6){
//        System.out.println("Count value is " + count);
//        count++;
//    }
//    for(int i=6; i!=6; i++) {
//        System.out.println("Count value is " + count);
//    }//

//    count =6;
//    do {
//        System.out.println("Count value was " + count);
//        count++;
//
//        if(count >100){
//            break;
//        }
//    }while(count !=6);

//    count = 1;
//    while(true) {
//        if(count ==6){
//            break;
//        }
//        System.out.println("Count value is " + count);
//        count++;



//        int number = 4;
//        int finishNumber = 20;
//        int evenNumber = 0;
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number + "found: " + evenNumber + " even numbers." );

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }
    public static boolean isEvenNumber(int num){
        if((num % 2) == 0) {
            return true;
        }else{
            return false;
        }
    }
    }
