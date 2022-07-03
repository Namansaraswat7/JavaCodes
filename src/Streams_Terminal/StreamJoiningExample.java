package Streams_Terminal;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {

    public static String joinin1() {
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joinin2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joinin3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {

        System.out.println(joinin1());
        System.out.println(joinin2());
        System.out.println(joinin3());

    }
}
