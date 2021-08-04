import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static long multiplication(long num1, long num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();
        if (userNumber < 1 || userNumber > 10) {
            return getInteger();
        }
        return userNumber;
    }


    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        int num = getInteger();
        System.out.println("Your number is: " + num);
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println("Would you like to continue? Enter: (y|n)");
        String userResponse = scanner.next();
        if (userResponse.equals("y")) {
            calculateFactorial();
        }
        System.out.println("Ok bye!");
    }

    public static void diceGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of sides for a pair of dice: ");
        int userNumber = scanner.nextInt();
        System.out.println("Roll the dice.\n");
        int dice1 = random.nextInt(userNumber - 1) + 1;
        int dice2 = random.nextInt(userNumber - 1) + 1;
        System.out.println("Dice 1 number is: " + dice1);
        System.out.println("Dice 2 number is: " + dice2);
        System.out.println("Would you like to Roll again? Enter: (y|n)");
        String userResponse = scanner.next();
        if (userResponse.equals("y")) {
            diceGame();
        }
        System.out.println("Good-bye!");
    }


    public static void main(String[] args) {
//        System.out.println("Should return 4: " +  addition(2,2));
//        System.out.println("Should return 0: " +  subtraction(2,2));
//        System.out.println("Should return 6: " +  multiplication(3,2));
//        System.out.println("Should return 1: " +  division(3,3));
//        System.out.println("Should return 0: " +  modulus(5,5));
//        calculateFactorial();
//        diceGame();
    }
}
