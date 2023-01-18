package comparator_comparable_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserComparable implements Comparable<UserComparable>{
    private Integer id;
    private String nome;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserComparable{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(UserComparable otherUser) {
        return getNome().compareTo(otherUser.getNome());
       // return Integer.compare(getId(), otherUser.getId());
    }


}
