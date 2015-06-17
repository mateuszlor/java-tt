package pl.lodz.p.it.java.model;

public enum ProjectStatus {

    planned("zaplanowany"), inProgress("w realizacji"), done("zrealizowany"), aborted("porzucony");

    private String text;

    public String getText() {
        return text;
    }

    private ProjectStatus(String text) {
        this.text = text;
    }
}
