package de.whs.miller.philipp.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

	public static String observationFileName;
	
	public static void main(String[] args) {
		
		System.out.println("Bitte geben sie das Output File an: ");
		observationFileName = io.read_String();
		
		try {
			File file = new File(observationFileName + ".csv");
			if (file.exists()) {
				file.delete();
			}
		} catch (Exception e) {
		}
		
		System.out.println("");
		
		start(0, 100000); 	//   100.000 by 0
		
		start(1, 20000);	//    20.000 by 1
		start(1, 100000);	//   100.000 by 1
		start(1, 600000);	//   600.000 by 1
		
		start(2, 20000);	//    20.000 by 2
		start(2, 40000);	//    40.000 by 2
		start(2, 200000);	//   200.000 by 2
		start(2, 800000);	//   800.000 by 2
		
		start(7, 5000);		//     5.000 by 7
		start(7, 100000);	//   100.000 by 7
		start(7, 6000000);	// 6.000.000 by 7
		start(7, 10000000);	//10.000.000 by 7
		
		start(12, 5000);	//     5.000 by 12
		start(12, 600000);	//   600.000 by 12
		start(12, 10000000);//10.000.000 by 12

	}

	private static void start(int ID, int value) {

		System.out.println("Erstelle Zahlen Array 'zahlen_auf'.");
		int[] zahlen_auf = new int[value];
		for (int i = 0; i < zahlen_auf.length; i++) {
			zahlen_auf[i] = i+1;
		}
		System.out.println("Zahlen Array 'zahlen_auf'  mit " + zahlen_auf.length + " Zahlen erstellt.");
		
		System.out.println("Erstelle Zahlen Array 'zahlen_ab'.");
		int[] zahlen_ab = new int[value];
		int index = 0;
		for (int i = zahlen_ab.length; i > 0; i--) {
			zahlen_ab[index] = i+1;
			index++;
		}
		System.out.println("Zahlen Array 'zahlen_ab' mit " + zahlen_ab.length + " Zahlen erstellt.");
		
		System.out.println("Erstelle Zahlen Array 'zahlen_random'.");
		int[] zahlen_random = readFromTheRandom(value);
		System.out.println("Zahlen Array 'zahlen_random' mit " + zahlen_random.length + " Zahlen erstellt.");

		System.out.println("\n\nStarte Messungen\n");
		switch (ID) {
		case 0:
			writeToCSV(Sortierverfahren.bubbleSortNaiv(zahlen_random, 0));
			writeToCSV(Sortierverfahren.bubbleSortNaiv(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.bubbleSortNaiv(zahlen_ab, 2));
			break;
		case 1:
			writeToCSV(Sortierverfahren.bubbleSortVerbessert(zahlen_random, 0));
			writeToCSV(Sortierverfahren.bubbleSortVerbessert(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.bubbleSortVerbessert(zahlen_ab, 2));
			break;
		case 2:
			writeToCSV(Sortierverfahren.bubbleSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.bubbleSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.bubbleSort(zahlen_ab, 2));
			break;
		case 3:
			writeToCSV(Sortierverfahren.shakerSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.shakerSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.shakerSort(zahlen_ab, 2));
			break;
		case 4:
			writeToCSV(Sortierverfahren.selectionSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.selectionSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.selectionSort(zahlen_ab, 2));
			break;
		case 5:
			writeToCSV(Sortierverfahren.insertionSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.insertionSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.insertionSort(zahlen_ab, 2));
			break;
		case 6:
			writeToCSV(Sortierverfahren.binaryInsertionSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.binaryInsertionSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.binaryInsertionSort(zahlen_ab, 2));
			break;
		case 7:
			writeToCSV(Sortierverfahren.quickSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.quickSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.quickSort(zahlen_ab, 2));
			break;
		case 8:
			writeToCSV(Sortierverfahren.quickSort3(zahlen_random, 0));
			writeToCSV(Sortierverfahren.quickSort3(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.quickSort3(zahlen_ab, 2));
			break;
		case 9:
			writeToCSV(Sortierverfahren.shellSort1(zahlen_random, 0));
			writeToCSV(Sortierverfahren.shellSort1(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.shellSort1(zahlen_ab, 2));
			break;
		case 10:
			writeToCSV(Sortierverfahren.shellSort2(zahlen_random, 0));
			writeToCSV(Sortierverfahren.shellSort2(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.shellSort2(zahlen_ab, 2));
			break;
		case 11:
			writeToCSV(Sortierverfahren.shellSort3(zahlen_random, 0));
			writeToCSV(Sortierverfahren.shellSort3(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.shellSort3(zahlen_ab, 2));
			break;
		case 12:
			writeToCSV(Sortierverfahren.heapSort(zahlen_random, 0));
			writeToCSV(Sortierverfahren.heapSort(zahlen_auf, 1));
			writeToCSV(Sortierverfahren.heapSort(zahlen_ab, 2));
			break;
		}
		
	}

	private static int[] readFromTheRandom(int value) {
		int[] zahlen = new int[value];

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					Main.class.getResourceAsStream("/de/whs/miller/philipp/project/zufallszahlen.txt")));
			
			String readLine = "";
			int index = 0;
			while ((readLine = br.readLine()) != null && index < value) {
				zahlen[index] = Integer.parseInt(readLine);
				index++;
			}
		} catch (Exception e) {
			System.out.println("Es konnten keine zufallszahlen eingelesen werden!");
			System.exit(0);
		}

		return zahlen;
	}
	
	private static void writeToCSV(Observation observation) {
		File saveFile = new File(observationFileName + ".csv");
		String line = "201521591;" + observation.getTypeID() + ";" + observation.getFieldSize() + ";" + observation.getSortType() + ";" + observation.getMovements() + ";" + observation.getComparisons() + ";" + observation.getRunTime() + System.lineSeparator();
		try {
			if (!saveFile.exists())
				saveFile.createNewFile();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile, true));
			bw.write(line);
			bw.close();
			
			System.out.println(line + " zu " + saveFile.getName() + " hinzugefügt.\n\n");
			
		} catch (Exception e) {
			System.out.println("Es konnte keine .csv Datei erstellt werden!");
			System.exit(0);
		}
	}

}
