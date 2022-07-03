package Optional;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {

       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty

        String name = studentOptional.map(Student::getName).orElse("Default");

        return name;
    }

    public static String optionalOrElseGet() {

        // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty

        String name = studentOptional.map(Student::getName).orElseGet(() ->"Default");

        return name;
    }

    public static String optionalOrElseThrow() {

        // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty

        String name = studentOptional.map(Student::getName).orElseThrow(() ->new RuntimeException("No Data available"));

        return name;
    }

    public static void main(String[] args) {

        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}
