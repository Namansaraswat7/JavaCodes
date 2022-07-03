package Defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        // sort the lis of names in alphabetical order

        List<String> stringList = Arrays.asList("adam", "jenny","alex","dan","mike","eric");

        //prior java 8
//        Collections.sort(stringList);
//        System.out.println(stringList);

        //java 8

        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);





    }
}
