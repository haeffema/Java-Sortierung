package src;

public class InsertionSort {
    public static void insertionSort(double[] array) {
        for (int durchlauf = 1; durchlauf < array.length; durchlauf++) {
            for (int i = durchlauf; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    double temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }
}
