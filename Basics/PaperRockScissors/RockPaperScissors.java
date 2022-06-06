
//import Scanner and create main method
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {

        //initialize Scanner
        Scanner scan = new Scanner(System.in);

        //get input from user
        System.out.println("paper scissors or rock?");
        String user = scan.nextLine();

        //assign computer random choice (method) to comp
        String comp = computer();

        //assing results (method) to result
        String result = results(user, comp);

        //print input from user and computer choice
        System.out.println("\nYour choice: " + user);
        System.out.println("Computer choice: " + comp);

        //print final resut (tie, win or loss)
        System.out.println(result);
    } 

    //select random computer choice 
    public static String computer() {
        String rand;
        String[] words = {"paper", "scissors", "rock"};
        rand = words[(int) (Math.random() * words.length)];
        return rand;
    }
    //compare user and computer's inputs and assign final result
    public static String results(String user, String comp) {
        String res;
        res = "";

        if (user.equals("paper") && comp.equals("paper")) {
            res = "tie";
        } else if (user.equals("paper") && comp.equals("scissors")) {
            res = "you lost!";
        } else if (user.equals("paper") && comp.equals("rock")) {
            res = "you won!";
        } else if (user.equals("scissors") && comp.equals("scissors")) {
            res = "tie";
        } else if (user.equals("scissors") && comp.equals("paper")) {
            res = "you won!";
        } else if (user.equals("scissors") && comp.equals("rock")) {
            res = "you lost!";
        } else if (user.equals("rock") && comp.equals("rock")) {
            res = "tie";
        } else if (user.equals("rock") && comp.equals("scissors")) {
            res = "you won!";
        } else if (user.equals("rock") && comp.equals("paper")) {
            res = "you lost!";
        }

        return res;
    }
}
