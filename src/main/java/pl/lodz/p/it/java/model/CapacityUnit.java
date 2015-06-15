package pl.lodz.p.it.java.model;

public enum CapacityUnit {

    mili('m', 0.001), micro('u', 0.000001), nano('n', 0.000000001), pico('p', 0.000000000001);

    private char symbol;
    private double multiplier;

    public double getMultiplier() {
        return this.multiplier;
    }

    public char getSymbol() {
        return this.symbol;
    }

    private CapacityUnit(char symbol, double multiplier) {
        this.symbol = symbol;
        this.multiplier = multiplier;
    }
}
