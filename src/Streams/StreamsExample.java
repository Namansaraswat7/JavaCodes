package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamsExample {

    public static void main(String[] args) {
        // student name and activities

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek((System.out::println))
                .filter(studentPredicate) // Stream<Student>
                .peek((student -> System.out.println("After 1st filter : " + student)))
                .filter(studentGpaPredicate) // Stream<Student>
                .peek((student -> System.out.println("After 2nd filter : " + student)))
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // Map

        System.out.println(studentMap);
    }
}
