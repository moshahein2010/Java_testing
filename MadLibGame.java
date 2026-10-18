import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective: ");
        adj1 = s.nextLine();

        System.out.print("Enter a noun(animal or person): ");
        noun1 = s.nextLine();

        System.out.print("Enter an adjective: ");
        adj2 = s.nextLine();

        System.out.print("Enter a verb with -ing: ");
        verb1 = s.nextLine();

        System.out.print("Enter am adjective: ");
        adj3 = s.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        System.out.println("hello");

        s.close();
    }
}
