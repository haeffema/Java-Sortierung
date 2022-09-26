package src;

public class InsertionSort {
    public static void insertionSort(double[] array) {
        for (int counter = 1; counter < array.length; counter++) {
            for (int pointer = counter; pointer > 0; pointer--) {
                if (array[pointer] < array[pointer - 1]) {
                    double temp = array[pointer];
                    array[pointer] = array[pointer - 1];
                    array[pointer - 1] = temp;
                }
            }
        }
    }
}
