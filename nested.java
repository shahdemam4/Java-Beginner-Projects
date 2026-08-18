public class nested {
    public static void main(String[] args) {
        boolean isStudent= true;
        boolean isSenior = true;
        double price = 9.99;
        if(isStudent){
            System.out.println("You are a student. You get a discount! 10%");
            //هو عمل خصم 10% على السعر الاساسي ف اللي هيتدفع هيبقي 0.9 من السعر الأساسي
            price = price * 0.9; 
        }
        else if(isSenior){
            System.out.println("You are a senior. You get a discount! 20%");
            // هو عمل خصم 20% على السعر الاساسي ف اللي هيتدفع هيبقي 0.8 من السعر الأساسي
            price = price * 0.8;
        }
        else{
            price = price*1;
        }
            System.out.printf("The price of tecket is: $%.2f", price);
    }
    
}
