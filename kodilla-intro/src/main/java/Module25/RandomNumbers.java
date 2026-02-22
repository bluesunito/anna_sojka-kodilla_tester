package Module25;

import java.util.Random;

public class RandomNumbers {

    private int sum = 0;
    private int max = 0;
    private int min = 30;

    public RandomNumbers() {
        generateNumbers();
    }

    private void generateNumbers() {
        Random random = new Random();

        while (sum <= 5000) {
            int number = random.nextInt(31); // zakres 0–30

            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getSum() {
        return sum;
    }
}