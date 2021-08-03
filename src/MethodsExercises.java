public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static long multiplication(long num1, long num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("Should return 4: " +  addition(2,2));
        System.out.println("Should return 0: " +  subtraction(2,2));
        System.out.println("Should return 6: " +  multiplication(3,2));
        System.out.println("Should return 1: " +  division(3,3));

    }
}
