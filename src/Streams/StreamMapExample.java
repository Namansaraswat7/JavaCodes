package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public  static List<String> nameList() {

       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // map

    }

    public  static Set<String> nameSet() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet()); // set

    }

    public static void main(String[] args) {

        System.out.println(nameList());
        System.out.println(nameSet());


    }
}
