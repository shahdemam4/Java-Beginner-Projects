import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        boolean isHeads;

        number = random.nextInt (1,6);
        System.out.println(number);
        isHeads = random.nextBoolean();
        System.out.println(isHeads);



    }
    
}
