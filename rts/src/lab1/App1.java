package lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Scanner;

@Getter
@AllArgsConstructor
class App1 {
    private final double number1;
    private final double number2;

    double add()      { return number1 + number2; }
    double subtract() { return number1 - number2; }
    double multiply() { return number1 * number2; }
    double divide()   { return number2 != 0 ? number1 / number2 : Double.NaN; }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        final double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        final double b = sc.nextDouble();

        final App1 app1 = new App1(a, b);

        System.out.println("\n--- Select Operation ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choice: ");
        final int choice = sc.nextInt();

        final double result;
        final String operation;

        switch (choice) {
            case 1 -> { result = app1.add();      operation = "+"; }
            case 2 -> { result = app1.subtract(); operation = "-"; }
            case 3 -> { result = app1.multiply(); operation = "*"; }
            case 4 -> { result = app1.divide();   operation = "/"; }
            default -> { System.out.println("Invalid option."); return; }
        }

        if (Double.isNaN(result))
            System.out.println("Error: Division by zero.");
        else
            System.out.printf("%.2f %s %.2f = %.2f%n", app1.getNumber1(), operation, app1.getNumber2(), result);

        sc.close();
    }
}