import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 20000; i++)
            list.add(Math.random());
        System.out.println("Random list: \t");
        System.out.println(list);


        System.out.println(" ");

        // Print shuffled collection
        System.out.println("Selection sort Shuffled array:");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("");


        System.out.println("Sorted in ascending order:");
        Collections.sort(list);
        // Print sorted in ascending order collection
        System.out.println(list);
        System.out.println("");
        System.out.println("Sorted in descending order:");
        Collections.reverse(list);
        System.out.println(list);


        long startTime = System.nanoTime();

        SelectionSort.selectionSort(list);

        long endTime = System.nanoTime();


        // Print sorted collection
        System.out.println("");
        System.out.println("Selection sorted array:");
        System.out.println(list);
        System.out.println("");
        System.out.println("End time:");
        System.out.println(endTime);
        System.out.println("");
        System.out.println("Start time:");
        System.out.println(startTime);
        System.out.println("");
        // Print runtime in seconds
        System.out.println("Selection Sort runtime: " + (endTime - startTime));
        System.out.println("\n");


        //Insertion sort

        //Insertion sort algorithm
        // Shuffle array
        Collections.shuffle(list);
        System.out.println(" ");

        // Print shuffled collection
        System.out.println("Insertion sort Shuffled array:");
        System.out.println(list);
        System.out.println("");


        System.out.println("Sorted in ascending order:");
        Collections.sort(list);
        // Print sorted in ascending order collection
        System.out.println(list);
        System.out.println("");
        System.out.println("Sorted in descending order:");
        Collections.reverse(list);
        // Print sorted in descending order collection
        System.out.println(list);


        long startTime1 = System.nanoTime();
        insertionSort.insertionSortArrayList(list);
        long endTime1 = System.nanoTime();

        // Print sorted collection
        System.out.println("");
        System.out.println("Insertion sorted array:");
        System.out.println(list);
        System.out.println("");
        System.out.println("End time:");
        System.out.println(endTime);
        System.out.println("");
        System.out.println("Start time:");
        System.out.println(startTime);
        System.out.println("");
        // Print runtime in seconds
        System.out.println("Insertion Sort runtime: " + (endTime1 - startTime1));
        System.out.println("\n");


        // Bubble sort algorithm
        // Driver method to test above
        Collections.shuffle(list);
        System.out.println(" ");

        // Print shuffled collection
        System.out.println("Bubble sort Shuffled array:");
        System.out.println(list);
        System.out.println("");


        System.out.println("Sorted in ascending order:");
        Collections.sort(list);
        // Print sorted in ascending order collection
        System.out.println(list);
        System.out.println("");
        System.out.println("Sorted in descending order:");
        Collections.reverse(list);
        // Print sorted in descending order collection
        System.out.println(list);


        long startTime2 = System.nanoTime();
        bubbleSort.bubbleSortArrayList(list);
        long endTime2 = System.nanoTime();

        // Print sorted collection
        System.out.println("");
        System.out.println("Bubble sorted array:");
        System.out.println(list);
        System.out.println("");
        System.out.println("End time:");
        System.out.println(endTime);
        System.out.println("");
        System.out.println("Start time:");
        System.out.println(startTime);
        System.out.println("");
        // Print runtime in seconds
        System.out.println("Bubble Sort runtime: " + (endTime1 - startTime1));
        System.out.println("\n");


    }
}


