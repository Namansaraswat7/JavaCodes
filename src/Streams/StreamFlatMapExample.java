package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        // flatmap

        return  studentActivities;

    }

    public static long getStudentActivitiesCount() {

        long studentActivitiesCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        // flatmap

        return  studentActivitiesCount;

    }


    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());

    }
}
