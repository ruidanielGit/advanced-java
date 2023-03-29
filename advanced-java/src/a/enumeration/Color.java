package a.enumeration;

public enum Color {

    RED("red color"), GREEN("green color"), BLUE("blue color");

    /**
     * to define the enumerations, its necessary to create a constructor,
     * but it's not needed to define the enumerations, the class can look just like this:
     * RED, GREEN, BLUE, WHITE, BLACK;
     */

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
