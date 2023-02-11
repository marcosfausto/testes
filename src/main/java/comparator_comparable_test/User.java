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
    private String sexo;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
