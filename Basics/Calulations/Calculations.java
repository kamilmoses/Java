
import java.util.Scanner;
public class Calculations {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //Getting input from user
        System.out.println("Please indicate digits and we will take care of them.");
        System.out.println("\nFirst digit: ");
        double digit1 = scan.nextDouble();
        System.out.println("\nSecond digit: ");
        double digit2 = scan.nextDouble();

        //Calculations + - * /
        double a = (digit1 + digit2);
        double b = (digit1 - digit2);
        double c = (digit1 * digit2);
        double d = (digit1 / digit2);

        System.out.println("Your digits:\nFirst digit: " + digit1 + "\nSecond digit: " + digit2);
        System.out.println("summation: " + a);
        System.out.println("subtraction: " + b);
        System.out.println("multiplication: " + c);
        System.out.println("division: " + d);

        scan.close();



    }
}

/* a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3 */