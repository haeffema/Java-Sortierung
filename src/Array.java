package src;

public class Array {
    public static double[] fillArrayRandom(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void printArray(double[] array) {
        for (double entry : array) {
            System.out.println(entry);
        }
        System.out.println();
    }
}
