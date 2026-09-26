import java.util.Scanner;
public class CalculatorSwitch  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+'-> result = num1 + num2;
            case '-'-> result = num1 - num2;
            case '*'-> result = num1 * num2;
            case '/'-> result = num1 / num2;
            case '^'-> result = Math.pow(num1, num2);
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
