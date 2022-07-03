package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for( String name : names) {
            System.out.println(name);
        }
        System.out.println("Printing streams :");

        Stream<String> nameStream = names.stream();

        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println);// can iterate stream only once


    }
}
