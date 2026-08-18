import java.util.Scanner;
public class HYPOTENUSE {
    // عاوزني احسب قيمه وتر في مثلث
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
        
    // احسب قيمة محيط الدائره ومساحتها
        double r;
        double area;
        double circumference;
        double volume;
        System.out.println("Enter the radius");
        r = scanner.nextDouble();
        area = 2 *Math.PI * r;
        System.out.println("area is "+area);
        circumference = Math.PI *r*r;
        System.out.println("circumference is " + circumference);
        volume =Math.pow(r, 3);
        System.out.println("volume is "+volume);
        scanner.close();
    }
}
