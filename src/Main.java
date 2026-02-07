import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner main =  new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int guessedNumber = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have 5 attempts to guess the right number!");

        while (attempts < 5) {
            System.out.println("Guess a number between 1 and 100: ");
            guessedNumber = main.nextInt();
            attempts++;

            if  (guessedNumber == randomNumber){
                System.out.println("You guessed the number!");
                break;
            } else if (guessedNumber > randomNumber) {
                System.out.println("The number is lower");
            } else {
                System.out.println("The number is higher");
            }
        }

        if (attempts == 5 && guessedNumber != randomNumber){
            System.out.println("You didn't guess the number in 5 attempts. The right number was: " + randomNumber);
        }
    }
}