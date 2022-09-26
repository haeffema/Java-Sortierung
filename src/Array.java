package src;

public class Array {
    public static double[] Zufall(int laenge) {
        double[] array = new double[laenge];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void Ausgabe(double[] array) {
        for (double entry : array) {
            System.out.println(entry);
        }
        System.out.println();
    }
}
