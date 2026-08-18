public class Mathematics {
    public static void main(String[] args) {
// لو عايزه اطبع قيمه الباي 3.14 اطبع  Math.PI
        System.out.println(Math.PI);
// لو عايزه اطبع قيمه الثابت 2.7 اطبع  Math.E
        System.err.println(Math.E);
// لو عايزه احسب الاوس بكتب  Math.pow(بكتب هنا الاوس , وبكتب هنا الاساس)
        double result;
        result = Math.pow(2,3);
        System.out.println(result);
// لو عايزه احسب القيمه المطلقه
        result = Math.abs(-5);
        System.out.println(result);
// لو عايزه احسب الجذر 
        result = Math.sqrt(9);
        System.out.println(result);
 //لو عندي رقم عشري وعايزه اقربه لاقرب رقم صحيح اقل منه
        result = Math.round(3.14);
        // او ده
        result = Math.floor(3.99);

        System.out.println(result);
        System.out.println(Math.floor(3.99));
// لو عندي رقم عشري عايزه اقربه لاقرب رقم صحيح اعلي منه
        result =Math.ceil(3.14);
        System.out.println(result);
// لو عندي رقمين وعايزه اشوف الmaximum بتاعهم
        result = Math.max(10, 20);
        System.out.println(result);
// لو عندي رقمين وعايزه اشوف ال minimum  بتاعهم
        result = Math.min(10, 20);
        System.out.println(result);
        // عشان احسب بقي وتر المثلث (aْ2 + bْ2)
        
    }
}
