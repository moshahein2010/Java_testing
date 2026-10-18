import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("What is the height of the rectangle: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area);

        scanner.close();
    }
}
