package src;

public class SelectionSort {
    public static void selectionSort(double[] array) {
        for (int counter = 0; counter < array.length; counter++) {
            double min = 1;
            int index = 0;
            for (int pointer = counter; pointer < array.length; pointer++) {
                if (min > array[pointer]) {
                    min = array[pointer];
                    index = pointer;
                }
            }
            double temp = array[counter];
            array[counter] = array[index];
            array[index] = temp;
        }
    }
}