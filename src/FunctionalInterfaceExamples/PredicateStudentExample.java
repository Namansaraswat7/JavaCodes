package FunctionalInterfaceExamples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;


    public static void filterStudentByGradeLevel() {

        System.out.println("Filter student by gradelevel :");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {
        System.out.println("Filter student by gpa :");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudent() {
        System.out.println("Filter student by gpa and grade :");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }


    public static void main(String[] args) {

        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudent();

    }
}
