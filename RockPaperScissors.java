import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");
        int userInput = sc.nextInt();

        Random number = new Random();
        int computerInput = number.nextInt(3);
        System.out.println("Computer choice is "+computerInput);

        if (userInput==computerInput)
        {
            System.out.println("Draw");
        }
        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("Computer Win");
        }
    }
}
