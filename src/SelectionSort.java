package src;

public class SelectionSort {
    public static double[] selectionSort(double[] array) {
        for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {
            double min = 1;
            int index = 0;
            for (int i = durchlauf; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    index = i;
                }
            }
            double temp = array[durchlauf];
            array[durchlauf] = array[index];
            array[index] = temp;
        }
        return array;
    }
}