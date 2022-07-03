package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public  static Optional<Student> findAnyStudent() {
         return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
                //.findAny();

    }
    public static void main(String[] args) {

        Optional<Student> studentOptional = findAnyStudent();

        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }
        else {
            System.out.println("Not able to find any student matching condition");
        }

    }
}
