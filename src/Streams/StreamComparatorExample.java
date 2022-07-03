package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sortStudentByName() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Student sorted by list");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Students sorted by GPa");
        sortStudentByGpa().forEach(System.out::println);

    }
}
