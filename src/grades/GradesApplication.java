package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GradesApplication {


    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    public static void main(String[] args) {
        int grade = getRandomNumberUsingNextInt(0, 100);

        Student tim = new Student("Tim");
        tim.addGrade(grade);    // adding an element
        tim.addGrade(grade);    // adding an element
        tim.addGrade(grade);    // adding an element




        Student bill = new Student("Bill");
        bill.addGrade(grade);    // adding an element
        bill.addGrade(grade);    // adding an element
        bill.addGrade(grade);    // adding an element




        Student jim = new Student("Jim");
        jim.addGrade(grade);    // adding an element
        jim.addGrade(grade);    // adding an element
        jim.addGrade(grade);    // adding an element





        Student jack = new Student("Jack");
        jack.addGrade(grade);    // adding an element
        jack.addGrade(grade);    // adding an element
        jack.addGrade(grade);    // adding an element



        HashMap<String, Student> students = new HashMap<>();
        students.put("Timtyme", tim);
        students.put("JimJim", jim);
        students.put("BillWill",bill);
        students.put("JackFrost000", jack);
    }
}
