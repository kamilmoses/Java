import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Getting input from user
        System.out.println("Hello! To create a multiplication table please enter your number:");
        int num = scan.nextInt();

        //calculation using for
        for (int x = 1; x <= 10; x++) {
            //result to be printed
            System.out.println(num + " * " + x + " = " + num * x);
        }
        //closing scanner
        scan.close();
    }
    
}
