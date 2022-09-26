package src;

public class Sortierung {
    public static void main(String[] args) {
        int laenge = 20;
        double[] array = Array.fillArrayRandom(laenge);
        Array.printArray(array);
        double start = System.currentTimeMillis();
        double dauermsec = System.currentTimeMillis() - start;
        Array.printArray(array);
        src.TimeEnd.timeEnd(dauermsec);
    }
}
