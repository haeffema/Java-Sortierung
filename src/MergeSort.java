package src;

public class MergeSort {
	public static double[] mergesort(double array[]) {

		if (array.length == 1) {                                                             // Wenn die Array Laenge = 1 ist wird der Wert sofort zurueckgegeben weil eine Zahl sortiert ist
									 
			return array;
		}

		double[] linkeListe = new double[(int) Math.floor(array.length * 0.5)];             // Neues Array mit aufgerundet der halben Groesse vom Array wird erstellt
																				           
		double[] rechteListe = new double[(int) Math.ceil(array.length * 0.5)];             // Neues Array mit abgerundet der halben Groesse vom Array wird erstellt
																				            
		for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {                    // For-Schleife fuer Variable durchlauf
			
			if (durchlauf < linkeListe.length) {                                            // Wenn die Variable durchlauf kleiner ist als die Laenge der linkenListe, dann wird an der Stelle durchlauf in der LinkenListe der Wert aus dem Array an der Stelle durchlauf gespeichert
				
				linkeListe[durchlauf] = array[durchlauf];                               
															 
			} 
			
			else {
				
				rechteListe[durchlauf- linkeListe.length] = array[durchlauf];               // Wenn die Variable durchlauf groesser ist, dann wird an der Stelle durchlauf - die Laenge der linkenListe der Wert aus dem Array an der Stelle durchlauf gespeichert
																	 
			}                                                                               // Beispiel: Arraylaenge = 10; Durchlauf = 5; dann wird in der rechten Liste an der Stelle 5 - Laenge der linkenListe(Laenge ist in dem Fall 5), also an der Stelle 0 der Wert aus dem Array an Stelle 5 gespeichert
				 
		}
		double[] ergebnis = new double[array.length];                                       // Neues Array wird angelegt

		linkeListe = mergesort(linkeListe);                                                 // LinkeListe wird rekursiv so oft wiederholt aufgeteilt bis einzelne Zahlen uebrig bleiben
		rechteListe = mergesort(rechteListe);                                               // RechteListe wird rekursiv so oft wiederholt aufgeteilt bis einzel Zahlen uebrig bleiben
		ergebnis = zusammenfuegen(linkeListe, rechteListe);                                 // Array wird gleich der zusammengefuegten linken und rechten Liste gesetzt
		return ergebnis;
	}

	private static double[] zusammenfuegen(double[] linkeListe, double[] rechteListe) {   	// Sortierte LinkeListe und sortierte RechteListe werden nun zusammengefuegt
		
		double[] ergebnis = new double[linkeListe.length + rechteListe.length];             // Neues Array wird angelegt
		int linkerZaehler = 0;
		int rechterZaehler = 0;                                                             // Drei Variablen werden angelegt die es ermoeglichen zu bestimmen welcher Wert kleiner ist, und vor allem an welcher Stelle er gespeichert wird
		int ergebnisZaehler = 0;
		while (linkerZaehler < linkeListe.length || rechterZaehler < rechteListe.length) {  // While-Schleife sichert, dass in mindestens einer Liste Elemente sind

			if (linkerZaehler < linkeListe.length && rechterZaehler < rechteListe.length) { // if Bedingung: wenn in beiden Listen Elemente sind...
																							
				if (linkeListe[linkerZaehler] < rechteListe[rechterZaehler]) {              // ...dann wird ueberprueft ob in der linken oder in der rechten Liste dass kleinere Element ist, dieses wird dann im Ergebnis Array gespeichert
					ergebnis[ergebnisZaehler] = linkeListe[linkerZaehler];
					ergebnisZaehler++;
					linkerZaehler++;
					
				} 
				
				else {
					
					ergebnis[ergebnisZaehler] = rechteListe[rechterZaehler];                // Zaehler erhoehen sich um nicht den selben Wert zu vergleichen und um die Speicherposition im Array zu aendern (immer 1 mehr)
					ergebnisZaehler++;
					rechterZaehler++;
					
				}

			} 
			
			else if (linkerZaehler < linkeListe.length) {                                   // Ansonsten, wenn nur in der linken Listen Elemente sind dann wird der linke Wert im array gespeichert
				
				ergebnis[ergebnisZaehler] = linkeListe[linkerZaehler];
				linkerZaehler++;
				ergebnisZaehler++;            
				
			} 
			
			else if (rechterZaehler < rechteListe.length) {                                 // Ansonsten, wenn nur in der rechten Liste Elemente sind dann wird der rechte Wert in dem Array gespeichert
				
				ergebnis[ergebnisZaehler] = rechteListe[rechterZaehler];
				ergebnisZaehler++;
				rechterZaehler++;                                                            
			}

		}

		return ergebnis;                                                                    // Ergebnis wird zurueckgegeben

	}
	
}
