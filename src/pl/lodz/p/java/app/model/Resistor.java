package pl.lodz.p.java.app.model;

public class Resistor extends Element {

	private double r;
	private ResistanceUnit unit;

	public ResistanceUnit getUnit() {
		return unit;
	}

	public void setUnit(ResistanceUnit unit) {
		this.unit = unit;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
	}

	public double getRealResistance() {
		return r * unit.getMultiplier();
	}

	public Resistor() {
		// String names[] = this.getClass().getName().split(".");
		// this.name = names[names.length - 1];
		name = "Resistor";
	}

	@Override
	public String toString() {
		return super.toString() + ": R=" + r + "Ohm";
	}
}
