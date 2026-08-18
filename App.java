import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("What is your GPA? : ");
        float GPA =scanner.nextFloat();
        System.out.println("Are you a student? : ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + GPA);
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
        
        scanner.close();
    }
}
