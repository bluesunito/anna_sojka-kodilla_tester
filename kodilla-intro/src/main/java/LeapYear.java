public class LeapYear {
    public static void main(String[] args) {
        int currentYear = 2026;

        if (currentYear % 4 == 0 || currentYear % 100 == 0 || currentYear % 400 == 0) {
            System.out.println("Rok przestepny");
        } else {
            System.out.println("Rok nieprzestepny");
        }
    }
}
