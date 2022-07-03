package Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> OfNullable() {

         Optional<String> stringOptional = Optional.ofNullable("Hello");

         return  stringOptional;

    }

    public static Optional<String> Of() {

        Optional<String> stringOptional = Optional.of(""); // this method did not expect null value , it will throw null pointer exception

        return  stringOptional;

    }

    public static void main(String[] args) {

        System.out.println(OfNullable().get());
        System.out.println(Of());

    }
}
