package grades;

import java.util.ArrayList;

public class Student {
    //    member variables
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    //     member methods

// returns the student's name
    public String getName() {
        return this.studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
           total = total + grades.get(i);
        }
        double average = total / grades.size();
        return Math.round(average);
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> timsGrades = new ArrayList<>();
//        timsGrades.add(80);    // adding an element
//        timsGrades.add(90); // specifying an index
//        timsGrades.add(20);
//
//        Student firstStudent = new Student("Tim", timsGrades);
//        System.out.println(firstStudent.studentName + "'s " + "Grades: " + firstStudent.grades);
//        System.out.println(firstStudent.studentName + "'s " + "Average: " + firstStudent.getGradeAverage());
//        System.out.println("Tim's' new grades:");
//        firstStudent.addGrade(50);
//        System.out.println(firstStudent.grades);
//        System.out.println(firstStudent.studentName + "'s " + "New Average: " + firstStudent.getGradeAverage());
//    }

}
