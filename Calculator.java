import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

    if (operator == '+') {
    result = num1 + num2;
    System.out.println("Result = " + result);
    }

else if (operator == '-') {
    result = num1 - num2;
    System.out.println("Result = " + result);
}

else if (operator == '*') {
    result = num1 * num2;
    System.out.println("Result = " + result);
}

else if (operator == '/') {

    if (num2 != 0) {
        result = num1 / num2;
        System.out.println("Result = " + result);
    }

    else {
        System.out.println("Error: Cannot divide by zero.");
    }

}

else {
    System.out.println("Invalid operator.");
}
        scanner.close();
    }
}