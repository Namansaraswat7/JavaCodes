package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String ,String > toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String ,String > toUpperCaseMethodReference = String::toUpperCase;


    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("naman"));

        System.out.println(toUpperCaseMethodReference.apply("Naman sar"));

    }

}
