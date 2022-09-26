package src;

public class QuickSort {

    public static void quickSort(double[] array) {
        doQuickSort(array, 0, array.length - 1);
    }

    public static double[] doQuickSort(double[] array, int s, int e) {
        if (e > s) {
            int i = s;
            int j = e - 1;
            double pivotElement = array[e];
            double tmp;
            while (array[i] < pivotElement) {
                i++;
            }
            while (array[j] > pivotElement && j > 0) {
                j--;
            }
            if (i < j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            while (i < j) {
                while (array[i] < pivotElement) {
                    i++;
                }
                while (j > 0 && array[j] > pivotElement) {
                    j--;
                }
                if (i < j) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            double tmp2 = array[e];
            array[e] = array[i];
            array[i] = tmp2;
            doQuickSort(array, s, i - 1);
            doQuickSort(array, i + 1, e);
        }
        return array;
    }
}