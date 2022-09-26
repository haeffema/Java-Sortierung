package src;

public class BubbleSort {

	public static double[] bubblesort(double array[]) {

		for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {                 // For-Schleife mit Variable durchlauf wird erstellt und gleich 0 gesetzt da 0 als Basiswert benutzt wird und erhoeht sich mit jedem durchlauf bis zur Laenge des Arrays											 

			for (int i = 1; i < array.length; i++) {                                     // For-Schleife mit Variable i wird erstellt und gleich 0 gesetzt. Solange i groesser als die Arraylaenge ist vergroessert sich der Wert von i mit jedem Durchgang

				if (array[i] < array[i - 1]) {                                           // If Bedingung prueft ob das Array an der Stelle i einen kleineren Wert hat als an der Stelle i - 1

					double temp = array[i];                                              // Wenn dies der Fall ist werden die Plaetze der beiden im Array getauscht
					array[i] = array[i - 1];
					array[i - 1] = temp;

				}

			}

		}
		
		return array;																	 // Array wird zurueck gegeben
	}
	
}
