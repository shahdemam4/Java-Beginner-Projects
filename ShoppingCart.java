import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
         //shopping cart program
        Scanner scanner = new Scanner(System.in);
        // مفروض اللي عايز يشتري (item) بسعر محدد (price) وكمية (quantity) معينة، ويدخل العملة (currency) اللي عايز يشتري بيها.

        double price = 0.0; // عشان ممكن يبقي رقم فيه كسور استخدمنا الDOUBLE
        int quantity = 0;
        char currency = '$';

        double total;
        String item;
        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.println("what is the price for each? : ");
        price = scanner.nextDouble(); // price كانت double
        System.out.println("How many would you want ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("total is: "+total + currency);
        System.out.println("You bought " + quantity + " " + item);
        System.out.println("Total = " + currency + total);
        scanner.close();

    }
   

}
