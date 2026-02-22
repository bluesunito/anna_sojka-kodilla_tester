package Module28;

import java.util.Scanner;
public class UserDialogs {

    public static String getColorLetter() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj pierwszą literę koloru (R-red, G-green, B-blue, Y-yellow):");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1) {
                return input;
            }

            System.out.println("Podaj tylko jedną literę.");
        }
    }

}
