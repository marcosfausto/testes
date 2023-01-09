package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        User user = new User(null);

        Optional<Integer> user2 = Optional.ofNullable(user.getId());

        System.out.println(user2);

       if(user2.isPresent()){
           System.out.println("bla");
       }

       if(user2.isEmpty()){
           System.out.println("ta empty");
       }

    }
}
