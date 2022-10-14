import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

// Shuffle array
        Collections.shuffle(Arrays.asList(array));

// Print shuffled collection
        for (int i = 0; i < array.length; i++) {
            System.out.println("Shuffled array:");
            System.out.println(Arrays.toString(array));
        }

        long startTime = System.nanoTime();
        mergeSort.mergeSort(array, 0, array.length-1);
        long endTime = System.nanoTime();

// Print sorted collection
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted array:");
            System.out.println(Arrays.toString(array));
        }

        System.out.println();

// Print runtime in nanoseconds
        System.out.println("Merge Sort runtime: " + (endTime - startTime));
    }
}

