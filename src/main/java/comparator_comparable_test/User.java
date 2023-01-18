package comparator_comparable_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Integer id;
    private String nome;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserComparator{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
