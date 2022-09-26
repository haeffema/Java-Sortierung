package src;

public class BubbleSort {
    public static void bubbleSort(double[] array) {
        for (int counter = 0; counter < array.length; counter++) {
            for (int pointer = 1; pointer < array.length; pointer++) {
                if (array[pointer] < array[pointer - 1]) {
                    double temp = array[pointer];
                    array[pointer] = array[pointer - 1];
                    array[pointer - 1] = temp;
                }
            }
        }
    }
}