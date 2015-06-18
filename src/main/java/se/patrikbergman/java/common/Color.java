package se.patrikbergman.java.common;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    YELLOW("Yellow"),
    PINK("Pink"),
    BROWN("Brown"),
    RED_GREEN("Red and green"),
    GREEN_YELLOW("Green and yellow");

    private final String name;

    public String getName() {
        return name;
    }

    Color(final String name) {
        this.name = name;
    }
}
