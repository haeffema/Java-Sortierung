package src;

public class QuickSort {

    public static void quickSort(double[] array) {
        doQuickSort(array, 0, array.length - 1);
    }

    private static void doQuickSort(double[] array, int start, int end) {
        if (end > start) {
            int pointer_up = start;
            int pointer_down = end - 1;
            double pivotElement = array[end];
            double tmp;
            while (array[pointer_up] < pivotElement) {
                pointer_up++;
            }
            while (array[pointer_down] > pivotElement && pointer_down > 0) {
                pointer_down--;
            }
            if (pointer_up < pointer_down) {
                tmp = array[pointer_up];
                array[pointer_up] = array[pointer_down];
                array[pointer_down] = tmp;
            }
            while (pointer_up < pointer_down) {
                while (array[pointer_up] < pivotElement) {
                    pointer_up++;
                }
                while (pointer_down > 0 && array[pointer_down] > pivotElement) {
                    pointer_down--;
                }
                if (pointer_up < pointer_down) {
                    tmp = array[pointer_up];
                    array[pointer_up] = array[pointer_down];
                    array[pointer_down] = tmp;
                }
            }
            double tmp2 = array[end];
            array[end] = array[pointer_up];
            array[pointer_up] = tmp2;
            doQuickSort(array, start, pointer_up - 1);
            doQuickSort(array, pointer_up + 1, end);
        }
    }
}