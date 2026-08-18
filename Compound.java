import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Compound Interest Calculator//
        // Compound Interest Formula: A = P(1 + r/n)^(nt)
        //ادخل ف الاول السعر الاساسي وبعدها النسبه المئويه للفايده وعدد مرات دخول الفايده خلال السنه وعدد السنوات //
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate : ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        amount = principal * Math.pow((1 + (rate / 100 / timesCompounded)), (timesCompounded * years));
        System.out.printf("The amount after %d years is: %.2f\n", years, amount);

        scanner.close();
        }
}
