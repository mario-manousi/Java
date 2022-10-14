import java.util.ArrayList;

class insertionSort {
    public static void insertionSortArrayList(ArrayList<Double> list) {
        for (int j = 1; j < list.size(); j++) {
            Double current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }
    }
    //https://stackabuse.com/insertion-sort-in-java/ //
}
