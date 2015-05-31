package pl.lodz.p.java.app.model;

public class Capacitor extends Element {

	private int c;
	private CapacityUnit unit;

	public CapacityUnit getUnit() {
		return unit;
	}

	public void setUnit(CapacityUnit unit) {
		this.unit = unit;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}	
	
	public void setC(String c) {
		this.c = Integer.parseInt(c);
	}

	public double getRealCapacity() {
		return c * unit.getMultiplier();
	}

	public Capacitor() {
		this.name = "Capacitor";
	}

	@Override
	public String toString() {
		return super.toString() + ": C=" + c + " " + unit.getSymbol() + "F";
	}
}
