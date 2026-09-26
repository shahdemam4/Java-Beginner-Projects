import java.util.Scanner;
public class EmailParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // substring(start , end)
    String email = "shahdemam2002@gmail.com";
    String username = email.substring(0, 9);
    System.out.println(username);
    String domain = email.substring(14, 23);
    System.out.println(domain);
    // وممكن اكتبها بس محطش رقمين واخليه رقم واحد هياخد من عنده لحد اخر الجمله 
    // لو انا عايزه اخليه مرن اكتر ويقبل كل انواع الايميل او الجمل عموما هحط index والحاجه اللي هيكتبها قبلها او بعدها
    System.out.print("Email: ");
    email = scanner.nextLine();
    if (email.contains("@")) {
        String username2 = email.substring(0, email.indexOf("@"));
    System.out.println("Username: " + username2);
    String domain2 = email.substring(email.indexOf("@")+1);
    System.out.println("Domain: " + domain2);
    
    }else 
{
        System.out.println("emails must contain @");
    }
    
    scanner.close();
    }
}
