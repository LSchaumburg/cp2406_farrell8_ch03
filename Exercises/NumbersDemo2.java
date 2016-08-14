import java.util.Scanner;

/**
 * Created by jc247746 on 15/08/16.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {
//        int a = scanner;
//        int b = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println();

        displayTwiceTheNumber(a,b);
        displayNumberPlusFive(a,b);
        displayNumberSquared(a,b);

    }
    public static void displayTwiceTheNumber(int a, int b){
        System.out.println("Number doubled = " + (2*a));
        System.out.println("Number doubled = " + (2*b));
        System.out.println();
    }

    public static void displayNumberPlusFive(int a, int b){
        System.out.println("Number plus 5 = " + (a+5));
        System.out.println("Number plus 5 = " + (b+5));
        System.out.println();
    }

    public static void displayNumberSquared(int a, int b){
        System.out.println("Number squared = " + (a*a));
        System.out.println("Number squared = " + (b*b));
        System.out.println();
    }
}
