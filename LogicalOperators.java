
public class Main {
    public static void main(String[] args) {
        // && = logical AND operator لازم الشروط كلها تتحقق عشان نطلع الاوتبوت
        // || = logical OR operator لو شرط واحد من الاتنين اتحقق الاوتبوت هيطلع
        // ! = logical NOT operator لما بحطها بعكس الجمله (قبل الجمله بحطها)
        
        double temp = -5.0;
        boolean isSunny = true;
        if (temp <=30 && temp > 25 && isSunny){
            System.out.println("The weather is good");
            System.out.println("The weather is Sunny");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }
    }





    }
