import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        //شبه if statement
        switch (day) {
            case "Monday","Tuesday" ,"Wednesday", "Thursday" , "Friday" -> 
            System.out.println("It's weekday");
            case "Saturday" , "Sunday" ->
            System.out.println("It's weekend");
            //ده بقي لو هو كتب حاجه مش من ضمن الايام
            default -> System.out.println("It's not a day");
        }
                    scanner.close();
    }
    
}
