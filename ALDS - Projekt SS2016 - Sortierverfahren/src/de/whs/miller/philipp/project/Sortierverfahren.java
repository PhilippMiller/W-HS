package de.whs.miller.philipp.project;

public class Sortierverfahren {

	// BubbleSort, naiv (ID = 0)
	// -------------------------

	public static Observation bubbleSortNaiv(int[] zahlen, int sortType) {
		Observation observ = new Observation(0, zahlen.length, sortType);
		System.out.println("Array Länge: " + zahlen.length);
		observ.start();

		long counter = 0;
		
		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen.length - 1; j++) {
				observ.addComparisons();
				if (zahlen[j] > zahlen[j + 1]) {
					int temp = zahlen[j];
					observ.addMovement();
					zahlen[j] = zahlen[j + 1];
					observ.addMovement();
					zahlen[j + 1] = temp;
					observ.addMovement();
					counter += 3;
				}
			}
		}

		observ.stop();
		System.out.println(counter);
		return observ;
	}

	// BubbleSort, verbessert (ID = 1)
	// -------------------------------

	public static Observation bubbleSortVerbessert(int[] zahlen, int sortType) {
		Observation observ = new Observation(1, zahlen.length, sortType);
		observ.start();

		for (int i = 0; i < zahlen.length; i++)
			for (int j = 0; j < zahlen.length - i - 1; j++) {
				observ.addComparisons(); // Observation
				if (zahlen[j] > zahlen[j + 1]) {
					int temp = zahlen[j];
					zahlen[j] = zahlen[j + 1];
					zahlen[j + 1] = temp;

					observ.addMovement(3); // Observation
				}
			}

		observ.stop();
		return observ;
	}

	// BubbleSort, optimiert (ID = 2)
	// ------------------------------

	public static Observation bubbleSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(2, zahlen.length, sortType);
		observ.start();

		boolean getauscht;
		int durchgang = 1;
		do {
			getauscht = false;
			for (int i = 0; i < zahlen.length - durchgang; i++) {
				observ.addComparisons();
				if (zahlen[i] > zahlen[i + 1]) {
					int temp = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temp;
					getauscht = true;

					observ.addMovement(3);
				}
			}
			durchgang++;
		} while (getauscht == true && durchgang < zahlen.length);

		observ.stop();
		return observ;
	}

	// ShakerSort (ID = 3)
	// -------------------

	public static Observation shakerSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(3, zahlen.length, sortType);
		observ.start();

		boolean vertauscht;
		int durchgang = 1;
		do {
			vertauscht = false;

			// Durchgang von rechts
			for (int i = durchgang - 1; i < zahlen.length - durchgang; i++) {
				observ.addComparisons();
				if (zahlen[i] > zahlen[i + 1]) {
					int temp = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temp;
					vertauscht = true;

					observ.addMovement(3);
				}
			}

			// Durchgang von links
			if (vertauscht) {
				vertauscht = false;
				for (int i = zahlen.length - durchgang - 2; i >= durchgang - 1; i--) {
					observ.addComparisons();
					if (zahlen[i] > zahlen[i + 1]) {
						int temp = zahlen[i];
						zahlen[i] = zahlen[i + 1];
						zahlen[i + 1] = temp;
						vertauscht = true;

						observ.addMovement(3);
					}
				}
			}
			durchgang++;
		} while (vertauscht && (durchgang <= zahlen.length / 2));

		observ.stop();
		return observ;
	}

	// SelectionSort (ID = 4)
	// ----------------------

	public static Observation selectionSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(4, zahlen.length, sortType);
		observ.start();

		for (int i = 0; i < zahlen.length; i++) {
			int min = i; // aktuelles Minimum
			for (int j = i + 1; j < zahlen.length; j++) {
				observ.addComparisons();

				if (zahlen[j] < zahlen[min])
					min = j; // neues Minimum gefunden
			}

			if (min != i) {
				int temp = zahlen[i];
				zahlen[i] = zahlen[min];
				zahlen[min] = temp;

				observ.addMovement(3);
			}
		}

		observ.stop();
		return observ;
	}

	// InsertionSort (ID = 5)
	// ----------------------

	public static Observation insertionSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(5, zahlen.length, sortType);
		observ.start();

		for (int i = 0; i < zahlen.length; i++) {
			// Bestimmen der Einfügeposition k
			int k = 0;
			while ((k < i) & (zahlen[i] >= zahlen[k])) {
				k++;
				observ.addComparisons();
			}

			if (k < i)
				observ.addComparisons();

			// Entnehmen des einzufügenden Elements
			int temp = zahlen[i];
			observ.addMovement();
			// Verschieben der Elemente zwischen k und i
			for (int j = i; j > k; j--) {
				zahlen[j] = zahlen[j - 1];
				observ.addMovement();
			}
			// Einfügen des neuen Elements an Position k
			zahlen[k] = temp;
			observ.addMovement();
		}

		observ.stop();
		return observ;
	}

	// BinaryInsertionSort (ID = 6)
	// ----------------------------

	public static Observation binaryInsertionSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(6, zahlen.length, sortType);
		observ.start();

		for (int i = 1; i < zahlen.length; i++) {
			// Bestimmen der Einfügeposition k im Bereich 0..i-1
			int k = 0, l = i - 1;
			while (k <= l) {
				int m = (k + l) / 2;
				observ.addComparisons();
				if (zahlen[i] < zahlen[m])
					l = m - 1;
				else
					k = m + 1;
			}
			// Entnehmen des einzufügenden Elements
			int temp = zahlen[i];
			observ.addMovement();
			// Verschieben der Elemente zwischen k und i
			for (int j = i; j > k; j--) {
				zahlen[j] = zahlen[j - 1];
				observ.addMovement();
			}
			// Einfügen des neuen Elements an Position k
			zahlen[k] = temp;
			observ.addMovement();
		}

		observ.stop();
		return observ;
	}

	// QuickSort ("Standard"): Vergleichselement aus der Feldmitte (ID = 7)
	// --------------------------------------------------------------------

	public static Observation quickSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(7, zahlen.length, sortType);
		observ.start();

		quickSort(0, zahlen.length - 1, zahlen, observ);

		observ.stop();
		return observ;
	}

	public static void quickSort(int uGrenze, int oGrenze, int[] zahlen, Observation observ) {
		int links = uGrenze;
		int rechts = oGrenze;
		int PivotElement = zahlen[(uGrenze + oGrenze) / 2];
		observ.addMovement();
		while (links <= rechts) {
			while (zahlen[links] < PivotElement) {
				links++;
				observ.addComparisons();
			}
			observ.addComparisons();
			while (PivotElement < zahlen[rechts]) {
				rechts--;
				observ.addComparisons();
			}
			observ.addComparisons();
			if (links <= rechts) {
				int merker = zahlen[links];
				zahlen[links] = zahlen[rechts];
				zahlen[rechts] = merker;
				links++;
				rechts--;

				observ.addMovement(3);
			}
		}
		if (uGrenze < rechts)
			quickSort(uGrenze, rechts, zahlen, observ);
		if (links < oGrenze)
			quickSort(links, oGrenze, zahlen, observ);
	}

	// QuickSort mit Dreiermedian (ID = 8)
	// -----------------------------------

	public static Observation quickSort3(int[] zahlen, int sortType) {
		Observation observ = new Observation(8, zahlen.length, sortType);
		observ.start();

		quickSort3(0, zahlen.length - 1, zahlen, observ);

		observ.stop();
		return observ;
	}

	public static void quickSort3(int uGrenze, int oGrenze, int[] zahlen, Observation observ) {
		int links = uGrenze;
		int rechts = oGrenze;

		// Bestimmung der drei Pivot-Kanidaten
		int pivot1 = zahlen[uGrenze];
		int pivot2 = zahlen[(uGrenze + oGrenze) / 2];
		int pivot3 = zahlen[oGrenze];
		observ.addMovement(3);
		// Berechnung des Dreiermedian
		int pivot;
		observ.addComparisons();
		if (pivot1 >= pivot2)
			if (pivot2 >= pivot3) {
				observ.addComparisons();
				pivot = pivot2;
				observ.addMovement();
			} else if (pivot3 >= pivot1) {
				observ.addComparisons(2);
				pivot = pivot1;
				observ.addMovement();
			} else {
				observ.addComparisons(2);
				pivot = pivot3;
				observ.addMovement();
			}
		else if (pivot1 >= pivot3) {
			observ.addComparisons();
			pivot = pivot1;
			observ.addMovement();
		} else if (pivot3 >= pivot2) {
			observ.addComparisons(2);
			pivot = pivot2;
			observ.addMovement();
		} else {
			observ.addComparisons(2);
			pivot = pivot3;
			observ.addMovement();
		}

		// und weiter wie normal...
		while (links <= rechts) {
			while (zahlen[links] < pivot) {
				links++;
				observ.addComparisons();
			}
			observ.addComparisons();
			while (pivot < zahlen[rechts]) {
				rechts--;
				observ.addComparisons();
			}
			observ.addComparisons();
			if (links <= rechts) {
				int merker = zahlen[links];
				zahlen[links] = zahlen[rechts];
				zahlen[rechts] = merker;
				links++;
				rechts--;

				observ.addMovement(3);
			}
		}
		if (uGrenze < rechts)
			quickSort3(uGrenze, rechts, zahlen, observ);
		if (links < oGrenze)
			quickSort3(links, oGrenze, zahlen, observ);
	}

	// ShellSort1 (Original nach Shell: n/2, n/4, n/8, ..., 1) (ID = 9)
	// ------------------------------------------------------------------

	public static Observation shellSort1(int[] zahlen, int sortType) {
		Observation observ = new Observation(9, zahlen.length, sortType);
		observ.start();

		int h = zahlen.length / 2;
		while (h > 0) {
			for (int i = h - 1; i < zahlen.length; i++) {
				int x = zahlen[i];
				observ.addMovement();
				int j = i;
				while ((j >= h) && (zahlen[j - h] > x)) {
					observ.addComparisons();
					zahlen[j] = zahlen[j - h];
					observ.addMovement();
					j = j - h;
				}

				observ.addComparisons();

				zahlen[j] = x;
				observ.addMovement();
			}
			h = h / 2;
		}

		observ.stop();
		return observ;
	}

	// ShellSort2 (Schrittweitenfolge ..., 63, 31, 15, 7, 3, 1) (ID = 10)
	// --------------------------------------------------------------------

	public static Observation shellSort2(int[] zahlen, int sortType) {
		Observation observ = new Observation(10, zahlen.length, sortType);
		observ.start();

		int h = 1;
		while ((h * 2 + 1) < zahlen.length) {
			h = h * 2 + 1;
		}
		while (h > 0) {
			for (int i = h - 1; i < zahlen.length; i++) {
				int x = zahlen[i];
				observ.addMovement();
				int j = i;
				while ((j >= h) && (zahlen[j - h] > x)) {
					observ.addComparisons();
					zahlen[j] = zahlen[j - h];
					observ.addMovement();
					j = j - h;
				}

				observ.addComparisons();

				zahlen[j] = x;
				observ.addMovement();
			}
			h = h / 2;
		}

		observ.stop();
		return observ;
	}

	// ShellSort3 (Schrittweitenfolge aus der Vorlesung) (ID = 11)
	// -------------------------------------------------------------

	public static Observation shellSort3(int[] zahlen, int sortType) {
		Observation observ = new Observation(11, zahlen.length, sortType);
		observ.start();

		int h = 1;
		while ((h * 3 + 1) < zahlen.length) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h - 1; i < zahlen.length; i++) {
				int x = zahlen[i];
				observ.addMovement();
				int j = i;
				while ((j >= h) && (zahlen[j - h] > x)) {
					observ.addComparisons();
					zahlen[j] = zahlen[j - h];
					observ.addMovement();
					j = j - h;
				}

				observ.addComparisons();

				zahlen[j] = x;
				observ.addMovement();
			}
			h = h / 3;
		}

		observ.stop();
		return observ;
	}

	// HeapSort (ID = 12)
	// ------------------

	public static Observation heapSort(int[] zahlen, int sortType) {
		Observation observ = new Observation(12, zahlen.length, sortType);
		observ.start();

		int n = zahlen.length;
		// Phase 1: wandle data[0 .. n-1] in Heap-Struktur um
		for (int k = n / 2; k > 0; k--)
			downheap(zahlen, k - 1, n, observ);
		// Phase 2: entnehme Elemente aus der Heap-Struktur
		do {
			// tausche data[0] mit data[n-1]
			int x = zahlen[0];
			zahlen[0] = zahlen[n - 1];
			zahlen[n - 1] = x;
			observ.addMovement(3);
			// lasse data[0] in die Heap-Struktur einsickern
			n--;
			downheap(zahlen, 0, n, observ);
		} while (n > 1);

		observ.stop();
		return observ;
	}

	static void downheap(int[] zahlen, int k, int right, Observation observ) {
		// versickere zahlen[k] in den Heap zahlen[k+1..rechts]
		int x = zahlen[k];
		observ.addMovement();

		while (k + 1 <= right / 2) // zahlen[k+1] hat linken Sohn
		{
			int j = 2 * k + 1;
			observ.addComparisons();
			if ((j + 1 < right) && (zahlen[j] < zahlen[j + 1]))
				j++;
			observ.addComparisons();
			if (x >= zahlen[j])
				break; // Halte an, Heap-Bedingung erfüllt!
			else {
				zahlen[k] = zahlen[j];
				observ.addMovement();
				k = j;
			}
		}
		zahlen[k] = x;
	}

}