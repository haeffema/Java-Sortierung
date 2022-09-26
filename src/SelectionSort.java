package src;

public class SelectionSort {
	public static double[] selectionsort(double array[]) {

		for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {                     //for Schleife mit der Laenge des Arrays wird erstellt und die Variable durchlauf gleich 0 gesetzt

			double min = 1;                                                                  //Die Variable fÃ¼r die Minimumssuche wird gleich 1 gesetzt
			int index = 0;																	 //Der Index, also an welcher Stelle der Minimumswert ist wird gleich 0 gesetzt also auf die erste Stelle im Array

			for (int i = durchlauf; i < array.length; i++) {                                 //Neue for Schleife mit der Variablen i gleich durchlauf fÃ¼r die Laenge des Arrays, sodass immer eine Stelle weiter hinten im Array angefangen wird

				if (min > array[i]) {														 //Die Minimussuche ob der Wert an der Stelle i kleiner als das Minimum ist

					min = array[i];                                                          //Falls die Bedingung erfÃ¼llt ist wird der Wert fÃ¼r i im Array das neue Minimum
					index = i;																 //Der Index merkt aich die Stelle, sodass dann der kleinste Wert mit dem Wert an der Stelle durchlauf vertauscht werden kann also die Werte sortiert werden

				}

			}

			double temp = array[durchlauf];													 //Die kleinste Wert wird mit dem Wert an der Stelle durchlauf vertauscht
			array[durchlauf] = array[index];
			array[index] = temp;

		}
		return array;                                                                        //Das Array wird jetzt sortiert zurÃ¼ckgegeben
	}
}
