import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %s", pi);
//        System.out.println("enter a integer: ");
//        int userNumber = scanner.nextInt();
//        System.out.format("Your number is %s",userNumber);

//        System.out.println("enter 3 words: ");
//        String userFirstWord = scanner.nextLine();
//        String userSecondWord = scanner.nextLine();
//        String userThirdWord = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userFirstWord);
//        System.out.println("You entered: --> \"" + userSecondWord);
//        System.out.println("You entered: --> \"" + userThirdWord);

//        System.out.println("enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("You entered %s", userSentence);

        System.out.println("enter values of length and width of a classroom at Codeup: ");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        int userL = Integer.parseInt(userLength);
        int userW = Integer.parseInt(userWidth);
        System.out.print("Area: ");
        System.out.println(userL * userW);
        System.out.print("Perimeter: ");
        System.out.println((userL * 2) + (userW * 2));
    }
}
