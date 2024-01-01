package Java8Features;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String email = " : narendravarma@gmail.com";
        String serv = " : Nullable Service calling";
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<Object> emailOption = Optional.of(email);
        System.out.println(emailOption);

        Optional<Object> service = Optional.ofNullable(serv);
        System.out.println(service);
    }
}
