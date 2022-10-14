import java.util.ArrayList;

class SelectionSort {
    // https://stackabuse.com/selection-sort-in-java/
    public static void selectionSort(ArrayList<Double> nums) {
        for (int i = 0; i < nums.size(); i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) < nums.get(min)) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            double swap = nums.get(i);
            nums.set(i, nums.get(min));
            nums.set(min, swap);
        }
    }
}