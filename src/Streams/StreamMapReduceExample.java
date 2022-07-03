package Streams;

import FunctionalInterfaceExamples.Student;
import FunctionalInterfaceExamples.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel()>=3))
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b) -> a+b);
                .reduce(0,Integer::sum);

        // both reduce statements work similar
    }
    public static void main(String[] args) {

        System.out.println(noOfNotebooks());

    }
}
