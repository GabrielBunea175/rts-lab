package lab1;

import java.util.Arrays;
import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        int[] numbers = generate();

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Max: " + max(numbers));
        System.out.println("Min: " + min(numbers));
    }

    static int[] generate() {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = rand.nextInt(100) + 1;
        return numbers;
    }

    static int max(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) if (n > max) max = n;
        return max;
    }

    static int min(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers) if (n < min) min = n;
        return min;
    }

}
