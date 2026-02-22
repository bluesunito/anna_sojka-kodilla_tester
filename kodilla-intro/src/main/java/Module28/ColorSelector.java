package Module28;

public class ColorSelector {
    public String getColor() {

        String letter = UserDialogs.getColorLetter();

        return switch (letter) {
            case "R" -> "RED";
            case "G" -> "GREEN";
            case "B" -> "BLUE";
            case "Y" -> "YELLOW";
            default -> "UNKNOWN COLOR";
            };
        }
}