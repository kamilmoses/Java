import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();
        
        System.out.println("Where are you from?");
        scan.nextLine();
        String country = scan.nextLine();

        System.out.println("Hi " + name + "! \nYou are " + age + " years old.\nYou live in " + country);
        scan.close();        
    }
}
