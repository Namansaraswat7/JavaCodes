package FunctionalInterfaceExamples;

import java.util.function.Predicate;

public class PredicateExample {

    // predicate functional interace using lambda expression
    static Predicate<Integer> p = (i) -> { return i%2 == 0;}; // similar as line 10

    static Predicate<Integer> p1 = (i) -> i%2 == 0; // similar as line 8

    static Predicate<Integer> p2 = (i) -> i%5 == 0; // similar as line 8


    public static void predicateAnd() {
        System.out.println("Predicate and result is : " + p1.and(p2).test(10));//predicate chaining
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result is : " + p1.or(p2).test(8 ));//predicate chaining
    }

    public static void predicateNegate() {
        System.out.println("Predicate Negate  result is : " + p1.or(p2).negate().test(8 ));//predicate chaining
    }

    public static void main(String[] args) {


        System.out.println(p.test(4));


        System.out.println(p1.test(6));

        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
