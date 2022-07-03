package Optional;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        //Student student = StudentDataBase.studentSupplier.get();

        Student student = null;
        if(student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {

        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null);


        if(studentOptional.isPresent())
            return studentOptional.map(Student::getName); //Optional<String>

        return Optional.empty();

    }

    public static void main(String[] args) {

//        String name = getStudentName();
//
//        if(name != null)
//        System.out.println("Length of the student " + name.length());

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()) {
            System.out.println("Length of the student " + stringOptional.get().length());
        }
        
        else {
            System.out.println("Name not found");
        }


    }
}
