package Optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable("Hello optional");

        System.out.println(optional.isPresent());
    }
}
