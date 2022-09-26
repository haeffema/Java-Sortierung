package src;

public class QuickSort {
	
	public static double[] quicksort(double array[], int s, int e) {
		
        if (e > s) {                                                                         // Abbruchbedingung für die Rekursion wenn im Array nur noch eine Zahl steht, sobald dies der Fall ist wird das array returned
        	
            int i = s;                                                                       // Rechter Pointer
            int j = e - 1;                                                                   // Linker Pointer
            double pivotElement = array[e];                                                  // Pivot Element wird gleich dem letzten Wert im Array gesetzt
            double tmp;

            while (array[i] < pivotElement) {
            																				 // Solange das Array an der Stelle i einen kleineren Wert als das PivotElement hat, erhoeht sich der Wert von i, da das Element schon richtig platziert ist
                i++;
            }
            while (array[j] > pivotElement && j > 0) {                                       // Solange das Array an der Stelle j einen groesseren Wert hat als das Pivot verringert sich der Wert von j, da das Element schon richtig platziert war
                                                                                             // Dies wird mindestens einmal ausgefuehrt selbst wenn i groesser als j ist, wenn dann  i einen groesseren Wert gefunden hat und j einen kleineren, dann springt das Programm sofort in die Zeile in der i und das pivotElement getauscht werden.  
            	j--;                                                                  
            }
            if (i < j) {                                                                     // Wenn i kleiner j ist, werden die Werte getauscht da die Elemente beide groesser bzw. kleiner als das Pivot sind
                
            	tmp = array[i];                                                              // Temporäre Variable tmp die zum tauschen genutzt wird
                array[i] = array[j];                                                        
                
                array[j] = tmp;
            }
            
            while (i < j) {
                
                while (array[i] < pivotElement) {
                    
                	i++;
                
                }                                                                            // Solange nun i immernoch kleiner bleibt als j wird das ganze wiederholt, sodass die Werte im Array geordnet werden
                
                while (j > 0 && array[j] > pivotElement) {
                    
                	j--;
                
                }
                
                if (i < j) {
                    
                	tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                
                }
            
            }
            
            double tmp2 = 0;                                                                 // Temporäre Variable tmp2 die zum tauschen genutzt wird 
            tmp2 = array[e];
            array[e] = array[i];                                                             // Sobald i nicht mehr kleiner als j ist, wird i und das Pivot Element getauscht -> kleinere Zahlen links vom Pivotelement und groessere rechts davon
            array[i] = tmp2;
            
            quicksort(array, s, i - 1);                                                      // Funktion ruft sich selbst auf mit dem Array vom Wert S(Start) bis zum Wert des Pivots-1 und vom Pivot +1 bis zum E(Ende)
            
            quicksort(array, i + 1, e);
        
        }
        
        return array;                                                                        // Array wird zurueckgegeben
    }

}
