package src;

public class BogoSort {
    public static void bogoSort(double[] array) {
        while (!isSorted(array)) {
            for (int counter = 0; counter < array.length; counter++) {
                int index1 = (int) (Math.random() * array.length),
                        index2 = (int) (Math.random() * array.length);
                double tmp = array[index1];
                array[index1] = array[index2];
                array[index2] = tmp;
            }
        }
    }

    private static boolean isSorted(double[] array) {
        for (int counter = 0; counter < array.length - 1; counter++) {
            if (array[counter] > array[counter + 1]) {
                return false;
            }
        }
        return true;
    }
}
