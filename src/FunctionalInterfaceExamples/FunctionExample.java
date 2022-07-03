package FunctionalInterfaceExamples;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> funcion = (name) -> name.toUpperCase();

    static Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println("Result is :" + funcion.apply("Naman"));

        System.out.println("Result is :" + funcion.andThen(addSomeString).apply("Naman"));

        System.out.println("Result is :" + funcion.compose(addSomeString).apply("Naman"));


    }

}
