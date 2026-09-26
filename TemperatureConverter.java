import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        //convert to celsius or fahrenheit ( c or f )
        // 
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Enter the unit (c or f): ");
        unit = scanner.next().toUpperCase();

        newTemp=(unit.equals("C")) ? (temp * 9/5) + 32 : (temp - 32)* 5/9;
        System.out.println(newTemp);



        scanner.close();
    }
    
}
