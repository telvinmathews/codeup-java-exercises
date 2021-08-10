import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
//        Arrays.toString();
        ArraysExercises arraysExercises = new ArraysExercises();
        System.out.println(Arrays.toString(arraysExercises.numbers)); // <<< does not work as expected.
        Person[] people = new Person[3];
        people[0] = new Person("Billy");
        people[1] = new Person("Bob");
        people[2] = new Person("Tim");


    }
}
