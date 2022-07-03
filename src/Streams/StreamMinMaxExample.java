package Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
         return integerList.stream()
                //6 ->y
                //7 ->y
                //8 ->y
                //9 ->y
                //10->y
                //x variable holds the max value for each element in the iteration
                .reduce(0,(x,y) -> x>y ? x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                //6 ->y
                //7 ->y
                //8 ->y
                //9 ->y
                //10->y
                //x variable holds the max value for each element in the iteration
                .reduce((x,y) -> x>y ? x:y);
    }

    public static void main(String[] args) {

        //List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        List<Integer> integerList = new ArrayList<>();

        System.out.println(findMaxValue(integerList));

        Optional<Integer> maxValueOptional =  findMaxValueOptional(integerList);

        if(maxValueOptional.isPresent()) {
            System.out.println(maxValueOptional.get());
        }
        else {
            System.out.println("No max value found : Input list is empty");
        }
    }
}
