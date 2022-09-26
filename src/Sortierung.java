package src;

public class Sortierung {
    public static void main(String[] args) {
        int laenge = 20;
        double[] array = Array.Zufall(laenge);
        Array.Ausgabe(array);
        double start = System.currentTimeMillis();
        QuickSort.quickSort(array);
        double dauermsec = System.currentTimeMillis() - start;
        Array.Ausgabe(array);
        src.TimeEnd.timeEnd(dauermsec);
    }
}
