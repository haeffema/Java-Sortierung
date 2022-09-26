package src;

public class BubbleSort {
    public static void bubbleSort(double[] array) {
        for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    double temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }
}