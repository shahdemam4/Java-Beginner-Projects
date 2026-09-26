import java.util.Scanner;
public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        if(username.length() <4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters");

        } else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");

        } else {
            System.out.println("Username is valid");

        }
        scanner.close();
    }
}
