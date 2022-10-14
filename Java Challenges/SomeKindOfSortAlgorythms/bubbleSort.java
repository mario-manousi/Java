import java.util.ArrayList;

// Java program for implementation of Bubble Sort
class bubbleSort {
    public static void bubbleSortArrayList(ArrayList<Double> list) {
        double temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}

/* This code is contributed by Rajat Mishra
* https://stackabuse.com/bubble-sort-in-java/ */