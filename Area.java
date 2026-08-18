import java.util.Scanner;
public class Area{
public static void main(String[] args){
        double lenth = 0;
        double width = 0;
        double Area = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length : ");
        lenth = scanner.nextDouble();
        System.out.print("Enter the width : ");
        width = scanner.nextDouble();
        Area = lenth * width;
        System.out.println("The area is : " + Area);
        scanner.close();
}

}
    

