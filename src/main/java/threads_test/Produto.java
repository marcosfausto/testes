package threads_test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Produto {

    private Integer id;
    private String nome;
    private Integer valor;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id=").append(id);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
