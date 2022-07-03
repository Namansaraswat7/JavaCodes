package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static  int performMultiplication(List<Integer> integerList) {

        return integerList.stream()
                //1
                //3
                //5
                //7
                // a =1, b =1 (from stream) => result 1 is returned
                //a = 1 , b = 3 (from stream ) => result 3 is returned
                //a = 3, b = 5 (from stream) => result 15 is returned
                //a = 15, b = 7 (from stream) => result 105
                .reduce(1,(a,b) -> a*b);
    }

    public  static Optional<Student> getHighestGpaStudent() {

        return StudentDataBase.getAllStudents().stream()
                //students one by one
                .reduce((s1,s2) -> {
                        if(s1.getGpa() > s2.getGpa()) {
                            return s1;
                        }
                        else
                             return s2;
                });
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

        System.out.println(performMultiplication(integers));

        Optional<Student> studentOptional = getHighestGpaStudent();

        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }

    }
}
