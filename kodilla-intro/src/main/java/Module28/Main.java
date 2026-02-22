package Module28;

public class Main {

    public static void main(String[] args) {

        ColorSelector selector = new ColorSelector();
        String color = selector.getColor();

        System.out.println("Wybrany kolor: " + color);
    }
}
