package comparator_comparable_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return  o1.getNome().compareTo(o2.getNome());
    }
}
