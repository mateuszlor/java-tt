package pl.lodz.p.it.java.model;

public enum ResistanceUnit {
	kilo('k', 1000), mega('u', 1000000);
	
	private char symbol;
	private int multiplier;
	
	public int getMultiplier() {
		return this.multiplier;
	}
	
	public char getSymbol() {
		return this.symbol;
	}
	
	private ResistanceUnit(char symbol, int multiplier) {
		this.symbol = symbol;
		this.multiplier = multiplier;
	}
}
