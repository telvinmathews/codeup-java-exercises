import java.util.Random;
import java.util.Scanner;


public class HighLow {

    public static void main(String[] args) {
        Random random = new Random();
        long gameNumber = random.nextInt(100 - 1) + 1;
        getUserNumber(gameNumber);
    }

    public static int getUserNumber(long gameNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number! ");
        int userNumber = scanner.nextInt();
//        int userGuessCount = 0;
//        while (userGuessCount <= 5) {
        if (userNumber < gameNumber) {
            System.out.println("HIGHER");
//                userGuessCount++;
//                System.out.println("Guesses: " + userGuessCount);
            return getUserNumber(gameNumber);
        } else if (userNumber > gameNumber) {
            System.out.println("LOWER");
//                userGuessCount++;
//                System.out.println("Guesses: " + userGuessCount);
            return getUserNumber(gameNumber);
        }
        System.out.println("Good Guess!");
        return userNumber;
    }

}
