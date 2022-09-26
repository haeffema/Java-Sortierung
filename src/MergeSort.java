package src;

public class MergeSort {
    public static double[] mergeSort(double[] array) {
        if (array.length == 1) {
            return array;
        }
        double[] linkeListe = new double[(int) Math.floor(array.length * 0.5)];
        double[] rechteListe = new double[(int) Math.ceil(array.length * 0.5)];
        for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {
            if (durchlauf < linkeListe.length) {
                linkeListe[durchlauf] = array[durchlauf];
            } else {
                rechteListe[durchlauf - linkeListe.length] = array[durchlauf];
            }
        }
        double[] ergebnis;
        linkeListe = mergeSort(linkeListe);
        rechteListe = mergeSort(rechteListe);
        ergebnis = zusammenfuegen(linkeListe, rechteListe);
        return ergebnis;
    }

    private static double[] zusammenfuegen(double[] linkeListe, double[] rechteListe) {
        double[] ergebnis = new double[linkeListe.length + rechteListe.length];
        int linkerZaehler = 0;
        int rechterZaehler = 0;
        int ergebnisZaehler = 0;
        while (linkerZaehler < linkeListe.length || rechterZaehler < rechteListe.length) {
            if (linkerZaehler < linkeListe.length && rechterZaehler < rechteListe.length) {
                if (linkeListe[linkerZaehler] < rechteListe[rechterZaehler]) {
                    ergebnis[ergebnisZaehler] = linkeListe[linkerZaehler];
                    ergebnisZaehler++;
                    linkerZaehler++;
                } else {
                    ergebnis[ergebnisZaehler] = rechteListe[rechterZaehler];
                    ergebnisZaehler++;
                    rechterZaehler++;
                }
            } else if (linkerZaehler < linkeListe.length) {
                ergebnis[ergebnisZaehler] = linkeListe[linkerZaehler];
                linkerZaehler++;
                ergebnisZaehler++;
            } else {
                ergebnis[ergebnisZaehler] = rechteListe[rechterZaehler];
                ergebnisZaehler++;
                rechterZaehler++;
            }
        }
        return ergebnis;
    }
}
