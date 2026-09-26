import java.util.Scanner;
public class MadLibsGame{
    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String verb1;
        String verb2;
        
        System.out.print("Enter a verb :(wash/brush) ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a noun :(job/school) ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective :(meticulous/crying) ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a verb :(asked/jog) ");
        verb2 = scanner.nextLine();
        System.out.print("Enter an adjective :(upset/happy) ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a noun :(dog/john) ");
        noun2 = scanner.nextLine();
        System.out.println("\n========== YOUR STORY ==========\n");

        System.out.println("Today I woke up and " + verb1 + " my face and went to my " + noun1 + ".");
        System.out.println("I'm very " + adjective1 + " in my work because programming requires precision.");
        System.out.println("My boss " + verb2 + " me to do my absent colleague's work, and I felt " + adjective2 + ".");
        System.out.println("However, I did his work because " + noun2 + " is also my friend and I didn't want him to get into trouble.");

        System.out.println("\nThanks for playing!");
        scanner.close();

        

    }

}
    

