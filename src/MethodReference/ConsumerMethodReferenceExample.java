package MethodReference;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);

    }
}
