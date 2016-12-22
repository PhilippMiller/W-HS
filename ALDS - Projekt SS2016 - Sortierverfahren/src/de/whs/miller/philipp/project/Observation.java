package de.whs.miller.philipp.project;

public class Observation {
	
	private long typeID;
	private long fieldSize;
	private long sortType;
	private long movements;
	private long comparisons;
	private long runTime;
	
	public Observation(long typeID, long fieldSize, long sortType) {
		this.typeID = typeID;
		this.fieldSize = fieldSize;
		this.sortType = sortType;
		
		this.movements = 0;
		this.comparisons = 0;
		this.runTime = 0;
	}
	
	/*
	 *  Getter
	 */
	
	public long getTypeID() {
		return typeID;
	}
	public long getFieldSize() {
		return fieldSize;
	}
	public long getSortType() {
		return sortType;
	}
	public long getMovements() {
		return movements;
	}
	public long getComparisons() {
		return comparisons;
	}
	public long getRunTime() {
		return runTime;
	}
	
	/*
	 * Movements
	 */
	
	public void addMovement() {
		this.movements++;
	}
	
	public void addMovement(long movements) {
		this.movements += movements;
	}
	
	/*
	 * Comparisons
	 */
	
	public void addComparisons() {
		this.comparisons++;
	}
	
	public void addComparisons(long comparisons) {
		this.comparisons += comparisons;
	}
	
	/*
	 * Run Time
	 */
	
	public void start() {
		System.out.println("Starte Messung für ID " + this.getTypeID() + " mit SortType " + this.getSortType() + " bei " + this.getFieldSize());
		this.runTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.runTime = System.currentTimeMillis() - this.runTime;
		System.out.println("Beende Messung für Typ " + this.getTypeID() + " mit SortType " + this.getSortType() + " bei " + this.getFieldSize());
	}
}
