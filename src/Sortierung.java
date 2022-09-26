package src;



public class Sortierung {

    public static void main(String[] args) {
        int laenge = 3000000;

        double[] array = Array.Zufall(laenge);

        Array.Ausgabe(array);
        double start = System.currentTimeMillis();

        // array = InsertionSort.insertionsort(array);
        // array = SelectionSort.selectionsort(array);
        // array = BubbleSort.bubblesort(array);
        // array = MergeSort.mergesort(array);
        // array = QuickSort.quicksort(array, 0, array.length-1);
        // array = BogoSort.bogosort(array);

        double dauermsec = System.currentTimeMillis() - start;
        Array.Ausgabe(array);
        src.TimeEnd.timeend(dauermsec);
    }

}
