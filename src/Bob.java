import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text to talk to Bob: ");
        boolean toContinue = true;
        do {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to continue to text Bob? (y or n)?");
            String userResponse = scanner.nextLine();
            if (!userResponse.equals("y")) {
                toContinue = false;
                System.out.println("Good-Bye!");
            } else {
                System.out.println("Text to talk to Bob: ");
            }
        } while (toContinue);



    }
}
