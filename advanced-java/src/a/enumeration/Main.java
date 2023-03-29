package a.enumeration;

public class Main {
    public static void main(String[] args) {

        System.out.println(Color.RED);
        System.out.println(Color.RED.getValue());

        Color colorBlue = Color.BLUE;

        System.out.println(colorBlue);
        System.out.println(colorBlue.getValue());

        System.out.println("Iterating throw the Enum");
        for (Color color : Color.values()) {
            System.out.println(color + "(enum value): " + color.getValue());
        }
    }
}