package src;

public class BogoSort {
    public static void bogoSort(double[] array) {
        while (!isSorted(array)) {
            for (int i = 0; i < array.length; i++) {
                int index1 = (int) (Math.random() * array.length),
                        index2 = (int) (Math.random() * array.length);
                double a = array[index1];
                array[index1] = array[index2];
                array[index2] = a;
            }
        }
    }

    private static boolean isSorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
