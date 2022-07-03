package Defaults;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    public static void sortByName(List<Student> studentList) {

        System.out.println("After sort");

        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        studentList.sort(nameComparator);

        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(studentList);

        studentList.forEach(studentConsumer);

        sortByName(studentList);
    }
}
