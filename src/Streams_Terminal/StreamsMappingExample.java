package Streams_Terminal;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {



    public static void main(String[] args) {

        List<String> nameList =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        System.out.println(nameList);

    }

}
